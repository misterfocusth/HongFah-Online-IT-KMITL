package database;

import announce.Announce;
import com.google.api.client.util.Data;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.cloud.firestore.WriteResult;
import helper.StudentDataHelper;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

public class AnnounceDatabase extends Database {

    public synchronized Announce getAnnouncement() throws ExecutionException, InterruptedException {
        DocumentReference docRef = db.collection(ANNOUNCE_COLLECTION).document("1");
        ApiFuture<DocumentSnapshot> future = docRef.get();
        DocumentSnapshot document = future.get();
        if (!document.exists()) {
            return null;
        }
        System.out.println(document.get("announceTitle"));
        System.out.println(document.get("announceBody"));
        return new Announce(
                document.getString("announceTitle"),
                document.getString("announceBody")
        );
    }

    public synchronized boolean updateAnnouncement(String announceTitle, String announceBody) {
        DocumentReference docRef = db.collection(ANNOUNCE_COLLECTION).document("1");
        Map<String, Object> data = new HashMap<>();
        data.put("announceTitle", announceTitle);
        data.put("announceBody", announceBody);
        ApiFuture<WriteResult> result = docRef.set(data);
        return true;
    }
}
