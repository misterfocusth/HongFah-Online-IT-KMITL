package database;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import static database.Database.DOCUMENT_COLLECTION;
import static database.Database.db;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class LeaveDocumentDatabase extends DocumentDatabase {

    public HashMap<String, HashMap<String, Object>> getAllDocumentsByStudentId(String studentId) throws ExecutionException, InterruptedException {
        HashMap<String, HashMap<String, Object>> documents = new HashMap<>();
        ApiFuture<QuerySnapshot> query = db.collection(DOCUMENT_COLLECTION).whereEqualTo("requestBy", studentId).whereEqualTo("documentType", 2).get();
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

    public synchronized HashMap<String, HashMap<String, Object>> getAllLeaveDoc() throws ExecutionException, InterruptedException {
        HashMap<String, HashMap<String, Object>> docData = new HashMap<>();
        ApiFuture<QuerySnapshot> query = db.collection(DOCUMENT_COLLECTION).whereEqualTo("documentType", 2).get();
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

    public synchronized HashMap<String, Object> getDocumentByDocID(String docId) throws InterruptedException, ExecutionException {
        DocumentReference docRef = db.collection(DOCUMENT_COLLECTION).document(docId);
        ApiFuture<DocumentSnapshot> future = docRef.get();
        DocumentSnapshot document = future.get();
        if (!document.exists()) {
            return null;
        }
        return (HashMap<String, Object>) document.getData();
    }

    public HashMap<String, Object> toDocDataMap(QueryDocumentSnapshot document) {
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

            String causeOfLeave = document.getString("causeOfLeave");
            String leaveTitle = document.getString("leaveTitle");
            String otherLeaveTitle = document.getString("otherLeaveTitle");
            String requestRemark = document.getString("requestRemark");
            String selectedLeaveFromDay = document.getString("selectedLeaveFromDay");
            String selectedLeaveFromMonth = document.getString("selectedLeaveFromMonth");
            String selectedLeaveFromYear = document.getString("selectedLeaveFromYear");
            String selectedLeaveUntilDay = document.getString("selectedLeaveUntilDay");
            String selectedLeaveUntilMonth = document.getString("selectedLeaveUntilMonth");
            String selectedLeaveUntilYear = document.getString("selectedLeaveUntilYear");

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
            currentDocument.put("causeOfLeave", causeOfLeave);
            currentDocument.put("leaveTitle", leaveTitle);
            currentDocument.put("otherLeaveTitle", otherLeaveTitle);
            currentDocument.put("requestRemark", requestRemark);
            currentDocument.put("selectedLeaveFromDay", selectedLeaveFromDay);
            currentDocument.put("selectedLeaveFromMonth", selectedLeaveFromMonth);
            currentDocument.put("selectedLeaveFromYear", selectedLeaveFromYear);
            currentDocument.put("selectedLeaveUntilDay", selectedLeaveUntilDay);
            currentDocument.put("selectedLeaveUntilMonth", selectedLeaveUntilMonth);
            currentDocument.put("selectedLeaveUntilYear", selectedLeaveUntilYear);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return currentDocument;
    }

}
