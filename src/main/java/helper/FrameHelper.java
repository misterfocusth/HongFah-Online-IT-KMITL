/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helper;

import forms.MainForm;

import javax.swing.*;
import java.awt.*;

/**
 * @author misterfocusth
 */
public class FrameHelper {

    public static MainForm currentMainForm = null;

    public static void setLocationToCenter(JInternalFrame frame) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth();
        double height = screenSize.getHeight();
        Dimension frameSize = frame.getSize();
        double x = (width - frameSize.width) / 2;
        double y = (height - frameSize.height - 100) / 2;
        frame.setLocation((int) x, (int) y);
    }

    public static void setLocationToCenter(JFrame frame) {
        frame.setLocationRelativeTo(null);
    }

    public static void disposeCurrentInternalFrame() {
        FrameHelper.currentMainForm.setVisible(false);
        FrameHelper.currentMainForm.dispose();
        MainForm.mainDesktopPane = new JDesktopPane();
    }

}
