/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package forms.student.document;

import document.GeneralRequestDocument;
import document.LeaveRequestDocument;
import forms.MainForm;
import forms.student.contact.ContactStaffHomeForm;
import handlers.document.GeneralDocHandler;
import handlers.document.LeaveDocHandler;
import helper.FrameHelper;
import user.AuthUser;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.HashMap;

/**
 * @author misterfocusth
 */
public class DocRequestHistoryForm extends javax.swing.JInternalFrame {

    private final String studentId = AuthUser.getAuthUser().getUsername();
    private HashMap<String, HashMap<String, Object>> requestedGeneralDocuments = new HashMap<>();
    private HashMap<String, HashMap<String, Object>> requestedLeaveDocuments = new HashMap<>();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel contactStaffLabel;
    private javax.swing.JComboBox<String> genDocStatusComboBox;
    private javax.swing.JPanel genReqFormMenu;
    private javax.swing.JTable generalDocHistoryTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable leaveDocHistoryTable;
    private javax.swing.JComboBox<String> leaveDocStatusComboBox;
    private javax.swing.JPanel leaveReqFormMenu;
    /**
     * Creates new form DocRequestHistoryForm
     */
    public DocRequestHistoryForm() {
        initComponents();
        getAllRequestedGeneralDocuments();
        getAllRequestedLeaveDocuments();
    }

    private void getAllRequestedGeneralDocuments() {
        DefaultTableModel model = (DefaultTableModel) generalDocHistoryTable.getModel();
        generalDocHistoryTable.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 16));
        requestedGeneralDocuments = GeneralDocHandler.handleGetAllDocumentsByStudentId(studentId);
        requestedGeneralDocuments.forEach((k, v) -> {
            String documentId = (String) v.get("documentId");
            String requestedAtDay = (String) v.get("requestedAtDay");
            String requestedAtMonth = (String) v.get("requestedAtMonth");
            String requestedAtYear = (String) v.get("requestedAtYear");
            String requestedDate = requestedAtDay + " " + requestedAtMonth + " " + requestedAtYear;
            String requestTitle = (String) v.get("requestTitle");
            String requestStatus = (String) v.get("requestStatus");
            model.addRow(new String[]{documentId.toUpperCase(), requestedDate, requestTitle, requestStatus});
        });
    }

    private void getAllRequestedLeaveDocuments() {
        DefaultTableModel model = (DefaultTableModel) leaveDocHistoryTable.getModel();
        leaveDocHistoryTable.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 16));
        requestedLeaveDocuments = LeaveDocHandler.handleGetAllDocumentsByStudentId(studentId);
        requestedLeaveDocuments.forEach((k, v) -> {
            String documentId = (String) v.get("documentId");
            String requestedAtDay = (String) v.get("requestedAtDay");
            String requestedAtMonth = (String) v.get("requestedAtMonth");
            String requestedAtYear = (String) v.get("requestedAtYear");
            String requestedDate = requestedAtDay + " " + requestedAtMonth + " " + requestedAtYear;
            String otherLeaveTitle = (String) v.get("otherLeaveTitle");
            String requestStatus = (String) v.get("requestStatus");
            model.addRow(new String[]{documentId.toUpperCase(), requestedDate, otherLeaveTitle, requestStatus});
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        generalDocHistoryTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        leaveDocHistoryTable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        genDocStatusComboBox = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        leaveDocStatusComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        contactStaffLabel = new javax.swing.JLabel();
        leaveReqFormMenu = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        genReqFormMenu = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons_96x96/icons8-documents-96.png"))); // NOI18N

        generalDocHistoryTable.setAutoCreateRowSorter(true);
        generalDocHistoryTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        generalDocHistoryTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{

                },
                new String[]{
                        "เลขที่เอกสาร", "ยื่นเอกสารเมื่อ", "เรื่อง", "สถานะเอกสาร"
                }
        ) {
            final boolean[] canEdit = new boolean[]{
                    false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        generalDocHistoryTable.setRowHeight(35);
        generalDocHistoryTable.setShowGrid(true);
        generalDocHistoryTable.getTableHeader().setReorderingAllowed(false);
        generalDocHistoryTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                generalDocHistoryTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(generalDocHistoryTable);
        if (generalDocHistoryTable.getColumnModel().getColumnCount() > 0) {
            generalDocHistoryTable.getColumnModel().getColumn(0).setResizable(false);
            generalDocHistoryTable.getColumnModel().getColumn(1).setResizable(false);
            generalDocHistoryTable.getColumnModel().getColumn(2).setResizable(false);
            generalDocHistoryTable.getColumnModel().getColumn(3).setResizable(false);
        }

        leaveDocHistoryTable.setAutoCreateRowSorter(true);
        leaveDocHistoryTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        leaveDocHistoryTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{

                },
                new String[]{
                        "เลขที่เอกสาร", "ยื่นเอกสารเมื่อ", "เรื่อง", "สถานะเอกสาร"
                }
        ) {
            final boolean[] canEdit = new boolean[]{
                    false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        leaveDocHistoryTable.setRowHeight(35);
        leaveDocHistoryTable.setShowGrid(true);
        leaveDocHistoryTable.getTableHeader().setReorderingAllowed(false);
        leaveDocHistoryTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                leaveDocHistoryTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(leaveDocHistoryTable);
        if (leaveDocHistoryTable.getColumnModel().getColumnCount() > 0) {
            leaveDocHistoryTable.getColumnModel().getColumn(0).setResizable(false);
            leaveDocHistoryTable.getColumnModel().getColumn(1).setResizable(false);
            leaveDocHistoryTable.getColumnModel().getColumn(2).setResizable(false);
            leaveDocHistoryTable.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ประวัติการยื่นรายการคำร้องทั่วไป");

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("ประวัติการยื่นลาเรียน");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("เลือกดูตามสถานะของเอกสาร");

        genDocStatusComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        genDocStatusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"ดูรายการเอกสารทั้งหมด", "ยื่นเอกสารแล้ว", "กำลังตรวจสอบเอกสาร", "อนุญาต / ผ่าน", "ไม่อนุญาต / ไม่ผ่าน"}));
        genDocStatusComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                genDocStatusComboBoxItemStateChanged(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("เลือกดูตามสถานะของเอกสาร");

        leaveDocStatusComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        leaveDocStatusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"ดูรายการเอกสารทั้งหมด", "ยื่นเอกสารแล้ว", "กำลังตรวจสอบเอกสาร", "อนุญาตให้ลา", "ไม่อนุญาตให้ลา"}));
        leaveDocStatusComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                leaveDocStatusComboBoxItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabel5)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(genDocStatusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel8)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(leaveDocStatusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 106, Short.MAX_VALUE))
                                        .addComponent(jScrollPane1)
                                        .addComponent(jScrollPane2))
                                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel5)
                                        .addComponent(genDocStatusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8)
                                        .addComponent(leaveDocStatusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0))
        );

        jLabel2.setBackground(new java.awt.Color(0, 102, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 255));
        jLabel2.setText("ประวัติการยื่นคำร้องเเละเอกสารทั้งหมด");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("ดูรายละเอียด สถานะ ประวัติรายการคำร้องเเละเอกสารที่ยื่น");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("มีข้อสงสัยเกี่ยวกับการยื่นเอกสาร ? ");

        contactStaffLabel.setBackground(new java.awt.Color(0, 102, 255));
        contactStaffLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        contactStaffLabel.setForeground(new java.awt.Color(0, 102, 255));
        contactStaffLabel.setText("ติดต่อห้องฟ้า");
        contactStaffLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contactStaffLabelMouseClicked(evt);
            }
        });

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

        genReqFormMenu.setBackground(new java.awt.Color(255, 255, 255));
        genReqFormMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        genReqFormMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                genReqFormMenuMouseClicked(evt);
            }
        });

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home_form_icons/icons8-document-48.png"))); // NOI18N

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setText("เเบบฟอร์มคำร้องทั่วไป");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("คำร้องทั่วไปเพื่อพิจารณาดำเนินการต่อ");

        javax.swing.GroupLayout genReqFormMenuLayout = new javax.swing.GroupLayout(genReqFormMenu);
        genReqFormMenu.setLayout(genReqFormMenuLayout);
        genReqFormMenuLayout.setHorizontalGroup(
                genReqFormMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(genReqFormMenuLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel22)
                                .addGap(18, 18, 18)
                                .addGroup(genReqFormMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel23)
                                        .addComponent(jLabel24))
                                .addGap(12, 12, 12))
        );
        genReqFormMenuLayout.setVerticalGroup(
                genReqFormMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(genReqFormMenuLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(genReqFormMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(genReqFormMenuLayout.createSequentialGroup()
                                                .addComponent(jLabel23)
                                                .addGap(6, 6, 6)
                                                .addComponent(jLabel24))
                                        .addComponent(jLabel22))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel4)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(contactStaffLabel)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(leaveReqFormMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(genReqFormMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel2)
                                                        .addGap(12, 12, 12)
                                                        .addComponent(jLabel3)
                                                        .addGap(12, 12, 12)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabel4)
                                                                .addComponent(contactStaffLabel)))
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                        .addComponent(genReqFormMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(leaveReqFormMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void leaveReqFormMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leaveReqFormMenuMouseClicked
        LeaveDocRequestForm leaveDocRequestForm = new LeaveDocRequestForm();
        FrameHelper.setLocationToCenter(leaveDocRequestForm);
        MainForm.mainDesktopPane.add(leaveDocRequestForm);
        leaveDocRequestForm.setVisible(true);
    }//GEN-LAST:event_leaveReqFormMenuMouseClicked

    private void genReqFormMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_genReqFormMenuMouseClicked
        GeneralDocRequestForm generalDocRequestForm = new GeneralDocRequestForm();
        FrameHelper.setLocationToCenter(generalDocRequestForm);
        MainForm.mainDesktopPane.add(generalDocRequestForm);
        generalDocRequestForm.setVisible(true);
    }//GEN-LAST:event_genReqFormMenuMouseClicked

    private void generalDocHistoryTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generalDocHistoryTableMouseClicked
        JTable target = (JTable) evt.getSource();
        int selectedRow = target.getSelectedRow();
        String selectedDocId = (String) generalDocHistoryTable.getValueAt(selectedRow, 0);
        GeneralRequestDocument selectedDocData = GeneralDocHandler.handleGetDocumentById(selectedDocId);
        GeneralDocDetailForm generalDocDetailForm = new GeneralDocDetailForm(selectedDocData);
        FrameHelper.setLocationToCenter(generalDocDetailForm);
        MainForm.mainDesktopPane.add(generalDocDetailForm);
        generalDocDetailForm.setVisible(true);
    }//GEN-LAST:event_generalDocHistoryTableMouseClicked

    private void leaveDocHistoryTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leaveDocHistoryTableMouseClicked
        JTable target = (JTable) evt.getSource();
        int selectedRow = target.getSelectedRow();
        String selectedDocId = (String) leaveDocHistoryTable.getValueAt(selectedRow, 0);
        LeaveRequestDocument selectedDocData = LeaveDocHandler.handleGetLeaveDocumentById(selectedDocId);
        LeaveDocDetailForm leaveDocDetailForm = new LeaveDocDetailForm(selectedDocData);
        FrameHelper.setLocationToCenter(leaveDocDetailForm);
        MainForm.mainDesktopPane.add(leaveDocDetailForm);
        leaveDocDetailForm.setVisible(true);
    }//GEN-LAST:event_leaveDocHistoryTableMouseClicked

    private void contactStaffLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactStaffLabelMouseClicked
        ContactStaffHomeForm contactStaffHomeForm = new ContactStaffHomeForm();
        FrameHelper.setLocationToCenter(contactStaffHomeForm);
        MainForm.mainDesktopPane.add(contactStaffHomeForm);
        contactStaffHomeForm.setVisible(true);
    }//GEN-LAST:event_contactStaffLabelMouseClicked

    private void filterJTableByComboBoxStatus(JTable targetTable, JComboBox<String> selectedComboBox) {
        DefaultTableModel model = (DefaultTableModel) targetTable.getModel();
        String currentSelectedStatus = (String) selectedComboBox.getSelectedItem();
        model.setRowCount(0);

        if (targetTable.equals(generalDocHistoryTable)) {
            if (currentSelectedStatus.equalsIgnoreCase("ดูรายการเอกสารทั้งหมด")) {
                requestedGeneralDocuments.forEach((k, v) -> {
                    String requestStatus = (String) v.get("requestStatus");
                    String documentId = (String) v.get("documentId");
                    String requestedAtDay = (String) v.get("requestedAtDay");
                    String requestedAtMonth = (String) v.get("requestedAtMonth");
                    String requestedAtYear = (String) v.get("requestedAtYear");
                    String requestedDate = requestedAtDay + " " + requestedAtMonth + " " + requestedAtYear;
                    String otherLeaveTitle = (String) v.get("otherLeaveTitle");
                    model.addRow(new String[]{documentId.toUpperCase(), requestedDate, otherLeaveTitle, requestStatus});
                });
            } else {
                requestedGeneralDocuments.forEach((k, v) -> {
                    String requestStatus = (String) v.get("requestStatus");
                    if (requestStatus.equalsIgnoreCase(currentSelectedStatus)) {
                        String documentId = (String) v.get("documentId");
                        String requestedAtDay = (String) v.get("requestedAtDay");
                        String requestedAtMonth = (String) v.get("requestedAtMonth");
                        String requestedAtYear = (String) v.get("requestedAtYear");
                        String requestedDate = requestedAtDay + " " + requestedAtMonth + " " + requestedAtYear;
                        String otherLeaveTitle = (String) v.get("otherLeaveTitle");
                        model.addRow(new String[]{documentId.toUpperCase(), requestedDate, otherLeaveTitle, requestStatus});
                    }
                });
            }
        } else if (targetTable.equals(leaveDocHistoryTable)) {
            if (currentSelectedStatus.equalsIgnoreCase("ดูรายการเอกสารทั้งหมด")) {
                requestedLeaveDocuments.forEach((k, v) -> {
                    String documentId = (String) v.get("documentId");
                    String requestedAtDay = (String) v.get("requestedAtDay");
                    String requestedAtMonth = (String) v.get("requestedAtMonth");
                    String requestedAtYear = (String) v.get("requestedAtYear");
                    String requestedDate = requestedAtDay + " " + requestedAtMonth + " " + requestedAtYear;
                    String otherLeaveTitle = (String) v.get("otherLeaveTitle");
                    String requestStatus = (String) v.get("requestStatus");
                    model.addRow(new String[]{documentId.toUpperCase(), requestedDate, otherLeaveTitle, requestStatus});
                });
            } else {
                requestedLeaveDocuments.forEach((k, v) -> {
                    String requestStatus = (String) v.get("requestStatus");
                    if (requestStatus.equalsIgnoreCase(currentSelectedStatus)) {
                        String documentId = (String) v.get("documentId");
                        String requestedAtDay = (String) v.get("requestedAtDay");
                        String requestedAtMonth = (String) v.get("requestedAtMonth");
                        String requestedAtYear = (String) v.get("requestedAtYear");
                        String requestedDate = requestedAtDay + " " + requestedAtMonth + " " + requestedAtYear;
                        String otherLeaveTitle = (String) v.get("otherLeaveTitle");
                        model.addRow(new String[]{documentId.toUpperCase(), requestedDate, otherLeaveTitle, requestStatus});
                    }
                });
            }
        }

    }

    private void genDocStatusComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_genDocStatusComboBoxItemStateChanged
        JComboBox<String> selectedComboBox = (JComboBox<String>) evt.getSource();
        filterJTableByComboBoxStatus(generalDocHistoryTable, selectedComboBox);
    }//GEN-LAST:event_genDocStatusComboBoxItemStateChanged

    private void leaveDocStatusComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_leaveDocStatusComboBoxItemStateChanged
        JComboBox<String> selectedComboBox = (JComboBox<String>) evt.getSource();
        filterJTableByComboBoxStatus(leaveDocHistoryTable, selectedComboBox);
    }//GEN-LAST:event_leaveDocStatusComboBoxItemStateChanged
    // End of variables declaration//GEN-END:variables
}
