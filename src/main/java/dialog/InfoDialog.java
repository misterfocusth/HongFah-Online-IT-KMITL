package dialog;

import interfaces.AlertDialog;

import javax.swing.*;
import java.awt.*;

public class InfoDialog extends Dialog implements AlertDialog {

    public InfoDialog() {

    }

    public InfoDialog(Component parentComponent, String message, String dialogTitle) {
        super(parentComponent, dialogTitle, message);
    }

    public InfoDialog(String dialogTitle, String message) {
        super(dialogTitle, message);
    }

    public void show() {
        JLabel message = this.getMessage();
        String dialogTitle = this.getDialogTitle();
        Component parentComponent = this.getParentComponent();
        JOptionPane.showMessageDialog(parentComponent, message, dialogTitle, JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public int showOptionDialog() {
        return 0;
    }
}
