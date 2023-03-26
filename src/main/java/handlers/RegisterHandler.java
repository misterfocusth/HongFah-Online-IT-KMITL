package handlers;

import java.util.HashMap;

public class RegisterHandler {

    public static boolean validateUserInput(HashMap<String, String> studentData) {
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
            System.out.println(k + " : " + v);
        });

        return true;
    }
}
