/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user;

/**
 * @author misterfocusth
 */
public class Student extends User {

    private String classYear;
    private String generation;
    private String schoolName;
    private String campusName;
    private String majorName;
    private String programName;
    private String studentId;
    
    public Student(String username, String thNameTitle, String enNameTitle, String thFirstName, String thLastName, String enFirstName, String enLastName, String identificationNumber, String email, String phoneNumber, String contactAddress, String dobDate, String dobMonth, String dobYear, String gender, String classYear, String generation, String schoolName, String campusName, String majorName, String programName, String studentId) {
        super(
                username,
                thNameTitle,
                enNameTitle,
                thFirstName,
                thLastName,
                enFirstName,
                enLastName,
                identificationNumber,
                email,
                phoneNumber,
                contactAddress,
                dobDate,
                dobMonth,
                dobYear,
                gender
        );
        this.classYear = classYear;
        this.generation = generation;
        this.schoolName = schoolName;
        this.campusName = campusName;
        this.majorName = majorName;
        this.programName = programName;
        this.studentId = studentId;
    }

    public String getClassYear() {
        return classYear;
    }

    public void setClassYear(String classYear) {
        this.classYear = classYear;
    }

    public String getGeneration() {
        return generation;
    }

    public void setGeneration(String generation) {
        this.generation = generation;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getCampusName() {
        return campusName;
    }

    public void setCampusName(String campusName) {
        this.campusName = campusName;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}
