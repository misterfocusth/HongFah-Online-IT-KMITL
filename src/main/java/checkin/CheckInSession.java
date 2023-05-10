/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package checkin;

/**
 *
 * @author User
 */
public class CheckInSession {

    private String sessionCode;
    private String checkInByStudentId;
    private String checkInByStudentName;
    private String subjectCreateAt;
    private String checkInAt;
    private String subjectCode;
    private String subjectName;
    private String teacherName;
    private String classTime;
    private String classroom;
    private String sessionNote;
    private boolean isActive;

    //    public CheckInSession(String sessionCode, String subjectCode, String subjectName, String teacherName, String classTime, String classroom, String sessionNote, boolean isActive) {
//        this.sessionCode = sessionCode;
//        this.subjectCode = subjectCode;
//        this.subjectName = subjectName;
//        this.teacherName = teacherName;
//        this.classTime = classTime;
//        this.classroom = classroom;
//        this.sessionNote = sessionNote;
//        this.isActive = isActive;
//    }
    public CheckInSession(String checkInByStudentId, String checkInByStudentName, String subjectCreateAt, String checkInAt, String sessionCode, String subjectCode, String subjectName, String teacherName, String classTime, String classroom, String sessionNote, boolean isActive) {
        this.checkInByStudentId = checkInByStudentId;
        this.checkInByStudentName = checkInByStudentName;
        this.subjectCreateAt = subjectCreateAt;
        this.checkInAt = checkInAt;
        this.sessionCode = sessionCode;
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
        this.teacherName = teacherName;
        this.classTime = classTime;
        this.classroom = classroom;
        this.sessionNote = sessionNote;
        this.isActive = isActive;
    }

    public String getSessionCode() {
        return sessionCode;
    }

    public void setSessionCode(String sessionCode) {
        this.sessionCode = sessionCode;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
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

    public String getCheckInAt() {
        return checkInAt;
    }

    public void setCheckInAt(String checkInAtl) {
        this.checkInAt = checkInAtl;
    }

    public String getCheckInByStudentId() {
        return checkInByStudentId;
    }

    public void setCheckInByStudentId(String checkInByStudentId) {
        this.checkInByStudentId = checkInByStudentId;
    }

    public String getCheckInByStudentName() {
        return checkInByStudentName;
    }

    public void setCheckInByStudentName(String checkInByStudentName) {
        this.checkInByStudentName = checkInByStudentName;
    }

    public String getSubjectCreatAt() {
        return subjectCreateAt;
    }

    public void setSubjectCreatAt(String subjectCreatAt) {
        this.subjectCreateAt = subjectCreatAt;
    }

}
