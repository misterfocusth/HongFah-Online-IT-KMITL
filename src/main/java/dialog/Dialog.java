package dialog;

import java.awt.*;
import javax.swing.*;

public abstract class Dialog {

    private JLabel message;
    private String dialogTitle;
    private final Font font;
    private Component parentComponent;

    public Dialog(Component parentComponent, String dialogTitle, String message) {
        this.message = new JLabel(message);
        this.dialogTitle = dialogTitle;
        this.parentComponent = parentComponent;

        this.font = new Font("Tahoma", Font.BOLD, 14);
        this.message.setFont(font);
    }

    public Dialog(String dialogTitle, String message) {
        this(null, dialogTitle, message);
    }

    public Dialog() {
        this(null, null, null);
    }

    public JLabel getMessage() {
        return message;
    }

    public void setMessage(JLabel message) {
        this.message = message;
    }

    public String getDialogTitle() {
        return dialogTitle;
    }

    public void setDialogTitle(String dialogTitle) {
        this.dialogTitle = dialogTitle;
    }

    public Font getFont() {
        return font;
    }

    public Component getParentComponent() {
        return parentComponent;
    }

    public void setParentComponent(Component parentComponent) {
        this.parentComponent = parentComponent;
    }

    public abstract void show();
}
