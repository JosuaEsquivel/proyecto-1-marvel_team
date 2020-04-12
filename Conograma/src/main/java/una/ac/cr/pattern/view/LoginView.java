package una.ac.cr.pattern.view;

import una.ac.cr.pattern.controller.LoginController;

import javax.swing.*;
import java.awt.*;

/**
 * Descripcion: Clase encargada de hacer el loggeo y la autentificacion
 *                del doctor.
 */

public class LoginView extends JFrame {

    JTextField user;
    JPasswordField password;
    JButton btnAccept;
    LoginController controller;
    JPanel panel;

    public LoginView() {
        super("Login");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FlowLayout flow = new FlowLayout();
        setLayout(flow);

        user = new JTextField(12);
        password = new JPasswordField(12);
        btnAccept = new JButton("Accept");
        panel = new JPanel();

        user.setName("txtUser");
        password.setName("txtPassword");
        btnAccept.setName("btnAccept");

        controller = new LoginController(user, password, btnAccept);
        btnAccept.addActionListener(controller);

        panel.add(user);
        panel.add(password);
        panel.add(btnAccept);

        this.add(panel);

        pack();

        this.setVisible(true);
    }

    public static void main(String[] args) {
        new LoginView();
    }
}
