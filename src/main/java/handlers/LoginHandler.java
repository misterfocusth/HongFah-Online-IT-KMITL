package handlers;

import database.StudentDatabase;
import helper.PasswordHelper;
import helper.StudentDataHelper;
import user.AuthUser;
import user.Student;

import java.util.HashMap;
import java.util.concurrent.*;

public class LoginHandler {
    public static Student handleLogin(String username, String password) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        HashMap<String, Object> studentData = null;
        try {
            Callable<HashMap<String, Object>> callable = () -> StudentDatabase.getStudentById(username);
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

        boolean isPasswordMatches = PasswordHelper.isPasswordMatches(password, (String) studentData.get("password"));

        if (isPasswordMatches) {
            AuthUser.setEncodedPassword((String) studentData.get("password"));
            return StudentDataHelper.toStudentObj(studentData);
        } else {
            return null;
        }
    }

}
