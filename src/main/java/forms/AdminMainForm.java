/*
 * IG : i_am_bnkt
 */
package forms;

import dialog.OptionDialog;
import forms.admin.announce.AdminAnnounceForm;
import forms.student.about.AboutForm;
import forms.student.login.NewLoginForm;
import helper.FrameHelper;
import user.AuthUser;

/**
 *
 * @author USER
 */
public class AdminMainForm extends javax.swing.JFrame {

    /**
     * Creates new form AdminMainForm
     */
    public AdminMainForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        mainDesktopPane = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        aboutMenu = new javax.swing.JMenu();
        answerMenu = new javax.swing.JMenu();
        docMenu = new javax.swing.JMenu();
        logoutMenu = new javax.swing.JMenu();
        announceMenu = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainDesktopPane.setBackground(new java.awt.Color(19, 169, 240));
        mainDesktopPane.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout mainDesktopPaneLayout = new javax.swing.GroupLayout(mainDesktopPane);
        mainDesktopPane.setLayout(mainDesktopPaneLayout);
        mainDesktopPaneLayout.setHorizontalGroup(
            mainDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1003, Short.MAX_VALUE)
        );
        mainDesktopPaneLayout.setVerticalGroup(
            mainDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 765, Short.MAX_VALUE)
        );

        jMenuBar1.setPreferredSize(new java.awt.Dimension(690, 35));

        aboutMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu_icons/icons8-info-28.png"))); // NOI18N
        aboutMenu.setText("เกี่ยวกับโปรแกรม");
        aboutMenu.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        aboutMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(aboutMenu);

        answerMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons_48x48/icons8-composing-mail-48.png"))); // NOI18N
        answerMenu.setText("คำถามทั้งหมด");
        answerMenu.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jMenuBar1.add(answerMenu);

        docMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home_form_icons/icons8-document-48.png"))); // NOI18N
        docMenu.setText("เอกสารทั้งหมด");
        docMenu.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jMenuBar1.add(docMenu);

        logoutMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu_icons/icons8-logout-28.png"))); // NOI18N
        logoutMenu.setText("ออกจากระบบ");
        logoutMenu.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        logoutMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(logoutMenu);

        announceMenu.setText("จัดการประกาศ / ประชาสัมพันธ์");
        announceMenu.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        announceMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                announceMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(announceMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainDesktopPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainDesktopPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aboutMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutMenuMouseClicked
        AboutForm aboutForm = new AboutForm();
        aboutForm.setLocationRelativeTo(null);
        aboutForm.setVisible(true);
    }//GEN-LAST:event_aboutMenuMouseClicked
    
    private void logoutMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMenuMouseClicked
        int selectedOpt = new OptionDialog("ออกจากระบบ", "ยืนยันที่จะออกจากระบบ หรือไม่ ?").show();
        if (selectedOpt == 0) {
            AuthUser.setAuthUser(null);
            NewLoginForm newLoginForm = new NewLoginForm();
            newLoginForm.setLocationRelativeTo(null);
            newLoginForm.setVisible(true);
            this.setVisible(false);
            this.dispose();
            AdminMainForm.mainDesktopPane.removeAll();
            AdminMainForm.mainDesktopPane.updateUI();
        }
    }//GEN-LAST:event_logoutMenuMouseClicked
    
    private void announceMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_announceMenuMouseClicked
        AdminAnnounceForm adminAnnounceForm = new AdminAnnounceForm();
        FrameHelper.setLocationToCenter(adminAnnounceForm);
        AdminMainForm.mainDesktopPane.add(adminAnnounceForm);
        adminAnnounceForm.setVisible(true);
    }//GEN-LAST:event_announceMenuMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                    
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminMainForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
            
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminMainForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
            
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminMainForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
            
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminMainForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminMainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu aboutMenu;
    private javax.swing.JMenu announceMenu;
    private javax.swing.JMenu answerMenu;
    private javax.swing.JMenu docMenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenu logoutMenu;
    public static javax.swing.JDesktopPane mainDesktopPane;
    // End of variables declaration//GEN-END:variables

}
