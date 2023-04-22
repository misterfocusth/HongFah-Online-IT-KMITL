package database;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.*;
import interfaces.AlertDialog;

import java.util.*;
import java.util.concurrent.ExecutionException;

public class DocumentDatabase extends Database {
    public synchronized boolean addNewDocument(Map<String, Object> docData, String docId) {
        DocumentReference docRef = db.collection(DOCUMENT_COLLECTION).document(docId);
        docRef.set(docData);
        return true;
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
