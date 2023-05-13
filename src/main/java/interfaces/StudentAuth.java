package interfaces;

import forms.MainForm;
import forms.student.announce.AnnounceForm;
import forms.student.home.NewHomeForm;
import helper.FrameHelper;

import javax.swing.*;

public interface StudentAuth extends AuthAble {
    default void launchApp() {
        SwingUtilities.invokeLater(() -> {
            NewHomeForm homeForm = new NewHomeForm();
            AnnounceForm announceForm = new AnnounceForm();
            MainForm mainForm = new MainForm();

            mainForm.setExtendedState(JFrame.MAXIMIZED_BOTH);
            mainForm.setLocationRelativeTo(null);
            mainForm.setVisible(true);

            FrameHelper.setLocationToCenter(homeForm);
            FrameHelper.currentMainForm = mainForm;

            mainForm.getMainDesktopPane().add(announceForm);
            mainForm.getMainDesktopPane().add(homeForm);

            announceForm.setVisible(true);
            homeForm.setVisible(true);
        });
    }
}
