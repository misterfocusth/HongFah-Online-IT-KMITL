/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package forms.admin.home;

import forms.AdminMainForm;
import handlers.QuestionHandler;
import handlers.StudentInfoHandler;
import helper.FrameHelper;
import java.awt.Font;
import java.util.HashMap;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import question.Question;
import user.Student;

/**
 *
 * @author prapada
 */
public class QuestionForAdmin extends javax.swing.JInternalFrame {

    private HashMap<String, HashMap<String, Object>> requestQuestion = new HashMap<>();

    /**
     * Creates new form QuestionForAdmin
     */
    public QuestionForAdmin() {
        initComponents();
        setQuestionTableData();
    }

    private void setQuestionTableData() {
        DefaultTableModel model = (DefaultTableModel) questionTable.getModel();
        questionTable.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 16));
        requestQuestion = QuestionHandler.handleGetAllQuestion();
        requestQuestion.forEach((k, v) -> {
            String questionId = (String) v.get("questionId");
            String questionTitle = (String) v.get("questionTitle");
            String studentId = (String) v.get("questionBy");
            String questionResponse = (String) v.get("questionResponse");
            model.addRow(new String[]{questionId.toUpperCase(), studentId, questionTitle, questionResponse});
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
        jScrollPane1 = new javax.swing.JScrollPane();
        questionTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        refresh2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setClosable(true);
        setIconifiable(true);

        questionTable.setAutoCreateRowSorter(true);
        questionTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        questionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "รหัสคำถาม", "รหัสนักศึกษา", "หัวเรื่องคำถาม", "สถานะการตอบกลับ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        questionTable.setRowHeight(35);
        questionTable.setShowGrid(true);
        questionTable.getTableHeader().setReorderingAllowed(false);
        questionTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                questionTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(questionTable);
        if (questionTable.getColumnModel().getColumnCount() > 0) {
            questionTable.getColumnModel().getColumn(0).setResizable(false);
            questionTable.getColumnModel().getColumn(1).setResizable(false);
            questionTable.getColumnModel().getColumn(2).setResizable(false);
            questionTable.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu_icons/icons8-faq-28.png"))); // NOI18N
        jLabel1.setText("ประวัติรายการคำถามทั้งหมด");
        jLabel1.setIconTextGap(6);

        refresh2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-reset-48.png"))); // NOI18N
        refresh2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refresh2MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("ตรวจสอบรายการคำถามทิ้งหมดที่นักศึกษาสร้างเเละส่งเข้ามา");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("กดเพื่อทำการโหลดข้อมูลคำถามใหม่ >>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(refresh2))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel2))
                            .addComponent(refresh2))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void questionTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_questionTableMouseClicked
        JTable target = (JTable) evt.getSource();
        int selectedRow = target.getSelectedRow();
        String selectedQuesId = (String) questionTable.getValueAt(selectedRow, 0);
        Question selectedQuesData = QuestionHandler.handleGetQuestionByQuestionID(selectedQuesId);
        System.out.println(selectedRow);
        System.out.println(selectedQuesData);
        Student student = new StudentInfoHandler().handleGetNameStudentByStudentId(selectedQuesData.getQuestionBy());

        QuestionAndAnswerAdmin questionDetailForm = new QuestionAndAnswerAdmin(selectedQuesData, student);
        FrameHelper.setLocationToCenter(questionDetailForm);
        AdminMainForm.mainDesktopPane.add(questionDetailForm);
        questionDetailForm.setVisible(true);
    }//GEN-LAST:event_questionTableMouseClicked

    private void refresh2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refresh2MouseClicked
        refreshHomeData();
    }//GEN-LAST:event_refresh2MouseClicked

    private void refreshHomeData() {
        DefaultTableModel model = (DefaultTableModel) questionTable.getModel();
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged(); // notifies the JTable that the model has changed

        questionTable.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 16));

        requestQuestion = QuestionHandler.handleGetAllQuestion();
        requestQuestion.forEach((k, v) -> {
            String questionId = (String) v.get("questionId");
            String questionTitle = (String) v.get("questionTitle");
            String studentId = (String) v.get("questionBy");
            String questionResponse = (String) v.get("questionResponse");
            model.addRow(new String[]{questionId.toUpperCase(), studentId, questionTitle, questionResponse});
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable questionTable;
    private javax.swing.JLabel refresh2;
    // End of variables declaration//GEN-END:variables
}
