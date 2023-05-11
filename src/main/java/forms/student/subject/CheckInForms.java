/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package forms.student.subject;

import checkin.CheckInSession;
import dialog.InfoDialog;
import forms.MainForm;
import handlers.CheckInHandler;
import helper.FrameHelper;
import helper.InputValidationHelper;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import user.AuthUser;
import user.Student;

/**
 *
 * @author WINDOWS 10
 */
public class CheckInForms extends javax.swing.JInternalFrame implements KeyListener {

    private Map<String, Object> checkInData = new HashMap<>();
    private String prevCheckInCode = "";
    private CheckInSession selectedData;

    /**
     * Creates new form CheckinForms
     */
    public CheckInForms() {
        initComponents();
        codeTextField.addKeyListener(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cheeckbtn = new javax.swing.JButton();
        cancelbtn = new javax.swing.JButton();
        codeTextField = new javax.swing.JTextField();
        finalLabel = new javax.swing.JLabel();

        cheeckbtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cheeckbtn.setText("Check-in");
        cheeckbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cheeckbtnMouseClicked(evt);
            }
        });
        cheeckbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cheeckbtnActionPerformed(evt);
            }
        });

        cancelbtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cancelbtn.setText("Cancel");
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

        codeTextField.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        codeTextField.setText("123456");
        codeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codeTextFieldActionPerformed(evt);
            }
        });

        finalLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        finalLabel.setText("กรุณากรอกรหัส");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(finalLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(codeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cheeckbtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cancelbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23)))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(finalLabel)
                .addGap(32, 32, 32)
                .addComponent(codeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cheeckbtn)
                    .addComponent(cancelbtn))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cheeckbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cheeckbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cheeckbtnActionPerformed

    private void cancelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelbtnActionPerformed

    private void codeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codeTextFieldActionPerformed

    private void cheeckbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cheeckbtnMouseClicked
        if (codeTextField.getText().length() == 6) {
            if (codeTextField.getText() == selectedData.getSessionID()) {
                new InfoDialog("ไม่มีรหัสในระบบ", "ถูกต้อง!").show();
            } else {
                new InfoDialog("ไม่มีรหัสในระบบ", "ไม่มีรหัสเซคชั่นนี้อยู่ในระบบ!").show();
                codeTextField.setText("");
            }
        } else if (codeTextField.getText().length() < 6) {
            new InfoDialog("กรอกรหัสไม่ครบ", "โปรดกรอกรหัสเซคชั่นให้ครบ 6 หลัก").show();
        }
    }//GEN-LAST:event_cheeckbtnMouseClicked

    private void cancelbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelbtnMouseClicked
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_cancelbtnMouseClicked

    @Override
    public void keyTyped(KeyEvent e) {
        if (codeTextField.getText().length() >= 6) {
            e.consume();
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelbtn;
    private javax.swing.JButton cheeckbtn;
    private javax.swing.JTextField codeTextField;
    private javax.swing.JLabel finalLabel;
    // End of variables declaration//GEN-END:variables
}
