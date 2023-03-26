package handlers;

import database.StudentDatabase;
import helper.PasswordHelper;
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
            return toStudentObj(studentData);
        } else {
            return null;
        }
    }

    public static Student toStudentObj(HashMap<String, Object> studentData) {
        String username = (String) studentData.get("username");
        String thNameTitle = (String) studentData.get("thNameTitle");
        String enNameTitle = (String) studentData.get("enNameTitle");
        String thFirstName = (String) studentData.get("thFirstName");
        String thLastName = (String) studentData.get("thLastName");
        String enFirstName = (String) studentData.get("enFirstName");
        String enLastName = (String) studentData.get("enLastName");
        String identificationNumber = (String) studentData.get("identificationNumber");
        String email = (String) studentData.get("email");
        String phoneNumber = (String) studentData.get("phoneNumber");
        String contactAddress = (String) studentData.get("contactAddress");
        String dobDate = (String) studentData.get("dobDate");
        String dobMonth = (String) studentData.get("dobMonth");
        String dobYear = (String) studentData.get("dobYear");
        String gender = (String) studentData.get("gender");
        String classYear = (String) studentData.get("classYear");
        String generation = (String) studentData.get("generation");
        String schoolName = (String) studentData.get("schoolName");
        String campusName = (String) studentData.get("campusName");
        String majorName = (String) studentData.get("majorName");
        String programName = (String) studentData.get("programName");
        String studentId = (String) studentData.get("studentId");

        return new Student(
                username,
                thNameTitle,
                enNameTitle,
                thFirstName,
                thLastName,
                enFirstName,
                enLastName,
                identificationNumber,
                email,
                phoneNumber,
                contactAddress,
                dobDate,
                dobMonth,
                dobYear,
                gender,
                classYear,
                generation,
                schoolName,
                campusName,
                majorName,
                programName,
                studentId
        );
    }
}
