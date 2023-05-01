/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import com.google.cloud.firestore.Firestore;

/**
 *
 * @author misterfocusth
 */
public abstract class Database {

    public static final String STUDENT_COLLECTION = "students";
    public static final String DOCUMENT_COLLECTION = "documents";
    public static final String QUESTION_COLLECTION = "question";
    public static Firestore db = null;

    public static Firestore getDb() {
        return db;
    }

    public static void setDb(Firestore db) {
        Database.db = db;
    }
}
