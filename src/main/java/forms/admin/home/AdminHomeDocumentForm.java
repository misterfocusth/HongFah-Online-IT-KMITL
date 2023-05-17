/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package forms.admin.home;

import dialog.InfoDialog;
import document.GeneralRequestDocument;
import document.LeaveRequestDocument;
import forms.AdminMainForm;
import handlers.StudentInfoHandler;
import handlers.document.GeneralDocHandler;
import handlers.document.LeaveDocHandler;
import helper.FrameHelper;
import java.awt.Font;
import java.util.HashMap;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import user.Student;

/**
 *
 * @author pangggg
 */
public class AdminHomeDocumentForm extends javax.swing.JInternalFrame {

    private HashMap<String, HashMap<String, Object>> requestedGeneralDocuments = new HashMap<>();
    private HashMap<String, HashMap<String, Object>> requestedLeaveDocuments = new HashMap<>();

    /**
     * Creates new form AdminHomeForm
     */
    public AdminHomeDocumentForm() {
        initComponents();
        setGeneralDocTableData();
        setLeaveDocTableData();
    }

    private void setGeneralDocTableData() {
        DefaultTableModel model = (DefaultTableModel) generalDocHistoryTable.getModel();
        model.setRowCount(0);
        generalDocHistoryTable.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 16));
        requestedGeneralDocuments = GeneralDocHandler.handleGetAllGeneralDoc();
        requestedGeneralDocuments.forEach((k, v) -> {
            String docID = (String) v.get("documentId");
            String requestTitle = (String) v.get("requestTitle");
            String dateDoc = (String) v.get("requestedAtDay") + " " + (String) v.get("requestedAtMonth") + " " + (String) v.get("requestedAtYear");
            String requestStatus = (String) v.get("requestStatus");
            model.addRow(new String[]{docID.toUpperCase(), dateDoc, requestTitle, requestStatus});
        });
    }

    private void setLeaveDocTableData() {
        DefaultTableModel model = (DefaultTableModel) leaveDocHistoryTable.getModel();
        model.setRowCount(0);
        leaveDocHistoryTable.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 16));
        requestedLeaveDocuments = LeaveDocHandler.handleGetAllLeaveDoc();
        requestedLeaveDocuments.forEach((k, v) -> {
            String docID = (String) v.get("documentId");
            String requestTitle = (String) v.get("otherLeaveTitle");
            String dateDoc = (String) v.get("requestedAtDay") + " " + (String) v.get("requestedAtMonth") + " " + (String) v.get("requestedAtYear");
            String requestStatus = (String) v.get("requestStatus");
            model.addRow(new String[]{docID.toUpperCase(), dateDoc, requestTitle, requestStatus});
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

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        genDocStatusComboBox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        generalDocHistoryTable = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        leaveDocStatusComboBox = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        leaveDocHistoryTable = new javax.swing.JTable();
        searchByStudentIdTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        searchByStudentIdButton = new javax.swing.JButton();
        refreshLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setClosable(true);
        setIconifiable(true);

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ประวัติการยื่นรายการคำร้องทั่วไป");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("เลือกดูตามสถานะของเอกสาร :");

        genDocStatusComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        genDocStatusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ดูรายการเอกสารทั้งหมด", "ยื่นเอกสารแล้ว", "กำลังตรวจสอบเอกสาร", "อนุญาต / ผ่าน", "ไม่อนุญาต / ไม่ผ่าน" }));
        genDocStatusComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                genDocStatusComboBoxItemStateChanged(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("ประวัติการยื่นรายการคำร้องลาเรียน");

        generalDocHistoryTable.setAutoCreateRowSorter(true);
        generalDocHistoryTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        generalDocHistoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "เลขที่เอกสาร", "ยื่นเอกสารเมื่อ", "เรื่อง", "สถานะเอกสาร"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
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
        jScrollPane2.setViewportView(generalDocHistoryTable);
        if (generalDocHistoryTable.getColumnModel().getColumnCount() > 0) {
            generalDocHistoryTable.getColumnModel().getColumn(0).setResizable(false);
            generalDocHistoryTable.getColumnModel().getColumn(1).setResizable(false);
            generalDocHistoryTable.getColumnModel().getColumn(2).setResizable(false);
            generalDocHistoryTable.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("เลือกดูตามสถานะของเอกสาร :");

        leaveDocStatusComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        leaveDocStatusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ดูรายการเอกสารทั้งหมด", "ยื่นเอกสารแล้ว", "กำลังตรวจสอบเอกสาร", "อนุญาตให้ลา", "ไม่อนุญาตให้ลา" }));
        leaveDocStatusComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                leaveDocStatusComboBoxItemStateChanged(evt);
            }
        });

        leaveDocHistoryTable.setAutoCreateRowSorter(true);
        leaveDocHistoryTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        leaveDocHistoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "เลขที่เอกสาร", "ยื่นเอกสารเมื่อ", "เรื่อง", "สถานะเอกสาร"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
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
        jScrollPane3.setViewportView(leaveDocHistoryTable);
        if (leaveDocHistoryTable.getColumnModel().getColumnCount() > 0) {
            leaveDocHistoryTable.getColumnModel().getColumn(0).setResizable(false);
            leaveDocHistoryTable.getColumnModel().getColumn(1).setResizable(false);
            leaveDocHistoryTable.getColumnModel().getColumn(2).setResizable(false);
            leaveDocHistoryTable.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(leaveDocStatusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(genDocStatusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genDocStatusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(leaveDocStatusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );

        searchByStudentIdTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("เเสดงข้อมูลโดยใช้รหัสนักศึกษา / โหลดข้อมูลเอกสารใหม่ >>");

        searchByStudentIdButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        searchByStudentIdButton.setText("ค้นหา");
        searchByStudentIdButton.setPreferredSize(new java.awt.Dimension(100, 35));
        searchByStudentIdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByStudentIdButtonActionPerformed(evt);
            }
        });

        refreshLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-reset-48.png"))); // NOI18N
        refreshLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshLabelMouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons_96x96/icons8-documents-96.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 255));
        jLabel3.setText("ตรวจสอบประวัติรายการคำร้องทั่วไปเเละคำร้องลาเรียน");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("ประวัติเเละคำร้องทั้งหมดที่ถูกสร้างเเละยื่นเข้ามาในระบบ ไม่ว่าจะเป็น");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("รายการคำร้องทั่วไป เเละคำร้องลาเรียน รวมถึงสถานะเอกสารนั้น ๆ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
                                .addGap(59, 59, 59))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(searchByStudentIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(searchByStudentIdButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(refreshLabel))
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(54, 54, 54))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(12, 12, 12)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(searchByStudentIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(searchByStudentIdButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(refreshLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)))))
                .addGap(24, 24, 24)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generalDocHistoryTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generalDocHistoryTableMouseClicked
        JTable target = (JTable) evt.getSource();
        int selectedRow = target.getSelectedRow();
        String selectedDocId = (String) generalDocHistoryTable.getValueAt(selectedRow, 0);
        GeneralRequestDocument selectedDocData = GeneralDocHandler.handleGetDocumentById(selectedDocId);
        System.out.println(selectedRow);
        System.out.println(selectedDocData);
        Student student = new StudentInfoHandler().handleGetNameStudentByStudentId(selectedDocData.getRequestBy());

        GeneralDocumentForm generalDocumentForm = new GeneralDocumentForm(selectedDocData, student);
        FrameHelper.setLocationToCenter(generalDocumentForm);
        AdminMainForm.mainDesktopPane.add(generalDocumentForm);
        generalDocumentForm.setVisible(true);
    }//GEN-LAST:event_generalDocHistoryTableMouseClicked

    private void leaveDocHistoryTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leaveDocHistoryTableMouseClicked
        JTable target = (JTable) evt.getSource();
        int selectedRow = target.getSelectedRow();
        String selectedDocId = (String) leaveDocHistoryTable.getValueAt(selectedRow, 0);
        LeaveRequestDocument selectedDocData = LeaveDocHandler.handleGetLeaveDocumentById(selectedDocId);
        System.out.println(selectedRow);
        System.out.println(selectedDocData);
        Student student = new StudentInfoHandler().handleGetNameStudentByStudentId(selectedDocData.getRequestBy());

        LeaveDocumentForm leaveDocumentForm = new LeaveDocumentForm(selectedDocData, student);
        FrameHelper.setLocationToCenter(leaveDocumentForm);
        AdminMainForm.mainDesktopPane.add(leaveDocumentForm);
        leaveDocumentForm.setVisible(true);    }//GEN-LAST:event_leaveDocHistoryTableMouseClicked

    private void refreshLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshLabelMouseClicked
        DefaultTableModel genDocTableModel = (DefaultTableModel) generalDocHistoryTable.getModel();
        genDocTableModel.setRowCount(0);

        generalDocHistoryTable.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 16));
        requestedGeneralDocuments = GeneralDocHandler.handleGetAllGeneralDoc();
        requestedGeneralDocuments.forEach((k, v) -> {
            String docID = (String) v.get("documentId");
            String requestTitle = (String) v.get("requestTitle");
            String dateDoc = v.get("requestedAtDay") + " " + v.get("requestedAtMonth") + " " + v.get("requestedAtYear");
            String requestStatus = (String) v.get("requestStatus");
            genDocTableModel.addRow(new String[]{docID.toUpperCase(), dateDoc, requestTitle, requestStatus});
        });

        DefaultTableModel leaveDocTableModel = (DefaultTableModel) leaveDocHistoryTable.getModel();
        leaveDocTableModel.setRowCount(0);

        leaveDocHistoryTable.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 16));
        requestedLeaveDocuments = LeaveDocHandler.handleGetAllLeaveDoc();
        requestedLeaveDocuments.forEach((k, v) -> {
            String docID = (String) v.get("documentId");
            String requestTitle = (String) v.get("otherLeaveTitle");
            String dateDoc = v.get("requestedAtDay") + " " + v.get("requestedAtMonth") + " " + v.get("requestedAtYear");
            String requestStatus = (String) v.get("requestStatus");
            leaveDocTableModel.addRow(new String[]{docID.toUpperCase(), dateDoc, requestTitle, requestStatus});
        });

        genDocStatusComboBox.setSelectedIndex(0);
        leaveDocStatusComboBox.setSelectedIndex(0);
        searchByStudentIdTextField.setText("");
    }//GEN-LAST:event_refreshLabelMouseClicked

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
                    String requestTitle = (String) v.get("requestTitle");
                    model.addRow(new String[]{documentId.toUpperCase(), requestedDate, requestTitle, requestStatus});
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
                        String requestTitle = (String) v.get("requestTitle");
                        model.addRow(new String[]{documentId.toUpperCase(), requestedDate, requestTitle, requestStatus});
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

    private void searchByStudentIdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByStudentIdButtonActionPerformed
        String studentId = searchByStudentIdTextField.getText();
        requestedGeneralDocuments.clear();
        requestedLeaveDocuments.clear();
        requestedGeneralDocuments = GeneralDocHandler.handleGetAllDocumentsByStudentId(studentId);
        requestedLeaveDocuments = LeaveDocHandler.handleGetAllDocumentsByStudentId(studentId);
        if (requestedGeneralDocuments.size() == 0 && requestedLeaveDocuments.size() == 0) {
            new InfoDialog("ไม่พบข้อมูลรายการคำร้อง / เอกสาร", "ไม่พบข้อมูลเอกสารหรือคำร้องที่ถูกยื่นเข้ามาในระบบ โดยหมายเลขนักศึกษานี้").show();
        } else {
            DefaultTableModel generalDocTableModel = (DefaultTableModel) generalDocHistoryTable.getModel();
            generalDocTableModel.setRowCount(0);
            requestedGeneralDocuments.forEach((k, v) -> {
                String docID = (String) v.get("documentId");
                String requestTitle = (String) v.get("requestTitle");
                String dateDoc = (String) v.get("requestedAtDay") + " " + (String) v.get("requestedAtMonth") + " " + (String) v.get("requestedAtYear");
                String requestStatus = (String) v.get("requestStatus");
                generalDocTableModel.addRow(new String[]{docID.toUpperCase(), dateDoc, requestTitle, requestStatus});
            });
            DefaultTableModel leaveDocTableModel = (DefaultTableModel) leaveDocHistoryTable.getModel();
            leaveDocTableModel.setRowCount(0);
            requestedLeaveDocuments.forEach((k, v) -> {
                String docID = (String) v.get("documentId");
                String requestTitle = (String) v.get("otherLeaveTitle");
                String dateDoc = v.get("requestedAtDay") + " " + v.get("requestedAtMonth") + " " + v.get("requestedAtYear");
                String requestStatus = (String) v.get("requestStatus");
                leaveDocTableModel.addRow(new String[]{docID.toUpperCase(), dateDoc, requestTitle, requestStatus});
            });
        }
    }//GEN-LAST:event_searchByStudentIdButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> genDocStatusComboBox;
    private javax.swing.JTable generalDocHistoryTable;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable leaveDocHistoryTable;
    private javax.swing.JComboBox<String> leaveDocStatusComboBox;
    private javax.swing.JLabel refreshLabel;
    private javax.swing.JButton searchByStudentIdButton;
    private javax.swing.JTextField searchByStudentIdTextField;
    // End of variables declaration//GEN-END:variables
}
