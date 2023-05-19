package handlers;

import database.AdminDatabase;
import database.StudentDatabase;
import helper.PasswordHelper;
import helper.StudentDataHelper;
import java.util.HashMap;
import java.util.concurrent.*;
import user.Admin;
import user.AuthUser;
import user.Student;

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

    public static Admin handleAdminLogin(String username, String password) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        HashMap<String, Object> adminData = null;
        try {
            Callable<HashMap<String, Object>> callable = () -> AdminDatabase.getAdminById(username);
            Future<HashMap<String, Object>> future = executorService.submit(callable);
            while (!future.isDone() && !future.isCancelled()) {
                Thread.sleep(1000);
            }
            adminData = future.get();
        } catch (InterruptedException | ExecutionException ex) {
            ex.printStackTrace();
        } finally {
            executorService.shutdown();
        }
        if (adminData == null) {
            return null;
        }
        if (password.equals(adminData.get("password"))) {
            AuthUser.setEncodedPassword((String) adminData.get("password"));
            return new Admin(username, (String) adminData.get("role"));
        } else {
            return null;
        }
    }
}
