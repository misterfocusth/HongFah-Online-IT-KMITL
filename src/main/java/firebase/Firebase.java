/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firebase;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;
import database.Database;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;

/**
 * @author misterfocusth
 */
public class Firebase {

    public static void initFirebase() throws IOException, URISyntaxException {
        InputStream serviceAccount = new FileInputStream(new Firebase().getServiceAccount());
        GoogleCredentials credentials = GoogleCredentials.fromStream(serviceAccount);
        FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(credentials)
                .build();
        FirebaseApp.initializeApp(options);
        Database.setDb(FirestoreClient.getFirestore());
    }

    public File getServiceAccount() throws URISyntaxException {
        ClassLoader classLoader = getClass().getClassLoader();
        URL resource = classLoader.getResource("firebase/hongfah-online-it-kmitl-firebase-adminsdk-wbpdq-20d971f595.json");
        if (resource == null) {
            throw new IllegalArgumentException("File not found!" + resource.toURI());
        } else {
            return new File(resource.toURI());
        }
    }
}
