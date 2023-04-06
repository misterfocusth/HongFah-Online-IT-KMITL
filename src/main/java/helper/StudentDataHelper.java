package helper;

import user.Student;

import java.util.HashMap;
import java.util.Map;

public class StudentDataHelper {

    public static Map<String, Object> toFirestoreObj(HashMap<String, String> studentData) {
        Map<String, Object> firestoreObj = new HashMap<>();

        firestoreObj.put("studentId", studentData.get("studentId"));
        firestoreObj.put("thNameTitle", studentData.get("thNameTitle"));
        firestoreObj.put("thFirstName", studentData.get("thFirstName"));
        firestoreObj.put("thLastName", studentData.get("thLastName"));
        firestoreObj.put("enNameTitle", studentData.get("enNameTitle"));
        firestoreObj.put("enFirstName", studentData.get("enFirstName"));
        firestoreObj.put("enLastName", studentData.get("enLastName"));
        firestoreObj.put("identificationNumber", studentData.get("identificationNumber"));
        firestoreObj.put("email", studentData.get("email"));
        firestoreObj.put("phoneNumber", studentData.get("phoneNumber"));
        firestoreObj.put("contactAddress", studentData.get("contactAddress"));
        firestoreObj.put("dobDate", studentData.get("dobDate"));
        firestoreObj.put("dobMonth", studentData.get("dobMonth"));
        firestoreObj.put("dobYear", studentData.get("dobYear"));
        firestoreObj.put("gender", studentData.get("gender"));
        firestoreObj.put("classYear", studentData.get("classYear"));
        firestoreObj.put("generation", studentData.get("generation"));
        firestoreObj.put("schoolName", studentData.get("schoolName"));
        firestoreObj.put("campusName", studentData.get("campusName"));
        firestoreObj.put("majorName", studentData.get("majorName"));
        firestoreObj.put("programName", studentData.get("programName"));
        firestoreObj.put("username", studentData.get("username"));
        firestoreObj.put("password", studentData.get("password"));

        System.out.println(firestoreObj);

        return firestoreObj;
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
