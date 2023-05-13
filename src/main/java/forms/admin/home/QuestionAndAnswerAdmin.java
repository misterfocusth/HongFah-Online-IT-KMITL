/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package forms.admin.home;

import dialog.InfoDialog;
import handlers.QuestionHandler;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import question.Question;
import user.Admin;
import user.AuthUser;
import user.Student;

/**
 *
 * @author prapada
 */
public class QuestionAndAnswerAdmin extends javax.swing.JInternalFrame {

    private Question selectedData;
    private Student student;
    private Map<String, Object> questionData = new HashMap<>();

    /**
     * Creates new form QuestionAndAnswerAdmin
     */
    public QuestionAndAnswerAdmin(Question selectedData, Student student) {
        initComponents();
        this.selectedData = selectedData;
        this.student = student;
        showQuestionData();
    }

    private void showQuestionData() {
        questionTitle.setText(selectedData.getQuestionTitle());
        questionBy.setText(student.getThFirstName() + " " + student.getThLastName());
        questionBody.setText(selectedData.getQuestionBody());
        if (selectedData.getAnswerBody().equals("ยังไม่มีการตอบกลับ (กำลังรอการตอบกลับจากเจ้าหน้าที่)")) {
            questionResponseTextArea.setText("");
        } else {
            questionResponseTextArea.setText(selectedData.getAnswerBody());
        }

        questionTitle.setEditable(false);
        questionBody.setEditable(false);
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
        jScrollPane4 = new javax.swing.JScrollPane();
        questionResponseTextArea = new javax.swing.JTextArea();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        questionBodyTextArea = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        questionTitleTextField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        createdBy = new javax.swing.JLabel();
        createdAt = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        repliedBy = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        repliedAt = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        questionResponseTextArea1 = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        questionBy = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        questionTitle = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        questionBody = new javax.swing.JTextArea();
        AnswerButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setText("ส่งคำตอบสำหรับเจ้าหน้าที่");

        questionResponseTextArea.setColumns(20);
        questionResponseTextArea.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        questionResponseTextArea.setLineWrap(true);
        questionResponseTextArea.setTabSize(0);
        questionResponseTextArea.setWrapStyleWord(true);
        jScrollPane4.setViewportView(questionResponseTextArea);

        jInternalFrame1.setClosable(true);
        jInternalFrame1.setIconifiable(true);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        questionBodyTextArea.setColumns(20);
        questionBodyTextArea.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        questionBodyTextArea.setLineWrap(true);
        questionBodyTextArea.setTabSize(0);
        questionBodyTextArea.setWrapStyleWord(true);
        jScrollPane2.setViewportView(questionBodyTextArea);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("คำถามที่ต้องการติดต่อเจ้าหน้าที่");

        questionTitleTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("หัวเรื่องคำถาม");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons_48x48/icons8-male-user-48.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("ถามโดย : ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("สร้างคำถามเมื่อ : ");

        createdBy.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        createdBy.setText("jLabel5");

        createdAt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        createdAt.setText("jLabel5");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "การตอบกลับจากเจ้าหน้าที่", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        repliedBy.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        repliedBy.setText("jLabel5");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("ตอบคำถามโดย : ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("ตอบกลับเมื่อ : ");

        repliedAt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        repliedAt.setText("jLabel5");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons_48x48/icons8-male-user-48.png"))); // NOI18N

        questionResponseTextArea1.setColumns(20);
        questionResponseTextArea1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        questionResponseTextArea1.setLineWrap(true);
        questionResponseTextArea1.setTabSize(0);
        questionResponseTextArea1.setText("ยังไม่มีการตอบกลับ (กำลังรอการตอบกลับจากเจ้าหน้าที่)");
        questionResponseTextArea1.setWrapStyleWord(true);
        jScrollPane5.setViewportView(questionResponseTextArea1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(repliedBy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(repliedAt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(repliedBy))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(repliedAt))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jInternalFrame1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(createdBy))
                                .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(createdAt))))
                        .addComponent(questionTitleTextField)
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(24, 24, 24))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel4)
                .addGap(0, 0, 0)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(createdBy))
                        .addGap(7, 7, 7)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(createdAt))))
                .addGap(24, 24, 24)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(questionTitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("ถามโดย : ");

        questionBy.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        questionBy.setText("jLabel5");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("รายละเอียดคำถาม");

        questionTitle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        questionTitle.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        questionTitle.setText("หัวข้อคำถาม");

        questionBody.setColumns(20);
        questionBody.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        questionBody.setRows(5);
        jScrollPane1.setViewportView(questionBody);

        AnswerButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AnswerButton.setForeground(new java.awt.Color(41, 121, 255));
        AnswerButton.setText("ส่งคำตอบ");
        AnswerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AnswerButtonMouseClicked(evt);
            }
        });
        AnswerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnswerButtonActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("ตอบคำถาม :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(questionBy))
                                    .addComponent(questionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane4)
                            .addComponent(AnswerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(24, 24, 24))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(questionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(questionBy))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AnswerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AnswerButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AnswerButtonMouseClicked
        questionData = toQuestionDataMap();

        if (questionResponseTextArea.getText().isEmpty()) {
            new InfoDialog("ยังไม่ได้กรอกคำตอบ", "โปรดตอบคำถาม ก่อนดำเนินการต่อ").show();
            return;
        } else if (QuestionHandler.handleUpdateAnswerAdmin(selectedData.getQuestionId(), (HashMap<String, Object>) questionData)) {
            new InfoDialog("บันทึกคำตอบเสร็จสิ้น", "ระบบได้บันทึกคำตอบของท่านแล้ว!").show();
            this.setVisible(false);
            this.dispose();
        }

    }//GEN-LAST:event_AnswerButtonMouseClicked

    private void AnswerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnswerButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AnswerButtonActionPerformed

    private Map<String, Object> toQuestionDataMap() {

        String questionTitle = selectedData.getQuestionTitle();
        String questionBody = selectedData.getQuestionBody();
        Admin admin = (Admin) AuthUser.getAuthUser();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String questionId = selectedData.getQuestionId();
        String answerBy = admin.getUsername();
        String answerAt = dtf.format(LocalDateTime.now());
        String questionResponse = "ตอบกลับเรียบร้อยแล้ว";
        String questionBy = selectedData.getQuestionBy();
        String questionAt = selectedData.getQuestionAt();
        String answerBody = questionResponseTextArea.getText();

        questionData.put("questionId", questionId);
        questionData.put("questionTitle", questionTitle);
        questionData.put("questionBody", questionBody);
        questionData.put("questionBy", questionBy);
        questionData.put("questionAt", questionAt);
        questionData.put("questionResponse", questionResponse);
        questionData.put("answerBy", answerBy);
        questionData.put("answerAt", answerAt);
        questionData.put("answerBody", answerBody);

        return questionData;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AnswerButton;
    private javax.swing.JLabel createdAt;
    private javax.swing.JLabel createdBy;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea questionBody;
    private javax.swing.JTextArea questionBodyTextArea;
    private javax.swing.JLabel questionBy;
    private javax.swing.JTextArea questionResponseTextArea;
    private javax.swing.JTextArea questionResponseTextArea1;
    private javax.swing.JTextField questionTitle;
    private javax.swing.JTextField questionTitleTextField;
    private javax.swing.JLabel repliedAt;
    private javax.swing.JLabel repliedBy;
    // End of variables declaration//GEN-END:variables
}
