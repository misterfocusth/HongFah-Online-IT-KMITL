/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firebase;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.*;
import static firebase.Firebase.db;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author misterfocusth
 */
public class Test {

    public static void main(String[] args) throws IOException, ExecutionException, InterruptedException {

        try {
            Firebase.initFirebase();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        } catch (URISyntaxException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("Hello world!");

        // Add Data
        addNewUser("Kittipon", "Thasanapreamsin", "65070021", 20, 176.00);
        addNewUser("Sila", "Pakdeewong", "65070219", 19, 175.50);
        addNewUser("Ballon", "I Here Loon", "65070021_1", 99, 999);

        // Read Data
        fetchAllStudents();
        System.out.println(" ");

        // Delete by ID
        deleteById("65070021_1");
        fetchAllStudents();
    }

    public static synchronized void addNewUser(String firstName, String lastName, String studentId, int age, double height) throws ExecutionException, InterruptedException {
        DocumentReference docRef = db.collection("user").document(studentId);
        Map<String, Object> data = new HashMap<>();
        data.put("firstName", firstName);
        data.put("lastName", lastName);
        data.put("studentId", studentId);
        data.put("age", age);
        data.put("height", height);
        ApiFuture<WriteResult> result = docRef.set(data);
        System.out.println(result.get().toString());
    }

    public static synchronized void fetchAllStudents() throws ExecutionException, InterruptedException {
        ApiFuture<QuerySnapshot> query = db.collection("user").get();
        QuerySnapshot querySnapshot = query.get();
        List<QueryDocumentSnapshot> documents = querySnapshot.getDocuments();
        int currentIdx = 1;
        for (QueryDocumentSnapshot document : documents) {
            String firstName = document.getString("firstName");
            String lastName = document.getString("lastName");
            String studentId = document.getString("studentId");
            String age = String.valueOf(document.getDouble("age"));
            String height = String.valueOf(document.getDouble("height"));
            System.out.println(currentIdx + " FirstName: " + firstName + ", LastName: " + lastName + ", Student ID: " + studentId + ", Age: " + age + ", Height: " + height);
            currentIdx++;
        }
    }

    public static synchronized void deleteById(String studentId) {
        ApiFuture<WriteResult> _writeResult = db.collection("user").document(studentId).delete();
    }
}
