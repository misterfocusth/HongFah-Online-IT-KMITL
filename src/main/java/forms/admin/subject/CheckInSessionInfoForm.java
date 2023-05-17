/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package forms.admin.subject;

import checkin.CheckInSession;
import dialog.InfoDialog;
import handlers.CheckInHandler;
import java.awt.Font;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author WINDOWS 10
 */
public class CheckInSessionInfoForm extends javax.swing.JInternalFrame {

    private CheckInSession selectedData;
    private Map<String, Object> checkInData = new HashMap<>();
    private DefaultTableModel model;

    /**
     * Creates new form CheckForms
     */
    public CheckInSessionInfoForm(CheckInSession checkIn) {
        initComponents();
        this.selectedData = checkIn;
        getAllCheckInDocuments();
    }

    private void getAllCheckInDocuments() {
        subjectID.setText(selectedData.getSubjectID());
        subjectName.setText(selectedData.getSubjectName());
        classroom.setText(selectedData.getClassroom());
        time.setText(selectedData.getClassTime());
        teacher.setText(selectedData.getTeacherName());
        courseDetail.setText(selectedData.getSessionNote());
        classcode.setText(selectedData.getSessionID());
        if (selectedData.isIsActive() == false) {
            deActivateB.setVisible(false);
        }

        DefaultTableModel model = (DefaultTableModel) studentCheckTable.getModel();
        studentCheckTable.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 16));
        ArrayList studentCheckIn = selectedData.getStudentCheckIn();
        for (int i = 0; i <= (studentCheckIn.size() - 1); i++) {
            Object studentInfo = studentCheckIn.get(i);
            String studentInfoString = studentInfo.toString();
            String[] studentParts = studentInfoString.split("&", 3);
            String StudentCode = studentParts[0];
            String studnetStudentName = studentParts[1];
            String studentcheckInAt = studentParts[2];
            String[] studentAddInfo = new String[]{StudentCode, studnetStudentName, studentcheckInAt};
            model.addRow(studentAddInfo);
        }
    }

    public DefaultTableModel getModel() {
        return model;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        studentCheckTable = new javax.swing.JTable();
        deActivateB = new javax.swing.JButton();
        classcode = new javax.swing.JLabel();
        detailPanel = new javax.swing.JPanel();
        finalClassID = new javax.swing.JLabel();
        subjectName = new javax.swing.JTextField();
        finalClassName = new javax.swing.JLabel();
        subjectID = new javax.swing.JTextField();
        FinalTime = new javax.swing.JLabel();
        finalClassroom = new javax.swing.JLabel();
        time = new javax.swing.JTextField();
        finalTeacher = new javax.swing.JLabel();
        classroom = new javax.swing.JTextField();
        teacher = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        courseDetail = new javax.swing.JTextArea();
        finalDetail = new javax.swing.JLabel();
        finalCode = new javax.swing.JLabel();
        close = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        studentCheckTable.setAutoCreateRowSorter(true);
        studentCheckTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        studentCheckTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "รหัสนักศึกษา", "ชื่อนักศึกษา", "เวลาเช็คชื่อ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        studentCheckTable.setRowHeight(35);
        studentCheckTable.setShowGrid(true);
        studentCheckTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(studentCheckTable);
        if (studentCheckTable.getColumnModel().getColumnCount() > 0) {
            studentCheckTable.getColumnModel().getColumn(0).setResizable(false);
            studentCheckTable.getColumnModel().getColumn(1).setResizable(false);
            studentCheckTable.getColumnModel().getColumn(2).setResizable(false);
        }

        deActivateB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deActivateB.setText("ปิดการเข้าเช็คชื่อ");
        deActivateB.setPreferredSize(new java.awt.Dimension(200, 35));
        deActivateB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deActivateBMouseClicked(evt);
            }
        });

        classcode.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        classcode.setForeground(new java.awt.Color(41, 121, 255));
        classcode.setText("123456");

        finalClassID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        finalClassID.setText("รหัสวิชา");

        subjectName.setEditable(false);
        subjectName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        finalClassName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        finalClassName.setText("ชื่อวิชา");

        subjectID.setEditable(false);
        subjectID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        FinalTime.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        FinalTime.setText("วัน - เวลาเรียน");

        finalClassroom.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        finalClassroom.setText("ห้องเรียน");

        time.setEditable(false);
        time.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        finalTeacher.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        finalTeacher.setText("ชื่ออาจารย์ผู้สอน");

        classroom.setEditable(false);
        classroom.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        teacher.setEditable(false);
        teacher.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        courseDetail.setEditable(false);
        courseDetail.setColumns(20);
        courseDetail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        courseDetail.setLineWrap(true);
        courseDetail.setRows(5);
        jScrollPane2.setViewportView(courseDetail);

        finalDetail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        finalDetail.setText("รายละเอียดวิชา");

        javax.swing.GroupLayout detailPanelLayout = new javax.swing.GroupLayout(detailPanel);
        detailPanel.setLayout(detailPanelLayout);
        detailPanelLayout.setHorizontalGroup(
            detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(detailPanelLayout.createSequentialGroup()
                        .addComponent(classroom, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(time))
                    .addGroup(detailPanelLayout.createSequentialGroup()
                        .addGroup(detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(subjectID, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(finalClassroom, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FinalTime)
                            .addComponent(subjectName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(finalClassName)))
                    .addComponent(finalClassID, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(finalTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teacher))
                .addGap(24, 24, 24)
                .addGroup(detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(finalDetail)))
        );
        detailPanelLayout.setVerticalGroup(
            detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detailPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(finalClassID)
                    .addComponent(finalClassName)
                    .addComponent(finalDetail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(detailPanelLayout.createSequentialGroup()
                        .addGroup(detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(subjectName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(subjectID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(finalClassroom)
                            .addComponent(FinalTime))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(classroom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(finalTeacher)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(teacher, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        finalCode.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        finalCode.setText("รหัสเซคชั่น");

        close.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        close.setText("ออก");
        close.setMaximumSize(new java.awt.Dimension(156, 28));
        close.setMinimumSize(new java.awt.Dimension(156, 28));
        close.setPreferredSize(new java.awt.Dimension(200, 35));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150)
                .addComponent(deActivateB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(classcode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(finalCode, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(detailPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(detailPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(finalCode)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(classcode)
                        .addGap(56, 56, 56)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(close, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deActivateB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_closeMouseClicked

    private void deActivateBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deActivateBMouseClicked
        checkInData = toCheckInDataMap();

        if (CheckInHandler.handleUpdateCheckInSession(selectedData.getSessionID(), (HashMap<String, Object>) checkInData)) {
            new InfoDialog("บันทึกคำตอบเสร็จสิ้น", "ปิดการลงชื่อเข้าชั้นเรียนเรียบร้อยแล้ว!").show();
            this.setVisible(false);
            this.dispose();
        }
    }//GEN-LAST:event_deActivateBMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FinalTime;
    private javax.swing.JLabel classcode;
    private javax.swing.JTextField classroom;
    private javax.swing.JButton close;
    private javax.swing.JTextArea courseDetail;
    private javax.swing.JButton deActivateB;
    private javax.swing.JPanel detailPanel;
    private javax.swing.JLabel finalClassID;
    private javax.swing.JLabel finalClassName;
    private javax.swing.JLabel finalClassroom;
    private javax.swing.JLabel finalCode;
    private javax.swing.JLabel finalDetail;
    private javax.swing.JLabel finalTeacher;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable studentCheckTable;
    private javax.swing.JTextField subjectID;
    private javax.swing.JTextField subjectName;
    private javax.swing.JTextField teacher;
    private javax.swing.JTextField time;
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
        ArrayList<String> studentCheckIn = selectedData.getStudentCheckIn();

        Map<String, Object> checkInData = new HashMap<>();

        checkInData.put("sessionID", sessionID);
        checkInData.put("subjectID", subjectID);
        checkInData.put("subjectName", subjectName);
        checkInData.put("classTime", classTime);
        checkInData.put("classroom", classroom);
        checkInData.put("teacherName", teacherName);
        checkInData.put("sessionNote", sessionNote);
        checkInData.put("isActive", false);
        checkInData.put("studentCheckIn", studentCheckIn);

        return checkInData;
    }
}
