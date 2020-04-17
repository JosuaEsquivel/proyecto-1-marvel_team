package una.ac.cr.pattern.view;

import una.ac.cr.pattern.controller.LoginController;

import javax.swing.*;
import java.awt.*;

/**
 * Descripcion: Clase encargada de hacer el loggeo y la autentificacion
 * del doctor.
 */

public class LoginView extends JInternalFrame {

    private JPanel panel;
    private JLabel lblUser, lblPassword, lblLogIn;
    private JTextField txtUser;
    private JPasswordField password;
    private JButton btnAccept, btnClean;
    private LoginController controller;

    public LoginView() {
        this.setClosable(true); // Para cerrar
        this.setIconifiable(true); // Para minimizar
        this.setResizable(false);
        this.setTitle("Log In");
        this.setSize(240, 200);

        panel = new JPanel();
        lblLogIn = new JLabel("            Medical Control              ");
        lblUser = new JLabel("     User:            ");
        lblPassword = new JLabel("    Password:     ");
        txtUser = new JTextField(14);
        password = new JPasswordField(14);
        btnAccept = new JButton(" Accept ");
        btnClean = new JButton(" Clean ");

        lblUser.setName("lblName");
        lblPassword.setName("lblPassword");
        txtUser.setName("txtUser");
        password.setName("txtPassword");
        btnAccept.setName("btnAccept");
        btnClean.setName("btnClean");

        controller = new LoginController(txtUser, password, btnAccept, btnClean);
        btnAccept.addActionListener(controller);
        btnClean.addActionListener(controller);

        panel.setBackground(Color.orange);

        panel.add(lblLogIn);
        panel.add(lblUser);
        panel.add(txtUser);
        panel.add(lblPassword);
        panel.add(password);
        panel.add(btnClean);
        panel.add(btnAccept);
        add(panel);
    }
}
