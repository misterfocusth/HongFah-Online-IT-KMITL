package handlers;

import database.StudentDatabase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.*;

public class RegisterHandler {

    public static Boolean validateUserInput(HashMap<String, String> studentData) {
        ArrayList<String> emptyList = new ArrayList<>();

        studentData.forEach((k, v) -> {
            if (v.isEmpty()) {
                emptyList.add(k);
            }
        });
        return emptyList.isEmpty();
    }

    public static boolean handlerRegister(HashMap<String, String> studentData) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        boolean result = false;
        try {
            Callable<Boolean> callable = () -> {
                return StudentDatabase.addNewStudent(studentData);
            };
            Future<Boolean> future = executorService.submit(callable);
            while (!future.isDone() && !future.isCancelled()) {
                Thread.sleep(1000);
            }
            result = future.get();
        } catch (InterruptedException | ExecutionException ex) {
            ex.printStackTrace();
        } finally {
            executorService.shutdown();
        }
        return result;
    }
}
