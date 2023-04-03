/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helper;

import javax.swing.*;
import java.awt.*;

/**
 * @author misterfocusth
 */
public class FrameLocationHelper {

    public static void setLocationToCenter(JInternalFrame frame) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth();
        double height = screenSize.getHeight();
        Dimension frameSize = frame.getSize();
        double x = (width - frameSize.width) / 2;
        double y = (height - frameSize.height - 100) / 2;
        frame.setLocation((int) x, (int) y);
    }

}
