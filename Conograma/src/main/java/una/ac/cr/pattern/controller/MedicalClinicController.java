package una.ac.cr.pattern.controller;

import una.ac.cr.pattern.view.ClientsView;
import una.ac.cr.pattern.view.LoginView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MedicalClinicController implements ActionListener {
    private JDesktopPane desktop;
    private JMenuItem logIn, singIn;
    static final String PATIENT = "PAT";

    public MedicalClinicController(JDesktopPane desktop, JMenuItem logIn, JMenuItem singIn) {
        this.desktop = desktop;
        this.logIn = logIn;
        this.singIn = singIn;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        System.out.println("Hola");

        Object source = actionEvent.getSource();
        if (source == logIn) {
            ClientsView clientsView = new ClientsView();
            desktop.add(clientsView);
            clientsView.setVisible(true);
        } else if (source == singIn) {
            LoginView loginView = new LoginView();
            desktop.add(loginView);
            loginView.setVisible(true);
        }

    }
}
