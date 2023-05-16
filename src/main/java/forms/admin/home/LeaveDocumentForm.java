/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package forms.admin.home;

import dialog.InfoDialog;
import document.LeaveRequestDocument;
import handlers.document.LeaveDocHandler;
import user.Admin;
import user.AuthUser;
import user.Student;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author pangggg
 */
public class LeaveDocumentForm extends javax.swing.JInternalFrame {

    private final LeaveRequestDocument docData;
    private final Student student;
    private Map<String, Object> leaveDocData = new HashMap<>();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DOB;
    private javax.swing.JLabel ENname;
    private javax.swing.JTextArea Remark;
    private javax.swing.JLabel THname;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField causeOfLeaveTextField;
    private javax.swing.JLabel classYearITGenLabel;
    private javax.swing.JTextArea contactAddressTextArea;
    private javax.swing.JLabel documentIDLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JComboBox<String> leaveFromDay;
    private javax.swing.JComboBox<String> leaveFromMonth;
    private javax.swing.JTextField leaveFromYear;
    private javax.swing.JTextField leaveTitleTextField;
    private javax.swing.JComboBox<String> leaveUntilDay;
    private javax.swing.JComboBox<String> leaveUntilMonth;
    private javax.swing.JTextField leaveUntilYear;
    private javax.swing.JLabel majorNameLabel;
    private javax.swing.JLabel passportId;
    private javax.swing.JLabel phoneNumberLabel;
    private javax.swing.JLabel programName;
    private javax.swing.JLabel requestByNameLabel;
    private javax.swing.JTextField requestByNameTextField;
    private javax.swing.JTextField requestByTextField;
    private javax.swing.JTextArea requestRemarkTextArea;
    private javax.swing.JTextField requestToTextLabel;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel schoolNameLabel;
    private javax.swing.JComboBox<String> selectedLeaveTitle;
    private javax.swing.JComboBox<String> selectedWrittenDayBox;
    private javax.swing.JComboBox<String> selectedWrittenMonthBox;
    private javax.swing.JLabel sex;
    private javax.swing.JTextArea staffComment;
    private javax.swing.JLabel status;
    private javax.swing.JComboBox<String> statusCombo;
    private javax.swing.JLabel studentId;
    private javax.swing.JTextArea teacherComment;
    private javax.swing.JTextArea writtenAtTextArea;
    private javax.swing.JTextField writtenYearTextField;
    /**
     * Creates new form AdminDocumentForm
     */
    public LeaveDocumentForm(LeaveRequestDocument docData, Student student) {
        initComponents();
        this.docData = docData;
        this.student = student;
        showData();
    }

    private void showData() {
        documentIDLabel.setText(docData.getDocumentId());
        status.setText(docData.getRequestStatus());
        studentId.setText(student.getStudentId());
        passportId.setText(student.getIdentificationNumber());
        THname.setText(student.getThNameTitle() + student.getThFirstName() + " " + student.getThLastName());
        ENname.setText(student.getEnNameTitle() + student.getEnFirstName() + " " + student.getEnLastName());
        DOB.setText(student.getDobDate() + " " + student.getDobMonth() + " " + student.getDobYear());
        sex.setText(student.getGender());
        schoolNameLabel.setText(student.getSchoolName());
        majorNameLabel.setText(student.getMajorName());
        classYearITGenLabel.setText(student.getClassYear() + "/" + student.getGeneration());
        programName.setText(student.getProgramName());
        emailLabel.setText(student.getEmail());
        phoneNumberLabel.setText(student.getPhoneNumber());
        addressLabel.setText(student.getContactAddress());
        majorNameLabel.setText(student.getMajorName());

        documentIDLabel.setText(docData.getDocumentId());
        writtenAtTextArea.setText(docData.getWrittenAt());
        selectedLeaveTitle.setSelectedItem(docData.getLeaveTitle());
        leaveTitleTextField.setText(docData.getOtherLeaveTitle());
        requestToTextLabel.setText(docData.getRequestTo());
        selectedWrittenDayBox.setSelectedItem(docData.getRequestedAtDay());
        selectedWrittenMonthBox.setSelectedItem(docData.getRequestedAtMonth());
        writtenYearTextField.setText(docData.getRequestedAtYear());
        requestByTextField.setText(docData.getRequestBy());
        contactAddressTextArea.setText(docData.getContactAddress());
        causeOfLeaveTextField.setText(docData.getCauseOfLeave());
        leaveFromDay.setSelectedItem(docData.getLeaveFromDay());
        leaveFromMonth.setSelectedItem(docData.getLeaveFromMonth());
        leaveFromYear.setText(docData.getLeaveFromYear());
        leaveUntilDay.setSelectedItem(docData.getLeaveUntilDay());
        leaveUntilMonth.setSelectedItem(docData.getLeaveUntilMonth());
        leaveUntilYear.setText(docData.getLeaveUntilYear());
        requestRemarkTextArea.setText(docData.getRemark());
        leaveTitleTextField.setText(docData.getOtherLeaveTitle());
        requestByNameTextField.setText(student.getThFirstName() + " " + student.getThLastName());
        requestByNameLabel.setText("(" + student.getThNameTitle() + student.getThFirstName() + " " + student.getThLastName() + ")");
        if (docData.getResponses().size() == 0) {
            staffComment.setText("");
            teacherComment.setText("");
            Remark.setText("");
        } else {
            staffComment.setText(docData.getResponses().get(0));
            teacherComment.setText(docData.getResponses().get(1));
            Remark.setText(docData.getResponses().get(2));
        }
        if (docData.getRequestStatus().equals("ยื่นเอกสารแล้ว")) {
        } else {
            statusCombo.setSelectedItem(docData.getRequestStatus());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        phoneNumberLabel = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        passportId = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        studentId = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        THname = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        ENname = new javax.swing.JLabel();
        DOB = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        sex = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        schoolNameLabel = new javax.swing.JLabel();
        programName = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        majorNameLabel = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        classYearITGenLabel = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        statusCombo = new javax.swing.JComboBox<>();
        saveButton = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        selectedWrittenDayBox = new javax.swing.JComboBox<>();
        selectedWrittenMonthBox = new javax.swing.JComboBox<>();
        writtenYearTextField = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        requestRemarkTextArea = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        requestToTextLabel = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        requestByTextField = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        writtenAtTextArea = new javax.swing.JTextArea();
        jLabel43 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        contactAddressTextArea = new javax.swing.JTextArea();
        jLabel44 = new javax.swing.JLabel();
        selectedLeaveTitle = new javax.swing.JComboBox<>();
        leaveTitleTextField = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        causeOfLeaveTextField = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        leaveFromYear = new javax.swing.JTextField();
        leaveFromMonth = new javax.swing.JComboBox<>();
        leaveFromDay = new javax.swing.JComboBox<>();
        leaveUntilYear = new javax.swing.JTextField();
        leaveUntilMonth = new javax.swing.JComboBox<>();
        leaveUntilDay = new javax.swing.JComboBox<>();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        requestByNameTextField = new javax.swing.JTextField();
        requestByNameLabel = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        Remark = new javax.swing.JTextArea();
        jLabel53 = new javax.swing.JLabel();
        jScrollPane17 = new javax.swing.JScrollPane();
        teacherComment = new javax.swing.JTextArea();
        jLabel54 = new javax.swing.JLabel();
        jScrollPane16 = new javax.swing.JScrollPane();
        staffComment = new javax.swing.JTextArea();
        jLabel52 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        documentIDLabel = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        status = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        setClosable(true);
        setIconifiable(true);

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setText("ทะเบียนประวัติเเละข้อมูลนักศึกษา");

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ข้อมูลในการติดต่อ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13))); // NOI18N

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setText("อีเมล");

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

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
                jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(emailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(phoneNumberLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(addressLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
                jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel24)
                                        .addComponent(emailLabel))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel25)
                                        .addComponent(phoneNumberLabel))
                                .addGap(12, 12, 12)
                                .addComponent(jLabel26)
                                .addGap(12, 12, 12)
                                .addComponent(addressLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(12, 12, 12))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ข้อมูลส่วนตัว", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13))); // NOI18N

        passportId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        passportId.setText("NULL");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setText("บัตรประจำตัวประชาชน");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("รหัสประจำตัวนักศึกษา");

        studentId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        studentId.setText("NULL");

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel28.setText("ชื่อนักศึกษา (TH)");

        THname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        THname.setText("NULL");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setText("ชื่อนักศึกษา (EN)");

        ENname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ENname.setText("NULL");

        DOB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        DOB.setText("NULL");

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel30.setText("วัน / เดือน / ปี เกิด");

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel31.setText("เพศ");

        sex.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sex.setText("NULL");

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
                                                .addComponent(studentId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(passportId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(THname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(ENname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(DOB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(sex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(studentId))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel27)
                                        .addComponent(passportId))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel28)
                                        .addComponent(THname))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel29)
                                        .addComponent(ENname))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel30)
                                        .addComponent(DOB))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel31)
                                        .addComponent(sex))
                                .addGap(12, 12, 12))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ข้อมูลการศึกษา", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13))); // NOI18N

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel32.setText("คณะ / วิทยาลัย");

        schoolNameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        schoolNameLabel.setText("NULL");

        programName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        programName.setText("NULL");

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel33.setText("สาขา / วิชาเอก");

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel34.setText("เเขวงวิชา");

        majorNameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        majorNameLabel.setText("NULL");

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel35.setText("ชั้นปีที่ เเละรุ่นที่");

        classYearITGenLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        classYearITGenLabel.setText("NULL");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
                jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(schoolNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(programName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(majorNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(classYearITGenLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
                jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel32)
                                        .addComponent(schoolNameLabel))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel33)
                                        .addComponent(programName))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel34)
                                        .addComponent(majorNameLabel))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel35)
                                        .addComponent(classYearITGenLabel))
                                .addGap(12, 12, 12))
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("ตอบกลับ"), "ตอบกลับ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13))); // NOI18N

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        statusCombo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        statusCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"กำลังตรวจสอบเอกสาร", "อนุญาตให้ลา", "ไม่อนุญาตให้ลา"}));

        saveButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        saveButton.setText("บันทึก");
        saveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
                jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(statusCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(saveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel11Layout.createSequentialGroup()
                                                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
                jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel11Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(statusCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel37)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        jPanel11.getAccessibleContext().setAccessibleName("ความคิดเห็น");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("ข้อมูลยื่นคำร้องขอลาเรียนสำหรับนักศึกษา");

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel4.setPreferredSize(new java.awt.Dimension(673, 500));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("เขียนคำร้องที่");

        selectedWrittenDayBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        selectedWrittenDayBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
        selectedWrittenDayBox.setEnabled(false);

        selectedWrittenMonthBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        selectedWrittenMonthBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"มกราคม", "กุมภาพันธ์", "มีนาคม", "เมษายน", "พฤษภาคม", "มิถุนายน", "กรกฎาคม", "สิงหาคม", "กันยายน", "ตุลาคม", "พฤศจิกายน", "ธันวาคม"}));
        selectedWrittenMonthBox.setEnabled(false);

        writtenYearTextField.setEditable(false);
        writtenYearTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        requestRemarkTextArea.setEditable(false);
        requestRemarkTextArea.setColumns(1);
        requestRemarkTextArea.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        requestRemarkTextArea.setLineWrap(true);
        requestRemarkTextArea.setRows(5);
        requestRemarkTextArea.setTabSize(1);
        requestRemarkTextArea.setWrapStyleWord(true);
        jScrollPane3.setViewportView(requestRemarkTextArea);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("เรื่อง");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("เรียน (นักศึกษาต้องการเขียนคำร้องถึงใคร)");

        requestToTextLabel.setEditable(false);
        requestToTextLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        requestToTextLabel.setText("อาจารย์ประจำวิชา (ผ่านอาจารย์ที่ปรึกษา เเละระบบห้องฟ้าออนไลน์)");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("เขียนคำร้องเมื่อ");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("ยื่นคำร้องโดย (รหัสนักศึกษา)");

        requestByTextField.setEditable(false);
        requestByTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel42.setText("ที่อยู่สำหรับติดต่อ");

        writtenAtTextArea.setEditable(false);
        writtenAtTextArea.setColumns(1);
        writtenAtTextArea.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        writtenAtTextArea.setLineWrap(true);
        writtenAtTextArea.setRows(3);
        writtenAtTextArea.setTabSize(0);
        writtenAtTextArea.setWrapStyleWord(true);
        jScrollPane4.setViewportView(writtenAtTextArea);

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel43.setText("หมายเหตุอื่น ๆ ประกอบการลา (ถ้ามี)");

        contactAddressTextArea.setEditable(false);
        contactAddressTextArea.setColumns(1);
        contactAddressTextArea.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        contactAddressTextArea.setLineWrap(true);
        contactAddressTextArea.setRows(3);
        contactAddressTextArea.setTabSize(0);
        contactAddressTextArea.setWrapStyleWord(true);
        jScrollPane5.setViewportView(contactAddressTextArea);

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel44.setText("จึงเรียนมาเพื่อโปรดพิจารณา ขอเเสดงความนับถือ");

        selectedLeaveTitle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        selectedLeaveTitle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"ขอลาป่วย", "ขอลากิจ", "ขอลาร่วมกิจกรรม", "อื่น ๆ (โปรดระบุสาเหตุการลา)"}));
        selectedLeaveTitle.setEnabled(false);
        selectedLeaveTitle.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                selectedLeaveTitleItemStateChanged(evt);
            }
        });

        leaveTitleTextField.setEditable(false);
        leaveTitleTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        leaveTitleTextField.setText("ขอลาป่วย");
        leaveTitleTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leaveTitleTextFieldActionPerformed(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel45.setText("อื่นๆ โปรดระบุเหตุผลการลาเรียน");

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel46.setText("มีความประสงค์ที่จะขอลาเรียนเนื่องจาก");

        causeOfLeaveTextField.setEditable(false);
        causeOfLeaveTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel47.setText("จึงขอลาเรียนตั้งเเต่วันที่");

        leaveFromYear.setEditable(false);
        leaveFromYear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        leaveFromMonth.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        leaveFromMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"มกราคม", "กุมภาพันธ์", "มีนาคม", "เมษายน", "พฤษภาคม", "มิถุนายน", "กรกฎาคม", "สิงหาคม", "กันยายน", "ตุลาคม", "พฤศจิกายน", "ธันวาคม"}));
        leaveFromMonth.setEnabled(false);

        leaveFromDay.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        leaveFromDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
        leaveFromDay.setEnabled(false);

        leaveUntilYear.setEditable(false);
        leaveUntilYear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        leaveUntilMonth.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        leaveUntilMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"มกราคม", "กุมภาพันธ์", "มีนาคม", "เมษายน", "พฤษภาคม", "มิถุนายน", "กรกฎาคม", "สิงหาคม", "กันยายน", "ตุลาคม", "พฤศจิกายน", "ธันวาคม"}));
        leaveUntilMonth.setEnabled(false);

        leaveUntilDay.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        leaveUntilDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
        leaveUntilDay.setEnabled(false);

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("ถึงวันที่");

        jLabel50.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel50.setText("เมื่อครบกำหนดเเล้วข้าพเจ้าจะมาเรียนตามปกติ เเละขอรับรองว่าเป็นความจริงทุกประการ");

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel38.setText("หากข้อความข้างต้นเป็นเท็จข้าพเจ้าขอยอมรับผิดตามที่คณะเทคโนโลยีสารสนเทศ สจล. เห็นสมควร");

        requestByNameTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        requestByNameTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        requestByNameTextField.setText("นายศิลา ภักดีวงษ์");
        requestByNameTextField.setEnabled(false);

        requestByNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        requestByNameLabel.setText("NAME");

        Remark.setColumns(20);
        Remark.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Remark.setLineWrap(true);
        Remark.setTabSize(0);
        Remark.setWrapStyleWord(true);
        jScrollPane15.setViewportView(Remark);

        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel53.setText("หมายเหตุ / คำสั่ง (ถ้ามี)");

        teacherComment.setColumns(20);
        teacherComment.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        teacherComment.setLineWrap(true);
        teacherComment.setTabSize(0);
        teacherComment.setWrapStyleWord(true);
        jScrollPane17.setViewportView(teacherComment);

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel54.setText("ความเห็นจากอาจารย์ (ถ้ามี)");

        staffComment.setColumns(20);
        staffComment.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        staffComment.setLineWrap(true);
        staffComment.setTabSize(0);
        staffComment.setWrapStyleWord(true);
        jScrollPane16.setViewportView(staffComment);

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel52.setText("ความเห็นจากเจ้าหน้าที่(ถ้ามี)");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jScrollPane16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE)
                                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(jScrollPane4)
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel42)
                                                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                                .addComponent(requestToTextLabel)
                                                                                                .addComponent(jLabel13)
                                                                                                .addGroup(jPanel4Layout.createSequentialGroup()
                                                                                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(jPanel4Layout.createSequentialGroup()
                                                                                                                        .addComponent(leaveFromDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                        .addGap(18, 18, 18)
                                                                                                                        .addComponent(leaveFromMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                        .addGap(18, 18, 18)
                                                                                                                        .addComponent(leaveFromYear, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                        .addGap(18, 18, 18)
                                                                                                                        .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                        .addGap(18, 18, 18)
                                                                                                                        .addComponent(leaveUntilDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                        .addGap(18, 18, 18)
                                                                                                                        .addComponent(leaveUntilMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                        .addGap(18, 18, 18)
                                                                                                                        .addComponent(leaveUntilYear, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                .addComponent(jLabel38))
                                                                                                        .addGap(0, 0, Short.MAX_VALUE)
                                                                                                        .addComponent(jLabel41))
                                                                                                .addComponent(jLabel20)
                                                                                                .addComponent(jLabel12)
                                                                                                .addGroup(jPanel4Layout.createSequentialGroup()
                                                                                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(jLabel14)
                                                                                                                .addGroup(jPanel4Layout.createSequentialGroup()
                                                                                                                        .addComponent(selectedWrittenDayBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                        .addGap(18, 18, 18)
                                                                                                                        .addComponent(selectedWrittenMonthBox, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                        .addGap(18, 18, 18)
                                                                                                                        .addComponent(writtenYearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                                        .addGap(31, 31, 31)
                                                                                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(jLabel15)
                                                                                                                .addComponent(requestByTextField))))
                                                                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                                .addComponent(requestByNameLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                .addComponent(requestByNameTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                .addComponent(jLabel44, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                                                        .addComponent(jScrollPane5)
                                                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                                                .addComponent(selectedLeaveTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18)
                                                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jLabel45)
                                                                                        .addComponent(leaveTitleTextField)))
                                                                        .addComponent(jLabel46)
                                                                        .addComponent(causeOfLeaveTextField))
                                                                .addComponent(jLabel47)
                                                                .addComponent(jLabel49)
                                                                .addComponent(jLabel43)
                                                                .addComponent(jLabel50)
                                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(24, 24, 24))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel54, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(0, 0, Short.MAX_VALUE)))
                                                .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addComponent(jLabel20)
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel45))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(leaveTitleTextField)
                                        .addComponent(selectedLeaveTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13)
                                .addGap(6, 6, 6)
                                .addComponent(requestToTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel14)
                                        .addComponent(jLabel15))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(requestByTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(selectedWrittenDayBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(selectedWrittenMonthBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(writtenYearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(16, 16, 16)
                                .addComponent(jLabel42)
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGap(337, 337, 337)
                                                .addComponent(jLabel41))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addComponent(jLabel46)
                                                .addGap(6, 6, 6)
                                                .addComponent(causeOfLeaveTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12)
                                                .addComponent(jLabel47)
                                                .addGap(12, 12, 12)
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(leaveFromDay, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(leaveFromMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(leaveFromYear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(leaveUntilDay, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(leaveUntilMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(leaveUntilYear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel48))
                                                .addGap(12, 12, 12)
                                                .addComponent(jLabel43)
                                                .addGap(12, 12, 12)
                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jLabel49)
                                                .addGap(12, 12, 12)
                                                .addComponent(jLabel50)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel38)))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel44)
                                .addGap(18, 18, 18)
                                .addComponent(requestByNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(requestByNameLabel)
                                .addGap(57, 57, 57)
                                .addComponent(jLabel52)
                                .addGap(22, 22, 22)
                                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(jLabel54)
                                .addGap(22, 22, 22)
                                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(jLabel53)
                                .addGap(22, 22, 22)
                                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22))
        );

        jScrollPane2.setViewportView(jPanel4);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel36))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel36)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1486, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22))
        );

        jScrollPane1.setViewportView(jPanel3);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
                jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel9Layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addContainerGap())
                                        .addComponent(jScrollPane1)))
        );
        jPanel9Layout.setVerticalGroup(
                jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
                jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 375, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
                jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 255));
        jLabel3.setText("รายละเอียดการยื่นเอกสารลาเรียนสำหรับนักศึกษา");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("ข้อมูลเอกสารลาเรียน ความคิดเห็น เเละสถานะการตอบกลับจากเจ้าหน้าที่ เเละ/หรืออาจารย์");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons_48x48/icons8-analyze-48.png"))); // NOI18N

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("เลขที่เอกสาร (คำร้องเลขที่)");

        documentIDLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        documentIDLabel.setText("XXXXXXXXXX");

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel51.setText("สถานะเอกสาร");

        status.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        status.setText("ยื่นเอกสารเเล้ว / กำลังรอการตอบกลับ");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addGap(18, 18, 18)
                                                .addComponent(documentIDLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addComponent(jLabel51)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(documentIDLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel51)
                                        .addComponent(status))
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
                                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(18, 18, 18)
                                                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel4))
                                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18))
        );

        setBounds(0, 0, 1250, 846);
    }// </editor-fold>//GEN-END:initComponents

    private void selectedLeaveTitleItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_selectedLeaveTitleItemStateChanged
        String selectedItem = (String) evt.getItem();
        System.out.println(selectedItem);
        if (selectedItem.equalsIgnoreCase("อื่น ๆ (โปรดระบุสาเหตุการลา)")) {
            leaveTitleTextField.setEnabled(true);
            leaveTitleTextField.setText("");
        } else {
            leaveTitleTextField.setEnabled(false);
            leaveTitleTextField.setText(selectedItem);
        }
    }//GEN-LAST:event_selectedLeaveTitleItemStateChanged

    private void leaveTitleTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leaveTitleTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_leaveTitleTextFieldActionPerformed

    private void saveButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveButtonMouseClicked
        leaveDocData = toDocDataMap();
        if (LeaveDocHandler.handleUpdateLeaveDocAdmin(docData.getDocumentId(), (HashMap<String, Object>) leaveDocData)) {
            new InfoDialog("บันทึกคำตอบเสร็จสิ้น", "ระบบได้บันทึกคำตอบของท่านแล้ว!").show();
            this.setVisible(false);
            this.dispose();
        }

    }//GEN-LAST:event_saveButtonMouseClicked

    private Map<String, Object> toDocDataMap() {
        Admin admin = (Admin) AuthUser.getAuthUser();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        String writtenAt = writtenAtTextArea.getText();
        String leaveTitle = (String) selectedLeaveTitle.getSelectedItem();
        String otherLeaveTitle = leaveTitleTextField.getText();
        String requestTo = requestToTextLabel.getText();
        String requestedAtDay = (String) selectedWrittenDayBox.getSelectedItem();
        String requestedAtMonth = (String) selectedWrittenMonthBox.getSelectedItem();
        String requestedAtYear = writtenYearTextField.getText();
        String requestBy = requestByTextField.getText();
        String contactAddress = contactAddressTextArea.getText();
        String causeOfLeave = causeOfLeaveTextField.getText();
        String selectedLeaveFromDay = (String) leaveFromDay.getSelectedItem();
        String selectedLeaveFromMonth = (String) leaveFromMonth.getSelectedItem();
        String selectedLeaveFromYear = leaveFromYear.getText();
        String selectedLeaveUntilDay = (String) leaveUntilDay.getSelectedItem();
        String selectedLeaveUntilMonth = (String) leaveUntilMonth.getSelectedItem();
        String selectedLeaveUntilYear = leaveUntilYear.getText();
        String requestRemark = requestRemarkTextArea.getText();

        String requestStatus = (String) statusCombo.getSelectedItem();
        String respondedAt = dtf.format(LocalDateTime.now());
        String respondedBy = admin.getUsername();
        ArrayList<String> requestResponses = new ArrayList<>();
        requestResponses.add(0, staffComment.getText());
        requestResponses.add(1, teacherComment.getText());
        requestResponses.add(2, Remark.getText());

        if (requestRemark.isEmpty()) {
            requestRemark = "-";
        }

        leaveDocData.put("documentType", 2);
        leaveDocData.put("writtenAt", writtenAt);
        leaveDocData.put("leaveTitle", leaveTitle);
        leaveDocData.put("otherLeaveTitle", otherLeaveTitle);
        leaveDocData.put("requestTo", requestTo);
        leaveDocData.put("requestedAtDay", requestedAtDay);
        leaveDocData.put("requestedAtMonth", requestedAtMonth);
        leaveDocData.put("requestedAtYear", requestedAtYear);
        leaveDocData.put("requestBy", requestBy);
        leaveDocData.put("contactAddress", contactAddress);
        leaveDocData.put("requestRemark", requestRemark);
        leaveDocData.put("causeOfLeave", causeOfLeave);
        leaveDocData.put("selectedLeaveFromDay", selectedLeaveFromDay);
        leaveDocData.put("selectedLeaveFromMonth", selectedLeaveFromMonth);
        leaveDocData.put("selectedLeaveFromYear", selectedLeaveFromYear);
        leaveDocData.put("selectedLeaveUntilDay", selectedLeaveUntilDay);
        leaveDocData.put("selectedLeaveUntilMonth", selectedLeaveUntilMonth);
        leaveDocData.put("selectedLeaveUntilYear", selectedLeaveUntilYear);
        leaveDocData.put("requestStatus", requestStatus);
        leaveDocData.put("respondedAt", respondedAt);
        leaveDocData.put("respondedBy", respondedBy);
        leaveDocData.put("requestResponses", requestResponses);

        return leaveDocData;
    }
    // End of variables declaration//GEN-END:variables
}
