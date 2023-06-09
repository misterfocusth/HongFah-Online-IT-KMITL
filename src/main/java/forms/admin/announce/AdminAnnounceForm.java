/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package forms.admin.announce;

import announce.Announce;
import dialog.InfoDialog;
import dialog.OptionDialog;
import handlers.AnnounceHandler;

/**
 *
 * @author misterfocusth
 */
public class AdminAnnounceForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form AdminAnnounceForm
     */
    public AdminAnnounceForm() {
        initComponents();
        showCurrentAnnouncement();
    }

    private void showCurrentAnnouncement() {
        Announce announce = AnnounceHandler.handlerGetCurrentAnnouncement();
        announceTitleTextField.setText(announce.getAnnounceTitle());
        announceBodyTextArea.setText(announce.getAnnounceBody());
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        announceTitleTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        announceBodyTextArea = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        resetAnnounceButton = new javax.swing.JButton();
        saveAnnounceButton = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/announce/icons8-email-send-48.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("ข่าวประกาศ / ประชาสัมพันธ์");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("สำหรับนักศึกษาคณะเทคโนโลยีสารสนเทศ");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ข่าวประกาศล่าสุด / ปัจจุบัน", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        announceTitleTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("หัวเรื่องประกาศ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("เนื้อเรื่องประกาศ");

        announceBodyTextArea.setColumns(20);
        announceBodyTextArea.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        announceBodyTextArea.setRows(5);
        jScrollPane1.setViewportView(announceBodyTextArea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(announceTitleTextField, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(12, 12, 12))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(announceTitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        resetAnnounceButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        resetAnnounceButton.setForeground(new java.awt.Color(242, 103, 33));
        resetAnnounceButton.setText("รีเซ็ตประกาศ");
        resetAnnounceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetAnnounceButtonActionPerformed(evt);
            }
        });

        saveAnnounceButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        saveAnnounceButton.setForeground(new java.awt.Color(41, 121, 255));
        saveAnnounceButton.setText("บันทึกประกาศ");
        saveAnnounceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAnnounceButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(115, Short.MAX_VALUE)
                .addComponent(resetAnnounceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(saveAnnounceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(115, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resetAnnounceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveAnnounceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3))
                    .addComponent(jLabel1))
                .addGap(24, 24, 24)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean validDateInputData() {
        return !announceTitleTextField.getText().isEmpty() && !announceBodyTextArea.getText().isEmpty();
    }
    private void resetAnnounceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetAnnounceButtonActionPerformed
        if (!validDateInputData()) {
            return;
        }
        if (new OptionDialog("ยืนยันการล้างประกาศ / ประชาสัมพันธ์", "ต้องการล้างประกาศ เเละ/หรือข้อความประชาสัมพันธ์ปัจจุบันหรือไม่").show() == 0) {
            if (AnnounceHandler.handleUpdateAnnouncement("ยังไม่มีประกาศ / ประชาสัมพันธ์", "ยังไม่มีประกาศ / ประชาสัมพันธ์")) {
                announceTitleTextField.setText("ยังไม่มีประกาศ / ประชาสัมพันธ์");
                announceBodyTextArea.setText("ยังไม่มีประกาศ / ประชาสัมพันธ์");
                new InfoDialog("", "ล้างประกาศ / ประชาสัมพันธ์เรียบร้อยเเล้ว").show();
            }
        }
    }//GEN-LAST:event_resetAnnounceButtonActionPerformed

    private void saveAnnounceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAnnounceButtonActionPerformed
        if (!validDateInputData()) {
            return;
        }
        if (new OptionDialog("อัพเดทการล้างประกาศ / ประชาสัมพันธ์ ?", "ต้องการอัพเดท แก้ไขข้อมูลประกาศ เเละ/หรือข้อความประชาสัมพันธ์ปัจจุบันหรือไม่").show() == 0) {
            if (AnnounceHandler.handleUpdateAnnouncement(announceTitleTextField.getText(), announceBodyTextArea.getText())) {
                new InfoDialog("", "อัพเดทประกาศ / ประชาสัมพันธ์เรียบร้อยแล้ว").show();
            }
        }
    }//GEN-LAST:event_saveAnnounceButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea announceBodyTextArea;
    private javax.swing.JTextField announceTitleTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton resetAnnounceButton;
    private javax.swing.JButton saveAnnounceButton;
    // End of variables declaration//GEN-END:variables
}
