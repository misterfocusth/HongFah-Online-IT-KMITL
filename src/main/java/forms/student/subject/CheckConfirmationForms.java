/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package forms.student.subject;

import checkin.CheckInSession;
import dialog.InfoDialog;
import handlers.CheckInHandler;
import helper.InputValidationHelper;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import user.AuthUser;
import user.Student;

/**
 *
 * @author WINDOWS 10
 */
public class CheckConfirmationForms extends javax.swing.JInternalFrame {

    private CheckInSession selectedData;
    private Map<String, Object> checkInData = new HashMap<>();

    /**
     * Creates new form CheckinSuccessForms
     */
    public CheckConfirmationForms(CheckInSession checkIn) {
        initComponents();
        this.selectedData = checkIn;
        showCheckInData();
    }

    private void showCheckInData() {
        subIDdisplay.setText(selectedData.getSubjectID());
        subNamedisplay.setText(selectedData.getSubjectName());
        classroomTextField.setText(selectedData.getClassroom());
        classTimeTextField.setText(selectedData.getClassTime());
        teacherTextField.setText(selectedData.getTeacherName());
        coursedetailTextField.setText(selectedData.getSessionNote());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        subNamedisplay = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        classTimeTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        classroomTextField = new javax.swing.JTextField();
        teacherTextField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        coursedetailTextField = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        confirmbtn = new javax.swing.JButton();
        subIDdisplay = new javax.swing.JLabel();
        cancelbtn = new javax.swing.JButton();

        subNamedisplay.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        subNamedisplay.setText("( ชื่อวิชา )");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("วัน - เวลาเรียน");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("ห้องเรียน");

        classTimeTextField.setEditable(false);
        classTimeTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        classTimeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classTimeTextFieldActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("ชื่ออาจารย์ผู้สอน");

        classroomTextField.setEditable(false);
        classroomTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        classroomTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classroomTextFieldActionPerformed(evt);
            }
        });

        teacherTextField.setEditable(false);
        teacherTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        teacherTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherTextFieldActionPerformed(evt);
            }
        });

        coursedetailTextField.setEditable(false);
        coursedetailTextField.setColumns(20);
        coursedetailTextField.setRows(5);
        jScrollPane2.setViewportView(coursedetailTextField);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("รายละเอียดวิชา");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel6)
                        .addGap(64, 64, 64)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(classroomTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(classTimeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel8))
                    .addComponent(teacherTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel9)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(classroomTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(classTimeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(teacherTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        confirmbtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        confirmbtn.setText("Confirm Check-in");
        confirmbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmbtnMouseClicked(evt);
            }
        });
        confirmbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmbtnActionPerformed(evt);
            }
        });

        subIDdisplay.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        subIDdisplay.setText("( รหัสวิชา )");

        cancelbtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cancelbtn.setText("Cancel Check-in");
        cancelbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelbtnMouseClicked(evt);
            }
        });
        cancelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(158, 158, 158)
                                .addComponent(subIDdisplay)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(subNamedisplay))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(confirmbtn)
                                .addGap(30, 30, 30)
                                .addComponent(cancelbtn)))
                        .addGap(0, 104, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subNamedisplay)
                    .addComponent(subIDdisplay))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmbtn)
                    .addComponent(cancelbtn))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void classTimeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classTimeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_classTimeTextFieldActionPerformed

    private void classroomTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classroomTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_classroomTextFieldActionPerformed

    private void teacherTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teacherTextFieldActionPerformed

    private void confirmbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmbtnActionPerformed

    private void confirmbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmbtnMouseClicked
        checkInData = toCheckInDataMap();
        if (CheckInHandler.handleUpdateCheckInSession(selectedData.getSessionID(), (HashMap<String, Object>) checkInData)) {
            new InfoDialog("บันทึกคำตอบเสร็จสิ้น", "ระบบได้บันทึกคำตอบของท่านแล้ว!").show();
            this.setVisible(false);
            this.dispose();
        }
    }//GEN-LAST:event_confirmbtnMouseClicked

    private void cancelbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelbtnMouseClicked
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_cancelbtnMouseClicked

    private void cancelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbtnActionPerformed

    }//GEN-LAST:event_cancelbtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelbtn;
    private javax.swing.JTextField classTimeTextField;
    private javax.swing.JTextField classroomTextField;
    private javax.swing.JButton confirmbtn;
    private javax.swing.JTextArea coursedetailTextField;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel subIDdisplay;
    private javax.swing.JLabel subNamedisplay;
    private javax.swing.JTextField teacherTextField;
    // End of variables declaration//GEN-END:variables

    private Map<String, Object> toCheckInDataMap() {

        String sessionID = selectedData.getSessionID();
        String subjectID = selectedData.getSubjectID();
        String subjectName = selectedData.getSubjectName();
        String classTime = selectedData.getClassTime();
        String classroom = selectedData.getClassroom();
        String teacherName = selectedData.getTeacherName();
        String sessionNote = selectedData.getSessionNote();
        boolean isActive = selectedData.isIsActive();

        Student student = (Student) AuthUser.getAuthUser();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        String checkInByStudenCode = student.getStudentId();
        String checkInByStudenFirstName = student.getThFirstName();
        String checkInByStudenLastName = student.getThLastName();
        String checkInAt = dtf.format(LocalDateTime.now());

        Map<String, Object> checkInData = new HashMap<>();

        ArrayList<String> studentCheckIn = new ArrayList<>();
        studentCheckIn.add(checkInByStudenCode);
        studentCheckIn.add(checkInByStudenFirstName);
        studentCheckIn.add(checkInByStudenLastName);

        checkInData.put("sessionID", sessionID);
        checkInData.put("subjectID", subjectID);
        checkInData.put("subjectName", subjectName);
        checkInData.put("classTime", classTime);
        checkInData.put("classroom", classroom);
        checkInData.put("teacherName", teacherName);
        checkInData.put("sessionNote", sessionNote);
        checkInData.put("isActive", isActive);
        checkInData.put("studentCheckIn", studentCheckIn);

//        questionData.put("questionResponse", questionResponse);
//        questionData.put("answerBy", answerBy);
//        questionData.put("answerAt", answerAt);
//        questionData.put("answerBody", answerBody);
        return checkInData;
    }
}
