package handlers;

import database.StudentDatabase;

import java.util.HashMap;
import java.util.concurrent.*;

public class EditStudentInfoHandler {
    public static boolean handleEditStudentInfo(String studentId, HashMap<String, String> studentData) {
        System.out.println("[Invoked]: handleEditStudentInfo");
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        boolean result = false;
        try {
            Callable<Boolean> callable = () -> {
                return StudentDatabase.updateStudentInfoById(studentId, studentData);
            };
            Future<Boolean> future = executorService.submit(callable);
            while (!future.isDone() && !future.isCancelled()) {
                System.out.println("Thread Sleep: 1000");
                Thread.sleep(1000);
            }
            System.out.println(future.get());
            result = future.get();
        } catch (InterruptedException | ExecutionException ex) {
            ex.printStackTrace();
        } finally {
            executorService.shutdown();
        }
        return result;
    }
}
