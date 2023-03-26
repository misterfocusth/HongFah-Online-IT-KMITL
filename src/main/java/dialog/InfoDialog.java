package dialog;

import javax.swing.*;
import java.awt.*;

public class InfoDialog extends Dialog {

    public InfoDialog() {

    }

    public InfoDialog(Component parentComponent, String message, String dialogTitle) {
        super(parentComponent, dialogTitle, message);
    }

    public InfoDialog(String dialogTitle, String message) {
        super(dialogTitle, message);
    }

    @Override
    public void show() {
        JLabel message = this.getMessage();
        String dialogTitle = this.getDialogTitle();
        Component parentComponent = this.getParentComponent();
        JOptionPane.showMessageDialog(parentComponent, message, dialogTitle, JOptionPane.INFORMATION_MESSAGE);
    }
}
