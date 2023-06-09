package database;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.cloud.firestore.WriteResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

public class GeneralDocumentDatabase extends DocumentDatabase {

    public synchronized HashMap<String, HashMap<String, Object>> getAllDocumentsByStudentId(String studentId) throws ExecutionException, InterruptedException {
        HashMap<String, HashMap<String, Object>> documents = new HashMap<>();
        ApiFuture<QuerySnapshot> query = db.collection(DOCUMENT_COLLECTION).whereEqualTo("requestBy", studentId).whereEqualTo("documentType", 1).get();
        QuerySnapshot querySnapshot = query.get();
        List<QueryDocumentSnapshot> queryDocuments = querySnapshot.getDocuments();
        try {
            for (QueryDocumentSnapshot document : queryDocuments) {
                documents.put(document.getId(), toDocDataMap(document));
            }
        } catch (NullPointerException ex) {
            ex.printStackTrace();
        }

        return documents;
    }

    public synchronized HashMap<String, HashMap<String, Object>> getAllDocuments() throws ExecutionException, InterruptedException {
        HashMap<String, HashMap<String, Object>> docData = new HashMap<>();
        ApiFuture<QuerySnapshot> query = db.collection(DOCUMENT_COLLECTION).whereEqualTo("documentType", 1).get();
        QuerySnapshot querySnapshot = query.get();
        List<QueryDocumentSnapshot> queryDocuments = querySnapshot.getDocuments();
        try {
            for (QueryDocumentSnapshot document : queryDocuments) {
                docData.put(document.getId(), toDocDataMap(document));
            }
        } catch (NullPointerException ex) {
            ex.printStackTrace();
        }
        return docData;
    }

    public synchronized HashMap<String, Object> getDocumentById(String docId) throws InterruptedException, ExecutionException {
        DocumentReference docRef = db.collection(DOCUMENT_COLLECTION).document(docId);
        ApiFuture<DocumentSnapshot> future = docRef.get();
        DocumentSnapshot document = future.get();
        if (!document.exists()) {
            return null;
        }
        return (HashMap<String, Object>) document.getData();
    }

    private HashMap<String, Object> toDocDataMap(QueryDocumentSnapshot document) {
        HashMap<String, Object> currentDocument = new HashMap<>();
        try {
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
        } catch (NullPointerException ex) {
            ex.printStackTrace();
        }
        return currentDocument;
    }

    public static synchronized boolean updateDocumentById(String docId, HashMap<String, Object> docData) {
        DocumentReference docRef = db.collection("documents").document(docId);
        Map<String, Object> data = new HashMap<>();
        data.put("documentId", docData.get("documentId"));
        data.put("documentType", docData.get("documentType"));
        data.put("contactAddress", docData.get("contactAddress"));
        data.put("requestBody", docData.get("requestBody"));
        data.put("requestBy", docData.get("requestBy"));
        data.put("requestResponses", docData.get("requestResponses"));
        data.put("requestStatus", docData.get("requestStatus"));
        data.put("requestTitle", docData.get("requestTitle"));
        data.put("requestTo", docData.get("requestTo"));
        data.put("requestedAtDay", docData.get("requestedAtDay"));
        data.put("requestedAtMonth", docData.get("requestedAtMonth"));
        data.put("requestedAtYear", docData.get("requestedAtYear"));
        data.put("respondedAt", docData.get("respondedAt"));
        data.put("respondedBy", docData.get("respondedBy"));
        data.put("writtenAt", docData.get("writtenAt"));
        ApiFuture<WriteResult> result = docRef.update(data);
        return true;
    }

}
