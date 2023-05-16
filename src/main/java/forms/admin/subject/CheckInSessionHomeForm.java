/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package forms.admin.subject;

import checkin.CheckInSession;
import dialog.InfoDialog;
import forms.AdminMainForm;
import handlers.CheckInHandler;
import helper.FrameHelper;
import helper.InputValidationHelper;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author WINDOWS 10
 */
public class CheckInSessionHomeForm extends javax.swing.JInternalFrame {

    Map<String, HashMap<String, Object>> checkInHistory;
    private Map<String, Object> checkInData = new HashMap<>();
    private String isActiveBooleanToString = "";
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField SubjectIDTextField;
    private javax.swing.JTextField SubjectNameTextField;
    private javax.swing.JButton add;
    private javax.swing.JButton cancel;
    private javax.swing.JTable checkClassinfo;
    private javax.swing.JComboBox<String> checkInSessionComboBox;
    private javax.swing.JTextField classroomTextField;
    private javax.swing.JButton clear;
    private javax.swing.JTextField durationTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel procedures;
    private javax.swing.JLabel refreshLabel;
    private javax.swing.JButton searchCheckInSessionButton;
    private javax.swing.JTextField searchCheckInSessionCodeTextField;
    private javax.swing.JTextArea subjectInfoTextField;
    private javax.swing.JTextField teacherNameTextField;
    /**
     * Creates new form SubForms
     */
    public CheckInSessionHomeForm() {
        initComponents();
        showAllCheckInSessions();
    }

    private void showAllCheckInSessions() {
        DefaultTableModel model = (DefaultTableModel) checkClassinfo.getModel();
        checkClassinfo.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 16));
        checkInHistory = CheckInHandler.handleGetAllCheckInSessions();
        checkInHistory.forEach((k, v) -> {
            String sessionID = (String) v.get("sessionID");
            String subjectName = (String) v.get("subjectName");
            String teacherName = (String) v.get("teacherName");
            String classTime = (String) v.get("classTime");
            boolean isActive = (boolean) v.get("isActive");
            if (isActive) {
                isActiveBooleanToString = "ยังเปิดให้เช็คชื่อ";
            } else if (!isActive) {
                isActiveBooleanToString = "ปิดการเช็คชื่อแล้ว";
            }
            model.addRow(new String[]{sessionID, subjectName, teacherName, classTime, isActiveBooleanToString});
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

        checkInSessionComboBox = new javax.swing.JComboBox<>();
        searchCheckInSessionCodeTextField = new javax.swing.JTextField();
        searchCheckInSessionButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        add = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        SubjectNameTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        SubjectIDTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        durationTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        teacherNameTextField = new javax.swing.JTextField();
        classroomTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        subjectInfoTextField = new javax.swing.JTextArea();
        clear = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        procedures = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        checkClassinfo = new javax.swing.JTable();
        refreshLabel = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);

        checkInSessionComboBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkInSessionComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"แสดงทั้งหมด", "ยังเปิดให้เช็คชื่อ", "ปิดการเช็คชื่อแล้ว"}));
        checkInSessionComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                checkInSessionComboBoxItemStateChanged(evt);
            }
        });
        checkInSessionComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkInSessionComboBoxActionPerformed(evt);
            }
        });

        searchCheckInSessionButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        searchCheckInSessionButton.setText("ค้นหาด้วยรหัสเช็คชื่อ");
        searchCheckInSessionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchCheckInSessionButtonActionPerformed(evt);
            }
        });

        add.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add.setForeground(new java.awt.Color(41, 121, 255));
        add.setText("สร้างเซคชั่นเช็คชื่อ");
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        cancel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cancel.setText("ยกเลิก");
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
        });
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("สร้างเซคชั่นเช็คชื่อเข้าชั้นเรียนใหม่");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("รหัสวิชา");

        SubjectNameTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("ชื่อวิชา");

        SubjectIDTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("วัน - เวลาเรียน");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("ห้องเรียน");

        durationTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        durationTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                durationTextFieldActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("ชื่ออาจารย์ผู้สอน");

        teacherNameTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        classroomTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        classroomTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classroomTextFieldActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("รายละเอียดวิชา");

        subjectInfoTextField.setColumns(20);
        subjectInfoTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        subjectInfoTextField.setLineWrap(true);
        subjectInfoTextField.setRows(5);
        jScrollPane3.setViewportView(subjectInfoTextField);

        clear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        clear.setText("ล้างข้อมูล");
        clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearMouseClicked(evt);
            }
        });
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel7)
                                                        .addComponent(jLabel9))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jScrollPane3)
                                                        .addComponent(teacherNameTextField)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(SubjectIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(durationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel5)
                                                                        .addComponent(jLabel3))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(SubjectNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                                                                        .addComponent(classroomTextField)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jLabel4)
                                                                                        .addComponent(jLabel6))
                                                                                .addGap(0, 0, Short.MAX_VALUE)))))
                                                .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(SubjectNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(SubjectIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(durationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(classroomTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(teacherNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(12, Short.MAX_VALUE))
        );

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("เเสดงเฉพาะสถานะ :");

        procedures.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        procedures.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        procedures.setText("ระเบียบปฎิบัติการใช้งาน เเละวิธีการใช้ระบบเช็คชื่อ");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("1. อาจารย์ผู้สอนกรอกรายละเอียดรายวิชาให้ครบ เพื่อทำการสร้างเซตชั่นเช็คชื่อ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("2. แสดงรหัสเซคชั่นเช็คชื่อ เพื่อให้นักศึกษาเข้ามาเช็คชื่อ");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("3. ตรวจสอบข้อมูลนักศึกษา (รหัสนักศึกษา ชื่อ-นามสกุล เเละวัน-เวลาเช็คชื่อ)");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("4. เมื่อเลยเวลาเช็คชื่อเเล้วอาจารย์ผู้สอนสามารถทำการปิดเซคชั่นเช็คชื่อได้");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(41, 121, 255));
        jLabel13.setText("ระบบเช็คชื่อเข้าชั้นเรียน HongFah Check-In");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("เช็คชื่อเข้าชั้นเรียนผ่านระบบสารสนเทศนักศึกษา ห้องฟ้าออนไลน์ (HongFah Online)");

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home_form_icons/icons8-today-48.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(procedures, javax.swing.GroupLayout.PREFERRED_SIZE, 795, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel15)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel14))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel13)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel14))
                                        .addComponent(jLabel15))
                                .addGap(24, 24, 24)
                                .addComponent(procedures)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addGap(6, 6, 6))
        );

        checkClassinfo.setAutoCreateRowSorter(true);
        checkClassinfo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        checkClassinfo.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{

                },
                new String[]{
                        "รหัสเข้าชั้นเรียน", "ชื่อวิชา", "ชื่ออาจารย์", "วัน - เวลา", "สถานะ"
                }
        ) {
            final boolean[] canEdit = new boolean[]{
                    false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        checkClassinfo.setRowHeight(35);
        checkClassinfo.setShowGrid(true);
        checkClassinfo.getTableHeader().setReorderingAllowed(false);
        checkClassinfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkClassinfoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(checkClassinfo);
        if (checkClassinfo.getColumnModel().getColumnCount() > 0) {
            checkClassinfo.getColumnModel().getColumn(0).setResizable(false);
            checkClassinfo.getColumnModel().getColumn(1).setResizable(false);
            checkClassinfo.getColumnModel().getColumn(2).setResizable(false);
            checkClassinfo.getColumnModel().getColumn(3).setResizable(false);
            checkClassinfo.getColumnModel().getColumn(4).setResizable(false);
        }

        refreshLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-reset-48.png"))); // NOI18N
        refreshLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(searchCheckInSessionCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(12, 12, 12)
                                                                .addComponent(searchCheckInSessionButton)
                                                                .addGap(24, 24, 24)
                                                                .addComponent(jLabel10)
                                                                .addGap(12, 12, 12)
                                                                .addComponent(checkInSessionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(refreshLabel))
                                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 6, Short.MAX_VALUE)))
                                .addGap(24, 24, 24)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(24, 24, 24)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(searchCheckInSessionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(searchCheckInSessionCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(checkInSessionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel10)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(refreshLabel)))
                                                .addGap(24, 24, 24)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkInSessionComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkInSessionComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkInSessionComboBoxActionPerformed

    private void searchCheckInSessionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchCheckInSessionButtonActionPerformed
        String checkInSessionCode = searchCheckInSessionCodeTextField.getText().toUpperCase();
        DefaultTableModel model = (DefaultTableModel) checkClassinfo.getModel();
        model.setRowCount(0);
        checkClassinfo.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 16));
        checkInHistory.forEach((k, v) -> {
            String sessionID = (String) v.get("sessionID");
            if (checkInSessionCode.contains(sessionID)) {
                String subjectName = (String) v.get("subjectName");
                String teacherName = (String) v.get("teacherName");
                String classTime = (String) v.get("classTime");
                boolean isActive = (boolean) v.get("isActive");
                if (isActive) {
                    isActiveBooleanToString = "ยังเปิดให้เช็คชื่อ";
                } else if (!isActive) {
                    isActiveBooleanToString = "ปิดการเช็คชื่อแล้ว";
                }
                model.addRow(new String[]{sessionID, subjectName, teacherName, classTime, isActiveBooleanToString});
            }
        });
    }//GEN-LAST:event_searchCheckInSessionButtonActionPerformed

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        checkInData = toCheckInDataMap();

        boolean isUserInputValid = InputValidationHelper.validateUserInput(checkInData);
        if (!isUserInputValid) {
            new InfoDialog("ข้อมูลไม่สมบูรณ์", "โปรดกรอกข้อมูลให้ครบทุกช่อง ก่อนดำเนินการต่อ").show();
            return;
        }

        Map<String, Object> newCheckInData = CheckInHandler.handleAddNewCheckIn(checkInData);

        if (newCheckInData != null) {
            new InfoDialog("สร้างเซคชั่นเช็คชื่อสำเร็จ", "ระบบได้สร้างเซคชั่นเช็คชื่อของท่านแล้ว !").show();
            CheckInSessionInfoForm checkForms = new CheckInSessionInfoForm(new CheckInSession(checkInData));
            FrameHelper.setLocationToCenter(checkForms);
            AdminMainForm.mainDesktopPane.add(checkForms);
            checkForms.setVisible(true);
        }
    }//GEN-LAST:event_addMouseClicked

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed

    }//GEN-LAST:event_cancelActionPerformed

    private void durationTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_durationTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_durationTextFieldActionPerformed

    private void classroomTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classroomTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_classroomTextFieldActionPerformed

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_cancelMouseClicked

    private void clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseClicked
        SubjectIDTextField.setText("");
        SubjectNameTextField.setText("");
        durationTextField.setText("");
        classroomTextField.setText("");
        teacherNameTextField.setText("");
        subjectInfoTextField.setText("");
    }//GEN-LAST:event_clearMouseClicked

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearActionPerformed

    private void refreshLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshLabelMouseClicked
        refreshCheckInTableData();
    }//GEN-LAST:event_refreshLabelMouseClicked

    private void checkClassinfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkClassinfoMouseClicked
        JTable target = (JTable) evt.getSource();
        int selectedRow = target.getSelectedRow();
        String sessionID = (String) checkClassinfo.getValueAt(selectedRow, 0);
        CheckInSession seleCheckInSession = CheckInHandler.handleGetCheckInBySessionID(sessionID);
        CheckInSessionInfoForm checkForms = new CheckInSessionInfoForm(seleCheckInSession);
        FrameHelper.setLocationToCenter(checkForms);
        AdminMainForm.mainDesktopPane.add(checkForms);
        checkForms.setVisible(true);
    }//GEN-LAST:event_checkClassinfoMouseClicked

    private void checkInSessionComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_checkInSessionComboBoxItemStateChanged
        String selectedCheckInStatus = (String) checkInSessionComboBox.getSelectedItem();
        DefaultTableModel model = (DefaultTableModel) checkClassinfo.getModel();
        model.setRowCount(0);
        if (selectedCheckInStatus.equalsIgnoreCase("แสดงทั้งหมด")) {
            checkInHistory.forEach((k, v) -> {
                String sessionID = (String) v.get("sessionID");
                String subjectName = (String) v.get("subjectName");
                String teacherName = (String) v.get("teacherName");
                String classTime = (String) v.get("classTime");
                boolean isActive = (boolean) v.get("isActive");
                if (isActive) {
                    isActiveBooleanToString = "ยังเปิดให้เช็คชื่อ";
                } else if (!isActive) {
                    isActiveBooleanToString = "ปิดการเช็คชื่อแล้ว";
                }
                model.addRow(new String[]{sessionID, subjectName, teacherName, classTime, isActiveBooleanToString});
            });
        } else {
            boolean selectedActiveStatus;
            selectedActiveStatus = selectedCheckInStatus.equalsIgnoreCase("ยังเปิดให้เช็คชื่อ");
            checkClassinfo.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 16));
            checkInHistory.forEach((k, v) -> {
                String sessionID = (String) v.get("sessionID");
                boolean isActive = (boolean) v.get("isActive");
                if (isActive) {
                    isActiveBooleanToString = "ยังเปิดให้เช็คชื่อ";
                } else if (!isActive) {
                    isActiveBooleanToString = "ปิดการเช็คชื่อแล้ว";
                }
                if (isActive == selectedActiveStatus) {
                    String subjectName = (String) v.get("subjectName");
                    String teacherName = (String) v.get("teacherName");
                    String classTime = (String) v.get("classTime");
                    model.addRow(new String[]{sessionID, subjectName, teacherName, classTime, isActiveBooleanToString});
                }
            });
        }

    }//GEN-LAST:event_checkInSessionComboBoxItemStateChanged

    private void refreshCheckInTableData() {
        DefaultTableModel model = (DefaultTableModel) checkClassinfo.getModel();
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged(); // notifies the JTable that the model has changed
        searchCheckInSessionCodeTextField.setText("");
        showAllCheckInSessions();
        checkInSessionComboBox.setSelectedIndex(0);
    }

    private Map<String, Object> toCheckInDataMap() {
        String subjectID = SubjectIDTextField.getText();
        String subjectName = SubjectNameTextField.getText();
        String classTime = durationTextField.getText();
        String classroom = classroomTextField.getText();
        String teacherName = teacherNameTextField.getText();
        String subjectInfo = subjectInfoTextField.getText();

        Map<String, Object> checkInData = new HashMap<>();
        ArrayList<String> studentCheckIn = new ArrayList<>();

        checkInData.put("subjectID", subjectID);
        checkInData.put("subjectName", subjectName);
        checkInData.put("classTime", classTime);
        checkInData.put("classroom", classroom);
        checkInData.put("teacherName", teacherName);
        checkInData.put("sessionNote", subjectInfo);
        checkInData.put("isActive", true);
        checkInData.put("studentCheckIn", studentCheckIn);

        return checkInData;
    }
    // End of variables declaration//GEN-END:variables
}
