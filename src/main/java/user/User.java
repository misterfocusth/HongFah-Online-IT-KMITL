/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user;

/**
 * @author misterfocusth
 */
public abstract class User {

    private String username;
    private String thNameTitle, enNameTitle;
    private String thFirstName, thLastName;
    private String enFirstName, enLastName;
    private String identificationNumber;
    private String email, phoneNumber, contactAddress;
    private String dobDate, dobMonth, dobYear;
    private String gender;

    public User() {
        
    }

    public User(String username, String thNameTitle, String enNameTitle, String thFirstName, String thLastName, String enFirstName, String enLastName, String identificationNumber, String email, String phoneNumber, String contactAddress, String dobDate, String dobMonth, String dobYear, String gender) {
        this.username = username;
        this.thNameTitle = thNameTitle;
        this.enNameTitle = enNameTitle;
        this.thFirstName = thFirstName;
        this.thLastName = thLastName;
        this.enFirstName = enFirstName;
        this.enLastName = enLastName;
        this.identificationNumber = identificationNumber;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.contactAddress = contactAddress;
        this.dobDate = dobDate;
        this.dobMonth = dobMonth;
        this.dobYear = dobYear;
        this.gender = gender;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getThNameTitle() {
        return thNameTitle;
    }

    public void setThNameTitle(String thNameTitle) {
        this.thNameTitle = thNameTitle;
    }

    public String getEnNameTitle() {
        return enNameTitle;
    }

    public void setEnNameTitle(String enNameTitle) {
        this.enNameTitle = enNameTitle;
    }

    public String getThFirstName() {
        return thFirstName;
    }

    public void setThFirstName(String thFirstName) {
        this.thFirstName = thFirstName;
    }

    public String getThLastName() {
        return thLastName;
    }

    public void setThLastName(String thLastName) {
        this.thLastName = thLastName;
    }

    public String getEnFirstName() {
        return enFirstName;
    }

    public void setEnFirstName(String enFirstName) {
        this.enFirstName = enFirstName;
    }

    public String getEnLastName() {
        return enLastName;
    }

    public void setEnLastName(String enLastName) {
        this.enLastName = enLastName;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDobDate() {
        return dobDate;
    }

    public void setDobDate(String dobDate) {
        this.dobDate = dobDate;
    }

    public String getDobMonth() {
        return dobMonth;
    }

    public void setDobMonth(String dobMonth) {
        this.dobMonth = dobMonth;
    }

    public String getDobYear() {
        return dobYear;
    }

    public void setDobYear(String dobYear) {
        this.dobYear = dobYear;
    }

}
