/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dialog;

import javax.swing.*;
import java.awt.*;

/**
 * @author misterfocusth
 */
public class OptionDialog extends Dialog {

    public OptionDialog() {

    }

    public OptionDialog(Component parentComponent, String message, String dialogTitle) {
        super(parentComponent, dialogTitle, message);
    }

    public OptionDialog(String dialogTitle, String message) {
        super(dialogTitle, message);
    }

    @Override
    public void show() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int showDialog() {
        JLabel message = this.getMessage();
        String dialogTitle = this.getDialogTitle();
        Component parentComponent = this.getParentComponent();
        return JOptionPane.showConfirmDialog(parentComponent, message, dialogTitle, JOptionPane.YES_NO_OPTION);
    }

}
