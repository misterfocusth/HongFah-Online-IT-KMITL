package interfaces;

import forms.AdminMainForm;

import javax.swing.*;

public interface AdminAuth extends AuthAble {
    default void launchApp() {
        SwingUtilities.invokeLater(() -> {
            AdminMainForm adminMainForm = new AdminMainForm();
            adminMainForm.setExtendedState(JFrame.MAXIMIZED_BOTH);
            adminMainForm.setLocationRelativeTo(null);
            adminMainForm.setVisible(true);
        });
    }
}
