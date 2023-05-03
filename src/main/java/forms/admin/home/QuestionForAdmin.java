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

        jScrollPane1 = new javax.swing.JScrollPane();
        questionTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setIconifiable(true);

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
        jLabel1.setText("คำถามที่ส่งเข้ามาสำหรับเจ้าหน้าที่");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons_48x48/icons8-composing-mail-48.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(281, 281, 281))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable questionTable;
    // End of variables declaration//GEN-END:variables
}
