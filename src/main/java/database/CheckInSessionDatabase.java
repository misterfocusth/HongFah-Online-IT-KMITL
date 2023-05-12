/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.cloud.firestore.WriteResult;
import static database.Database.db;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/**
 *
 * @author User
 */
public class CheckInSessionDatabase extends Database {

    public synchronized boolean addNewCheckInSession(Map<String, Object> checkinData, String checkinId) {
        DocumentReference docRef = db.collection(CHECKIN_COLLECTION).document(checkinId);
        docRef.set(checkinData);
        return true;
    }

    public synchronized HashMap<String, Object> getCheckInSessionByCode(String sessionID) throws ExecutionException, InterruptedException {
        DocumentReference docRef = db.collection(CHECKIN_COLLECTION).document(sessionID);
        ApiFuture<DocumentSnapshot> future = docRef.get();
        DocumentSnapshot document = future.get();
        if (!document.exists()) {
            return null;
        }
        return (HashMap<String, Object>) document.getData();
    }

    public synchronized HashMap<String, HashMap<String, Object>> getAllCheckInSessions() throws ExecutionException, InterruptedException {
        HashMap<String, HashMap<String, Object>> checkinSessionData = new HashMap<>();
        ApiFuture<QuerySnapshot> query = db.collection(CHECKIN_COLLECTION).get();
        QuerySnapshot querySnapshot = query.get();
        List<QueryDocumentSnapshot> queryDocuments = querySnapshot.getDocuments();
        try {
            for (QueryDocumentSnapshot document : queryDocuments) {
                checkinSessionData.put(document.getId(), toCheckInDataMap(document));
            }
        } catch (NullPointerException ex) {
            ex.printStackTrace();
        }
        return checkinSessionData;
    }

    public synchronized HashMap<String, Object> getChekInByChekInID(String chekinID) throws InterruptedException, ExecutionException {
        DocumentReference docRef = db.collection(CHECKIN_COLLECTION).document(chekinID);
        ApiFuture<DocumentSnapshot> future = docRef.get();
        DocumentSnapshot document = future.get();
        if (!document.exists()) {
            return null;
        }
        return (HashMap<String, Object>) document.getData();
    }
    
    

    private HashMap<String, Object> toCheckInDataMap(QueryDocumentSnapshot document) {
        HashMap<String, Object> currentDocument = new HashMap<>();
        try {
            String sessionID = document.getId();
            String subjectID = document.getString("subjectID");
            String subjectName = document.getString("subjectName");
            String teacherName = document.getString("teacherName");
            String classTime = document.getString("classTime");
            String classroom = document.getString("classroom");
            String sessionNote = document.getString("sessionNote");
            boolean isActive = document.getBoolean("isActive");

            currentDocument.put("sessionID", sessionID);
            currentDocument.put("subjectID", subjectID);
            currentDocument.put("subjectName", subjectName);
            currentDocument.put("teacherName", teacherName);
            currentDocument.put("classTime", classTime);
            currentDocument.put("classroom", classroom);
            currentDocument.put("sessionNote", subjectName);
            currentDocument.put("isActive", isActive);
        } catch (NullPointerException ex) {
            ex.printStackTrace();
        }
        return currentDocument;
    }
    
        public static synchronized boolean updateCheckinInfoById(String sessionID, HashMap<String, Object> checkInData) {
        DocumentReference docRef = db.collection("checkin").document(sessionID);
        Map<String, Object> data = new HashMap<>();
        data.put("sessionID", checkInData.get("sessionID"));
        data.put("subjectID", checkInData.get("subjectID"));
        data.put("subjectName", checkInData.get("subjectName"));
        data.put("teacherName", checkInData.get("teacherName"));
        data.put("classTime", checkInData.get("classTime"));
        data.put("classroom", checkInData.get("classroom"));
        data.put("sessionNote", checkInData.get("sessionNote"));
        data.put("isActive", checkInData.get("isActive"));
        ApiFuture<WriteResult> result = docRef.update(data);
        return true;
    }
}
