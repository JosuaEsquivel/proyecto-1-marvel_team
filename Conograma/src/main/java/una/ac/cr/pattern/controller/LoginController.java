package una.ac.cr.pattern.controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginController implements ActionListener {
    JTextField user; JPasswordField password; JButton btnAccept;

    public LoginController(JTextField user, JPasswordField password, JButton btnAccept) {
        this.user = user;
        this.password = password;
        this.btnAccept = btnAccept;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }
}
