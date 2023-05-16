/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @author misterfocusth
 */

import firebase.Firebase;
import forms.student.login.NewLoginForm;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        try {
            Firebase.initFirebase();
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        NewLoginForm newLoginForm = new NewLoginForm();
        newLoginForm.setLocationRelativeTo(null);
        newLoginForm.setVisible(true);
    }
}
