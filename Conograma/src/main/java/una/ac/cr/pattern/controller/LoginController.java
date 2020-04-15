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
        String usuario = txtUser.getText();
        String pass = new String(password.getPassword());
        if (source == btnAccept) {
            if (usuario.equals("") || pass.equals("")) {
                txtUser.setText("");
                password.setText("");
                JOptionPane.showMessageDialog(null, "Complete all the spaces", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                if (usuario.equalsIgnoreCase("user") && pass.equals("mc2020")){
                    System.exit(0);
                }
            }
        } else if (source == btnClean) {
            txtUser.setText("");
            password.setText("");
        }
    }
}
