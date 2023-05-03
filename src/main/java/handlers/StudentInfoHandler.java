package handlers;

import database.StudentDatabase;
import helper.StudentDataHelper;
import java.util.HashMap;
import java.util.concurrent.*;
import user.Student;

public class StudentInfoHandler {

    public static boolean handleEditStudentInfo(String studentId, HashMap<String, String> studentData) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        boolean result = false;
        try {
            Callable<Boolean> callable = () -> {
                return StudentDatabase.updateStudentInfoById(studentId, studentData);
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

    public static Student handleGetNameStudentByStudentId(String studentId) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        HashMap<String, Object> studentData = null;
        try {
            Callable<HashMap<String, Object>> callable = () -> StudentDatabase.getStudentById(studentId);
            Future<HashMap<String, Object>> future = executorService.submit(callable);
            while (!future.isDone() && !future.isCancelled()) {
                Thread.sleep(1000);
            }
            studentData = future.get();
        } catch (InterruptedException | ExecutionException ex) {
            ex.printStackTrace();
        } finally {
            executorService.shutdown();
        }

        if (studentData == null) {
            return null;
        }
        return StudentDataHelper.toStudentObj(studentData);
    }
}
