/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.WriteResult;
import user.Student;

import java.util.HashMap;
import java.util.Map;

import static firebase.Firebase.db;

/**
 * @author misterfocusth
 */
public class StudentDatabase {

    public Student getStudentById(int studentId) {
        return null;
    }

    public static synchronized boolean addNewStudent(HashMap<String, String> studentData) {
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

        DocumentReference docRef = db.collection("student").document(studentId);
        Map<String, Object> data = new HashMap<>();

        data.put("studentId", studentId);
        data.put("thNameTitle", thNameTitle);
        data.put("thFirstName", thFirstName);
        data.put("thLastName", thLastName);
        data.put("enNameTitle", enNameTitle);
        data.put("enFirstName", enFirstName);
        data.put("enLastName", enLastName);
        data.put("identificationNumber", identificationNumber);
        data.put("email", email);
        data.put("phoneNumber", phoneNumber);
        data.put("contactAddress", contactAddress);
        data.put("dobData", dobData);
        data.put("dobMonth", dobMonth);
        data.put("dobYear", dobYear);
        data.put("gender", gender);
        data.put("classYear", classYear);
        data.put("generation", generation);
        data.put("schoolName", schoolName);
        data.put("campusName", campusName);
        data.put("majorName", majorName);
        data.put("programName", programName);

        ApiFuture<WriteResult> result = docRef.set(data);

        return true;
    }
}
