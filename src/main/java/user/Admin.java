/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user;

/**
 * @author misterfocusth
 */
public class Admin extends User {

    private String role;

    public Admin(String username, String thNameTitle, String enNameTitle, String thFirstName, String thLastName, String enFirstName, String enLastName, String identificationNumber, String email, String phoneNumber, String contactAddress, String dobDate, String dobMonth, String dobYear, String gender, String classYear, String generation, String schoolName, String campusName, String majorName, String programName, String studentId, String role) {
        super(
                username,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null
        );
        this.role = role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

}
