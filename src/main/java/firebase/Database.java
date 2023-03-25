/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firebase;

import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentReference;

/**
 *
 * @author misterfocusth
 */
public class Database {

    public static final String STUDENT_COLLECTION = "student";

    public static DocumentReference getDocumentReference(String collection, String document) {
        return Firebase.db.collection(collection).document(document);
    }

    public static CollectionReference getCollectionReference(String collection) {
        return Firebase.db.collection(collection);
    }

}
