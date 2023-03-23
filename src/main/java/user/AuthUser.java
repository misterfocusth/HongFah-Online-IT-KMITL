/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user;

/**
 *
 * @author misterfocusth
 */
public class AuthUser {

    private static User authUser;

    public static User getAuthUser() {
        return authUser;
    }

    public static void setAuthUser(User AuthUser) {
        authUser = AuthUser;
    }

}
