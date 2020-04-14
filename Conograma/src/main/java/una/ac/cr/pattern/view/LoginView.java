package una.ac.cr.pattern.view;

import una.ac.cr.pattern.controller.LoginController;

import javax.swing.*;
import java.awt.*;

/**
 * Descripcion: Clase encargada de hacer el loggeo y la autentificacion
 * del doctor.
 */

public class LoginView extends JFrame {

    private JPanel panel;
    private JLabel lblUser, lblPassword, lblLogIn;
    private JTextField txtUser;
    private JPasswordField password;
    private JButton btnAccept, btnClean;
    private LoginController controller;

    public LoginView() {
        this.setTitle("Log In");
        this.setSize(250, 200);
        this.setResizable(false);
        this.setLocationRelativeTo(this);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        lblLogIn = new JLabel("            Medical Control              ");
        lblUser = new JLabel("     Name:            ");
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
        panel.setName("form");

        panel.setBackground(Color.lightGray);

        controller = new LoginController(txtUser, password, btnAccept, btnClean);
        btnAccept.addActionListener(controller);
        btnClean.addActionListener(controller);

        panel.add(lblLogIn);
        panel.add(lblUser);
        panel.add(txtUser);
        panel.add(lblPassword);
        panel.add(password);
        panel.add(btnClean);
        panel.add(btnAccept);
        this.add(panel);

        this.setVisible(true);
    }

    private static void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
                    "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        } catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
    }

    public static void main(String[] args) {
        LoginView.setLookAndFeel();
        LoginView loginView = new LoginView();
    }
}
