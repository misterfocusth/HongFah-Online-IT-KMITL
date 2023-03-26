package handlers;

import database.StudentDatabase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.*;

public class RegisterHandler {

    public static Boolean validateUserInput(HashMap<String, String> studentData) {
        ArrayList<String> emptyList = new ArrayList<>();

        // Personal Data
        String thNameTitle = studentData.get("thNameTitle");
        String thFirstName = studentData.get("thFirstName");
        String thLastName = studentData.get("thLastName");
        String enNameTitle = studentData.get("enNameTitle");
        String enFirstName = studentData.get("enFirstName");
        String enLastName = studentData.get("enLastName");
        String identificationNumber = studentData.get("identificationNumber");
        String email = studentData.get("email");
        String phoneNumber = studentData.get("phoneNumber");
        String contactAddress = studentData.get("contactAddress");
        String dobData = studentData.get("dobData");
        String dobMonth = studentData.get("dobMonth");
        String dobYear = studentData.get("dobYear");
        String gender = studentData.get("gender");

        // Education Data
        String studentId = studentData.get("studentId");
        String classYear = studentData.get("classYear");
        String generation = studentData.get("generation");
        String schoolName = studentData.get("schoolName");
        String campusName = studentData.get("campusName");
        String majorName = studentData.get("majorName");
        String programName = studentData.get("programName");

        studentData.forEach((k, v) -> {
            if (v.isEmpty()) {
                System.out.println("Prohibited : " + k + " is empty !");
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
