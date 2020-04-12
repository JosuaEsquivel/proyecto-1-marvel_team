package una.ac.cr.pattern.controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginController implements ActionListener {
    private JTextField txtUser;
    private JPasswordField password;
    private JButton btnAccept, btnClean;

    public LoginController(JTextField txtUser, JPasswordField password, JButton btnAccept, JButton btnClean) {
        super();
        this.txtUser = txtUser;
        this.password = password;
        this.btnAccept = btnAccept;
        this.btnClean = btnClean;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Object source = actionEvent.getSource();
        if (source == btnAccept) {
        } else if (source == btnClean) {
            txtUser.setText(" ");
            password.setText("");
        }
    }
}
