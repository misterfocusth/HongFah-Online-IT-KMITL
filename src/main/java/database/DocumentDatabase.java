package database;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.*;

import java.util.*;
import java.util.concurrent.ExecutionException;

public class DocumentDatabase extends Database {
    public static synchronized boolean addNewDocument(Map<String, Object> docData, String docId) {
        DocumentReference docRef = db.collection(DOCUMENT_COLLECTION).document(docId);
        docRef.set(docData);
        return true;
    }

    public static synchronized HashMap<String, HashMap<String, Object>> getAllDocumentsByStudentId(String studentId) throws ExecutionException, InterruptedException {
        HashMap<String, HashMap<String, Object>> documents = new HashMap<>();
        ApiFuture<QuerySnapshot> query = db.collection(DOCUMENT_COLLECTION).whereEqualTo("requestBy", studentId).get();
        QuerySnapshot querySnapshot = query.get();
        List<QueryDocumentSnapshot> queryDocuments = querySnapshot.getDocuments();
        try {
            for (QueryDocumentSnapshot document : queryDocuments) {
                HashMap<String, Object> currentDocument = new HashMap<>();

                String documentId = document.getId();
                Double documentType = document.getDouble("documentType");
                String contactAddress = document.getString("contactAddress");
                String requestBody = document.getString("requestBody");
                String requestBy = document.getString("requestBy");
                ArrayList<String> requestResponses = (ArrayList<String>) document.get("requestResponses");
                String requestStatus = document.getString("requestStatus");
                String requestTitle = document.getString("requestTitle");
                String requestTo = document.getString("requestTo");
                String requestedAtDay = document.getString("requestedAtDay");
                String requestedAtMonth = document.getString("requestedAtMonth");
                String requestedAtYear = document.getString("requestedAtYear");
                String respondedAt = document.getString("respondedAt");
                String respondedBy = document.getString("respondedBy");
                String writtenAt = document.getString("writtenAt");

                currentDocument.put("documentId", documentId);
                currentDocument.put("documentType", String.valueOf(documentType));
                currentDocument.put("contactAddress", contactAddress);
                currentDocument.put("requestBody", requestBody);
                currentDocument.put("requestBy", requestBy);
                currentDocument.put("requestResponses", requestResponses);
                currentDocument.put("requestStatus", requestStatus);
                currentDocument.put("requestTitle", requestTitle);
                currentDocument.put("requestTo", requestTo);
                currentDocument.put("requestedAtDay", requestedAtDay);
                currentDocument.put("requestedAtMonth", requestedAtMonth);
                currentDocument.put("requestedAtYear", requestedAtYear);
                currentDocument.put("respondedAt", respondedAt);
                currentDocument.put("respondedBy", respondedBy);
                currentDocument.put("writtenAt", writtenAt);

                documents.put(documentId, currentDocument);
            }
        } catch (NullPointerException ex) {
            ex.printStackTrace();
        }

        return documents;
    }

//    public static synchronized void getAllDocuments() {
//        ArrayList<String> documents = new ArrayList<>();
//        ApiFuture<QuerySnapshot> query = db.collection(DOCUMENT_COLLECTION).get();
//        QuerySnapshot querySnapshot = query.get();
//        List<QueryDocumentSnapshot> queryDocuments = querySnapshot.getDocuments();
//        for (QueryDocumentSnapshot document : queryDocuments) {
//            // TODO
//        }
//    }
}
