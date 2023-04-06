/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helper;

import org.springframework.security.crypto.argon2.Argon2PasswordEncoder;

import javax.swing.*;

/**
 * @author misterfocusth
 */
public class PasswordHelper {
    private static final Argon2PasswordEncoder encoder = new Argon2PasswordEncoder(32, 64, 1, 15 * 1024, 2);

    public static String encode(String password) {
        return encoder.encode(password);
    }

    public static boolean isPasswordMatches(String password, String encodedPassword) {
        return encoder.matches(password, encodedPassword);
    }

    public static String getUserTypedPassword(JPasswordField passwordField) {
        StringBuilder password = new StringBuilder();
        for (char chr : passwordField.getPassword()) {
            password.append(chr);
        }
        return password.toString();
    }
}
