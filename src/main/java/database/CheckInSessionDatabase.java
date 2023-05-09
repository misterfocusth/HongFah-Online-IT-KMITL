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
//import static database.Database.DOCUMENT_COLLECTION;
import static database.Database.db;
//import java.util.ArrayList;
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

    public synchronized HashMap<String, Object> getCheckInSessionByCode(String sessionCode) throws ExecutionException, InterruptedException {
        DocumentReference docRef = db.collection(CHECKIN_COLLECTION).document(sessionCode);
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
            String sessionCode = document.getId();
            String checkInByStudenCode = document.getString("checkInByStudenCode ");
            String checkInByStudenName = document.getString("checkInByStudenName ");
            String subjectCreateAt = document.getString("subjectCreateAt ");
            String checkInAt = document.getString("checkInAt");
            String subjectCode = document.getString("subjectCode");
            String subjectName = document.getString("subjectName");
            String teacherName = document.getString("teacherName");
            String classTime = document.getString("classTime");
            String place = document.getString("place");
            String sessionNote = document.getString("sessionNote");
            boolean isActive = document.getBoolean("isActive");

            currentDocument.put("sessionCode", sessionCode);
            currentDocument.put("checkInByStudenCode ", checkInByStudenCode );
            currentDocument.put("checkInByStudenName ", checkInByStudenName );
            currentDocument.put("subjectCreateAt ", subjectCreateAt );
            currentDocument.put("checkInAt", checkInAt);
            currentDocument.put("subjectCode", String.valueOf(subjectCode));
            currentDocument.put("subjectName", subjectName);
            currentDocument.put("teacherName", teacherName);
            currentDocument.put("classTime", classTime);
            currentDocument.put("place", place);
            currentDocument.put("sessionNote", sessionNote);
            currentDocument.put("isActive", isActive);
        } catch (NullPointerException ex) {
            ex.printStackTrace();
        }
        return currentDocument;
    }
}
