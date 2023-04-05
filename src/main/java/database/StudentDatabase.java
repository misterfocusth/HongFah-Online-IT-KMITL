/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.WriteResult;
import helper.StudentDataHelper;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

import static firebase.Firebase.db;

/**
 * @author misterfocusth
 */
public class StudentDatabase {

    public static synchronized HashMap<String, Object> getStudentById(String studentId) throws ExecutionException, InterruptedException {
        DocumentReference docRef = db.collection("students").document(studentId);
        ApiFuture<DocumentSnapshot> future = docRef.get();
        DocumentSnapshot document = future.get();
        if (!document.exists()) {
            return null;
        }
        return (HashMap<String, Object>) document.getData();
    }

    public static synchronized boolean addNewStudent(HashMap<String, String> studentData) {
        String studentId = studentData.get("studentId");
        DocumentReference docRef = db.collection("students").document(studentId);
        Map<String, Object> data = StudentDataHelper.toFirestoreObj(studentData);
        ApiFuture<WriteResult> result = docRef.set(data);

        System.out.println("addNewStudent Result: " + result);

        return true;
    }

    public static synchronized boolean updateStudentInfoById(String studentId, HashMap<String, String> studentData) {
        DocumentReference docRef = db.collection("students").document(studentId);
        Map<String, Object> data = StudentDataHelper.toFirestoreObj(studentData);
        Map<String, Object> test = new HashMap<>();
        test.put("studentId", "65070219");
        ApiFuture<WriteResult> result = docRef.update(test);

        System.out.println("updateStudentInfoById Student ID: " + studentId);
        System.out.println("updateStudentInfoById Result: " + result);

        return true;
    }
}
