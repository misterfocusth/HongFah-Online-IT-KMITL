package database;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

}
