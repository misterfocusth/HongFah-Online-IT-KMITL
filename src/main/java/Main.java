/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author misterfocusth
 */
import firebase.Firebase;
import forms.NewLoginForm;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, World!");

        try {
            Firebase.initFirebase();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (URISyntaxException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

        NewLoginForm newLoginForm = new NewLoginForm();
        newLoginForm.setLocationRelativeTo(null);
        newLoginForm.setVisible(true);
    }
}
