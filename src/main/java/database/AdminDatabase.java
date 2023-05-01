/*
 * IG : i_am_bnkt
 */
package database;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import static database.Database.db;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;

/**
 *
 * @author BNKT
 */
public class AdminDatabase extends Database {

    public static synchronized Object getStudentById(String username) throws ExecutionException, InterruptedException {
        DocumentReference docRef = db.collection("students").document(username);
        ApiFuture<DocumentSnapshot> future = docRef.get();
        DocumentSnapshot document = future.get();
        if (!document.exists()) {
            return null;
        }
        return (HashMap<String, Object>) document.getData();
    }
}
