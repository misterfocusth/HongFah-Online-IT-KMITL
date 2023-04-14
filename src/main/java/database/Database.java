/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.Firestore;
import firebase.Firebase;

/**
 *
 * @author misterfocusth
 */
public class Database {

    public static final String STUDENT_COLLECTION = "students";
    public static final String DOCUMENT_COLLECTION = "documents";
    public static Firestore db = null;

    public static Firestore getDb() {
        return db;
    }

    public static void setDb(Firestore db) {
        Database.db = db;
    }
}