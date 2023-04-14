package database;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.cloud.firestore.WriteResult;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DocumentDatabase extends Database {
    public static synchronized boolean addNewDocument(Map<String, Object> docData, String docId) {
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
