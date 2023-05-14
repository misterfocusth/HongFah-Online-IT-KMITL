/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package checkin;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class CheckInSession {

    private String sessionID;
    private String subjectID;
    private String subjectName;
    private String teacherName;
    private String classTime;
    private String classroom;
    private String sessionNote;
    private boolean isActive;

    private ArrayList<String> studentCheckIn;

    public CheckInSession(String sessionID, String subjectID, String subjectName, String teacherName, String classTime, String classroom, String sessionNote, boolean isActive, ArrayList<String> studentCheckIn) {
        this.sessionID = sessionID;
        this.subjectID = subjectID;
        this.subjectName = subjectName;
        this.teacherName = teacherName;
        this.classTime = classTime;
        this.classroom = classroom;
        this.sessionNote = sessionNote;
        this.isActive = isActive;
        this.studentCheckIn = studentCheckIn;
    }

//    }
    public String getSessionID() {
        return sessionID;
    }

    public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
    }

    public String getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(String subjectID) {
        this.subjectID = subjectID;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getClassTime() {
        return classTime;
    }

    public void setClassTime(String classTime) {
        this.classTime = classTime;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public String getSessionNote() {
        return sessionNote;
    }

    public void setSessionNote(String sessionNote) {
        this.sessionNote = sessionNote;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public ArrayList<String> getStudentCheckIn() {
        return studentCheckIn;
    }

    public void setStudentCheckIn(ArrayList<String> student) {
        this.studentCheckIn = student;
    }

}
