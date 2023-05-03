/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package forms.student.home;

import document.GeneralRequestDocument;
import document.LeaveRequestDocument;
import forms.MainForm;
import forms.student.contact.ContactStaffHomeForm;
import forms.student.document.DocRequestHistoryForm;
import forms.student.document.GeneralDocDetailForm;
import forms.student.document.GeneralDocRequestForm;
import forms.student.document.LeaveDocDetailForm;
import forms.student.document.LeaveDocRequestForm;
import forms.student.info.EditStudentInfoForm;
import forms.student.subject.CheckConfirmationForms;
import handlers.document.DocumentHandler;
import handlers.document.GeneralDocHandler;
import handlers.document.LeaveDocHandler;
import helper.FrameHelper;
import java.awt.*;
import java.util.HashMap;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import user.AuthUser;
import user.Student;

/**
 * @author misterfocusth
 */
public class NewHomeForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form NewHomeForm
     */
    public NewHomeForm() {
        initComponents();
        showStudentInfo();
        setDocumentTableData();
    }

    private void showStudentInfo() {
        Student student = (Student) AuthUser.getAuthUser();

        studentIdLabel.setText(student.getStudentId());
        identificationNumberLabel.setText(student.getIdentificationNumber());

        String thStudentFullName = student.getThFirstName() + " " + student.getThLastName();
        String enStudentFullName = student.getEnFirstName() + " " + student.getEnLastName();
        thStudentNameLabel.setText(thStudentFullName);
        enStudentNameLabel.setText(enStudentFullName);

        String dobDate = student.getDobDate();
        String dobMonth = student.getDobMonth();
        String dobYear = student.getDobYear();
        String dob = dobDate + " " + dobMonth + " " + dobYear;
        dobLabel.setText(dob);

        genderLabel.setText(student.getGender());
        schoolNameLabel.setText(student.getSchoolName());
        programName.setText(student.getProgramName());
        majorNameLabel.setText(student.getMajorName());
        classYearITGenLabel.setText(student.getClassYear() + " / " + student.getGeneration());

        emailLabel.setText(student.getEmail());
        phoneNumberLabel.setText(student.getPhoneNumber());
        addressLabel.setText(student.getContactAddress());
    }

    private void setDocumentTableData() {
        DefaultTableModel model = (DefaultTableModel) docHistoryTable.getModel();
        docHistoryTable.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 16));
        Student currentStudent = (Student) AuthUser.getAuthUser();
        HashMap<String, HashMap<String, Object>> studentDocuments = currentStudent.getDocuments();
        studentDocuments.forEach((k, v) -> {
            String documentId = (String) v.get("documentId");
            String requestedAtDay = (String) v.get("requestedAtDay");
            String requestedAtMonth = (String) v.get("requestedAtMonth");
            String requestedAtYear = (String) v.get("requestedAtYear");
            String requestedDate = requestedAtDay + " " + requestedAtMonth + " " + requestedAtYear;
            String documentTypeId = (String) v.get("documentType");
            String documentType = "NULL";
            if (documentTypeId.equals("1.0")) {
                documentType = "คำร้องทั่วไป";
            } else if (documentTypeId.equals("2.0")) {
                documentType = "คำร้องลาเรียน";
            }
            String requestStatus = (String) v.get("requestStatus");
            model.addRow(new String[]{documentId.toUpperCase(), requestedDate, documentType, requestStatus});
        });
    }

    private void refreshHomeData() {
        DefaultTableModel model = (DefaultTableModel) docHistoryTable.getModel();
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged(); // notifies the JTable that the model has changed

        docHistoryTable.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 16));
        Student currentStudent = (Student) AuthUser.getAuthUser();
        HashMap<String, HashMap<String, Object>> studentDocuments = DocumentHandler.handleGetAllDocumentsByStudentId(currentStudent.getStudentId());
        studentDocuments.forEach((k, v) -> {
            String documentId = (String) v.get("documentId");
            String requestedAtDay = (String) v.get("requestedAtDay");
            String requestedAtMonth = (String) v.get("requestedAtMonth");
            String requestedAtYear = (String) v.get("requestedAtYear");
            String requestedDate = requestedAtDay + " " + requestedAtMonth + " " + requestedAtYear;
            String documentTypeId = (String) v.get("documentType");
            String documentType = "NULL";
            if (documentTypeId.equals("1.0")) {
                documentType = "คำร้องทั่วไป";
            } else if (documentTypeId.equals("2.0")) {
                documentType = "คำร้องลาเรียน";
            }
            String requestStatus = (String) v.get("requestStatus");
            model.addRow(new String[]{documentId.toUpperCase(), requestedDate, documentType, requestStatus});
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        identificationNumberLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        studentIdLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        thStudentNameLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        enStudentNameLabel = new javax.swing.JLabel();
        dobLabel = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        schoolNameLabel = new javax.swing.JLabel();
        programName = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        majorNameLabel = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        classYearITGenLabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        phoneNumberLabel = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        docHistoryTable = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        generalReqFormMenu = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        leaveReqFormMenu = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        showDocHistoryMenu = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        refreshLabel = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        contactStaffMenu = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        classAttendMenu = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        editStudentProfileMenu = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();

        setIconifiable(true);
        setTitle("หน้าเเรก");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user/icons8-male-user-96.png"))); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ข้อมูลส่วนตัว", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13))); // NOI18N

        identificationNumberLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        identificationNumberLabel.setText("NULL");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("บัตรประจำตัวประชาชน");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("รหัสประจำตัวนักศึกษา");

        studentIdLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        studentIdLabel.setText("NULL");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("ชื่อนักศึกษา (TH)");

        thStudentNameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        thStudentNameLabel.setText("NULL");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("ชื่อนักศึกษา (EN)");

        enStudentNameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        enStudentNameLabel.setText("NULL");

        dobLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dobLabel.setText("NULL");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("วัน / เดือน / ปี เกิด");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("เพศ");

        genderLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        genderLabel.setText("NULL");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(studentIdLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(identificationNumberLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(thStudentNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(enStudentNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(dobLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(genderLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(studentIdLabel))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(identificationNumberLabel))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(thStudentNameLabel))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(enStudentNameLabel))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(dobLabel))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(genderLabel))
                .addGap(12, 12, 12))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ข้อมูลการศึกษา", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13))); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("คณะ / วิทยาลัย");

        schoolNameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        schoolNameLabel.setText("NULL");

        programName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        programName.setText("NULL");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("สาขา / วิชาเอก");

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel28.setText("เเขวงวิชา");

        majorNameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        majorNameLabel.setText("NULL");

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel30.setText("ชั้นปีที่/รุ่นที่");

        classYearITGenLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        classYearITGenLabel.setText("NULL");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(schoolNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(programName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(majorNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(classYearITGenLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(schoolNameLabel))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(programName))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(majorNameLabel))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(classYearITGenLabel))
                .addGap(12, 12, 12))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ข้อมูลในการติดต่อ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13))); // NOI18N

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("อีเมล");

        emailLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        emailLabel.setText("NULL");

        phoneNumberLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        phoneNumberLabel.setText("NULL");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setText("เบอร์โทรศัพท์");

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setText("ที่อยู่ (ที่ติดต่อได้)");

        addressLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addressLabel.setText("NULL");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(emailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(phoneNumberLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(addressLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(emailLabel))
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(phoneNumberLabel))
                .addGap(12, 12, 12)
                .addComponent(jLabel26)
                .addGap(12, 12, 12)
                .addComponent(addressLabel)
                .addGap(12, 12, 12))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 255));
        jLabel3.setText("ห้องฟ้าออนไลน์ - (HongFah Online)");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 255));
        jLabel4.setText("ระบบสารสนเทศนักศึกษา");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("ทะเบียนประวัติเเละข้อมูลนักศึกษา");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(6, 6, 6)))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel7)))
                .addGap(24, 24, 24)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        docHistoryTable.setAutoCreateRowSorter(true);
        docHistoryTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        docHistoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "เลขที่เอกสาร", "ยื่นเอกสารเมื่อ", "ประเภทเอกสาร", "สถานะเอกสาร"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        docHistoryTable.setRowHeight(35);
        docHistoryTable.setSelectionForeground(new java.awt.Color(230, 234, 237));
        docHistoryTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        docHistoryTable.setShowGrid(true);
        docHistoryTable.getTableHeader().setReorderingAllowed(false);
        docHistoryTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                docHistoryTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(docHistoryTable);
        if (docHistoryTable.getColumnModel().getColumnCount() > 0) {
            docHistoryTable.getColumnModel().getColumn(0).setResizable(false);
            docHistoryTable.getColumnModel().getColumn(1).setResizable(false);
            docHistoryTable.getColumnModel().getColumn(2).setResizable(false);
            docHistoryTable.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel5.setBackground(new java.awt.Color(242, 103, 33));
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        generalReqFormMenu.setBackground(new java.awt.Color(255, 255, 255));
        generalReqFormMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        generalReqFormMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                generalReqFormMenuMouseClicked(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home_form_icons/icons8-document-48.png"))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("เเบบฟอร์มคำร้องทั่วไป");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("คำร้องทั่วไปเพื่อให้อาจารย์ หรือเจ้าหน้าที่พิจารณา");

        javax.swing.GroupLayout generalReqFormMenuLayout = new javax.swing.GroupLayout(generalReqFormMenu);
        generalReqFormMenu.setLayout(generalReqFormMenuLayout);
        generalReqFormMenuLayout.setHorizontalGroup(
            generalReqFormMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(generalReqFormMenuLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(generalReqFormMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15))
                .addGap(12, 12, 12))
        );
        generalReqFormMenuLayout.setVerticalGroup(
            generalReqFormMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(generalReqFormMenuLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(generalReqFormMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(generalReqFormMenuLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel15))
                    .addComponent(jLabel10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        leaveReqFormMenu.setBackground(new java.awt.Color(255, 255, 255));
        leaveReqFormMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        leaveReqFormMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                leaveReqFormMenuMouseClicked(evt);
            }
        });

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home_form_icons/icons8-document-48.png"))); // NOI18N

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("เเบบฟอร์มยื่นลาเรียน");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("คำร้องลาเรียนสำหรับนักศึกษา");

        javax.swing.GroupLayout leaveReqFormMenuLayout = new javax.swing.GroupLayout(leaveReqFormMenu);
        leaveReqFormMenu.setLayout(leaveReqFormMenuLayout);
        leaveReqFormMenuLayout.setHorizontalGroup(
            leaveReqFormMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leaveReqFormMenuLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addGroup(leaveReqFormMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel20))
                .addGap(12, 12, 12))
        );
        leaveReqFormMenuLayout.setVerticalGroup(
            leaveReqFormMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leaveReqFormMenuLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(leaveReqFormMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(leaveReqFormMenuLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel20))
                    .addComponent(jLabel17))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        showDocHistoryMenu.setBackground(new java.awt.Color(255, 255, 255));
        showDocHistoryMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        showDocHistoryMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showDocHistoryMenuMouseClicked(evt);
            }
        });

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home_form_icons/icons8-documents-48 (1).png"))); // NOI18N

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setText("ประวัติการยื่นคำร้องเเละเอกสาร");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("ดูรายละเอียด สถานะ คำร้องเเละเอกสารที่ยื่น");

        javax.swing.GroupLayout showDocHistoryMenuLayout = new javax.swing.GroupLayout(showDocHistoryMenu);
        showDocHistoryMenu.setLayout(showDocHistoryMenuLayout);
        showDocHistoryMenuLayout.setHorizontalGroup(
            showDocHistoryMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showDocHistoryMenuLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel21)
                .addGap(18, 18, 18)
                .addGroup(showDocHistoryMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24))
                .addGap(12, 12, 12))
        );
        showDocHistoryMenuLayout.setVerticalGroup(
            showDocHistoryMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showDocHistoryMenuLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(showDocHistoryMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(showDocHistoryMenuLayout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel24))
                    .addComponent(jLabel21))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(generalReqFormMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(leaveReqFormMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(showDocHistoryMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(generalReqFormMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(leaveReqFormMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(showDocHistoryMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        refreshLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-reset-48.png"))); // NOI18N
        refreshLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(refreshLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(refreshLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        contactStaffMenu.setBackground(new java.awt.Color(255, 255, 255));
        contactStaffMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        contactStaffMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contactStaffMenuMouseClicked(evt);
            }
        });

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home_form_icons/icons8-faq-48 (1).png"))); // NOI18N

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setText("ติดต่อห้องฟ้าออนไลน์");

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel31.setText("ช่องทางการติดต่อ เเละถาม-ตอบห้องฟ้า");

        javax.swing.GroupLayout contactStaffMenuLayout = new javax.swing.GroupLayout(contactStaffMenu);
        contactStaffMenu.setLayout(contactStaffMenuLayout);
        contactStaffMenuLayout.setHorizontalGroup(
            contactStaffMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contactStaffMenuLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel27)
                .addGap(18, 18, 18)
                .addGroup(contactStaffMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addComponent(jLabel31))
                .addGap(12, 12, 12))
        );
        contactStaffMenuLayout.setVerticalGroup(
            contactStaffMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contactStaffMenuLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(contactStaffMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(contactStaffMenuLayout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel31))
                    .addComponent(jLabel27))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        classAttendMenu.setBackground(new java.awt.Color(255, 255, 255));
        classAttendMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        classAttendMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                classAttendMenuMouseClicked(evt);
            }
        });

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home_form_icons/icons8-today-48.png"))); // NOI18N

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel33.setText("ระบบเช็คชื่อเข้าชั้นเรียน");

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel34.setText("เช็คชื่อเเละบันทึกเวลาการเข้าเรียน");

        javax.swing.GroupLayout classAttendMenuLayout = new javax.swing.GroupLayout(classAttendMenu);
        classAttendMenu.setLayout(classAttendMenuLayout);
        classAttendMenuLayout.setHorizontalGroup(
            classAttendMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(classAttendMenuLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel32)
                .addGap(18, 18, 18)
                .addGroup(classAttendMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33)
                    .addComponent(jLabel34))
                .addGap(12, 12, 12))
        );
        classAttendMenuLayout.setVerticalGroup(
            classAttendMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(classAttendMenuLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(classAttendMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(classAttendMenuLayout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel34))
                    .addComponent(jLabel32))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        editStudentProfileMenu.setBackground(new java.awt.Color(255, 255, 255));
        editStudentProfileMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        editStudentProfileMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editStudentProfileMenuMouseClicked(evt);
            }
        });

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home_form_icons/icons8-edit-property-48.png"))); // NOI18N

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel36.setText("เเก้ไขข้อมูลนักศึกษา");

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel37.setText("เเก้ไขข้อมูลทะเบียนประวัตินักศึกษา");

        javax.swing.GroupLayout editStudentProfileMenuLayout = new javax.swing.GroupLayout(editStudentProfileMenu);
        editStudentProfileMenu.setLayout(editStudentProfileMenuLayout);
        editStudentProfileMenuLayout.setHorizontalGroup(
            editStudentProfileMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editStudentProfileMenuLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel35)
                .addGap(18, 18, 18)
                .addGroup(editStudentProfileMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36)
                    .addComponent(jLabel37))
                .addGap(12, 12, 12))
        );
        editStudentProfileMenuLayout.setVerticalGroup(
            editStudentProfileMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editStudentProfileMenuLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(editStudentProfileMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(editStudentProfileMenuLayout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel37))
                    .addComponent(jLabel35))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(contactStaffMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(classAttendMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editStudentProfileMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(contactStaffMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(classAttendMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(editStudentProfileMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("ตรวจสอบสถานะ รายละเอียดเเละประวัติการยื่นคำร้องเเละเอกสาร (ต้องการดูเพิ่มเติม โปรดไปยังหน้าประวัติการยื่นคำร้อง ...)");

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel38.setText("ประวัติการยื่นคำร้องเเละเอกสารล่าสุด");

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel39.setText("บริการนักศึกษาของห้องฟ้าออนไลน์");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel38)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel39))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel39)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(jLabel38)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(506, 506, 506)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void docHistoryTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_docHistoryTableMouseClicked
        // TODO add your handling code here:
        JTable target = (JTable) evt.getSource();
        int selectedRow = target.getSelectedRow();
        String selectedDocId = (String) docHistoryTable.getValueAt(selectedRow, 0);
        String selectedDocType = (String) docHistoryTable.getValueAt(selectedRow, 2);
        System.out.println(selectedDocType);
        if (selectedDocType == "คำร้องทั่วไป") {
            GeneralRequestDocument docDetail = GeneralDocHandler.handleGetDocumentById(selectedDocId);
            GeneralDocDetailForm generalDocDetailForm = new GeneralDocDetailForm(docDetail);
            FrameHelper.setLocationToCenter(generalDocDetailForm);
            MainForm.mainDesktopPane.add(generalDocDetailForm);
            generalDocDetailForm.setVisible(true);
        } else if (selectedDocType == "คำร้องลาเรียน") {
            LeaveRequestDocument docDetail = LeaveDocHandler.handleGetLeaveDocumentById(selectedDocId);
            LeaveDocDetailForm leaveDocDetailForm = new LeaveDocDetailForm(docDetail);
            FrameHelper.setLocationToCenter(leaveDocDetailForm);
            MainForm.mainDesktopPane.add(leaveDocDetailForm);
            leaveDocDetailForm.setVisible(true);
        }
    }//GEN-LAST:event_docHistoryTableMouseClicked

    private void editStudentProfileMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editStudentProfileMenuMouseClicked
        // TODO add your handling code here:
        EditStudentInfoForm editStudentInfoForm = new EditStudentInfoForm();
        FrameHelper.setLocationToCenter(editStudentInfoForm);
        MainForm.mainDesktopPane.add(editStudentInfoForm);
        editStudentInfoForm.setVisible(true);

    }//GEN-LAST:event_editStudentProfileMenuMouseClicked

    private void showDocHistoryMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showDocHistoryMenuMouseClicked
        // TODO add your handling code here:
        DocRequestHistoryForm docRequestHistoryForm = new DocRequestHistoryForm();
        FrameHelper.setLocationToCenter(docRequestHistoryForm);
        MainForm.mainDesktopPane.add(docRequestHistoryForm);
        docRequestHistoryForm.setVisible(true);
    }//GEN-LAST:event_showDocHistoryMenuMouseClicked

    private void generalReqFormMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generalReqFormMenuMouseClicked
        // TODO add your handling code here:
        GeneralDocRequestForm generalDocRequestForm = new GeneralDocRequestForm();
        FrameHelper.setLocationToCenter(generalDocRequestForm);
        MainForm.mainDesktopPane.add(generalDocRequestForm);
        generalDocRequestForm.setVisible(true);
    }//GEN-LAST:event_generalReqFormMenuMouseClicked

    private void leaveReqFormMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leaveReqFormMenuMouseClicked
        LeaveDocRequestForm leaveDocRequestForm = new LeaveDocRequestForm();
        FrameHelper.setLocationToCenter(leaveDocRequestForm);
        MainForm.mainDesktopPane.add(leaveDocRequestForm);
        leaveDocRequestForm.setVisible(true);
    }//GEN-LAST:event_leaveReqFormMenuMouseClicked

    private void contactStaffMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactStaffMenuMouseClicked
        ContactStaffHomeForm contactStaffHomeForm = new ContactStaffHomeForm();
        FrameHelper.setLocationToCenter(contactStaffHomeForm);
        MainForm.mainDesktopPane.add(contactStaffHomeForm);
        contactStaffHomeForm.setVisible(true);
    }//GEN-LAST:event_contactStaffMenuMouseClicked

    private void refreshLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshLabelMouseClicked
        refreshHomeData();
    }//GEN-LAST:event_refreshLabelMouseClicked

    private void classAttendMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_classAttendMenuMouseClicked
        CheckConfirmationForms checkConfirmationForms = new CheckConfirmationForms();
        FrameHelper.setLocationToCenter(checkConfirmationForms);
        MainForm.mainDesktopPane.add(checkConfirmationForms);
        checkConfirmationForms.setVisible(true);
    }//GEN-LAST:event_classAttendMenuMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLabel;
    private javax.swing.JPanel classAttendMenu;
    private javax.swing.JLabel classYearITGenLabel;
    private javax.swing.JPanel contactStaffMenu;
    private javax.swing.JLabel dobLabel;
    private javax.swing.JTable docHistoryTable;
    private javax.swing.JPanel editStudentProfileMenu;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel enStudentNameLabel;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JPanel generalReqFormMenu;
    private javax.swing.JLabel identificationNumberLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel leaveReqFormMenu;
    private javax.swing.JLabel majorNameLabel;
    private javax.swing.JLabel phoneNumberLabel;
    private javax.swing.JLabel programName;
    private javax.swing.JLabel refreshLabel;
    private javax.swing.JLabel schoolNameLabel;
    private javax.swing.JPanel showDocHistoryMenu;
    private javax.swing.JLabel studentIdLabel;
    private javax.swing.JLabel thStudentNameLabel;
    // End of variables declaration//GEN-END:variables
}
