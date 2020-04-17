package una.ac.cr.pattern.controller;

import una.ac.cr.pattern.view.ClientListView;
import una.ac.cr.pattern.view.ClientsView;
import una.ac.cr.pattern.view.MedicalClinicView;
import una.ac.cr.pattern.view.SingInView;

import javax.swing.JMenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MedicalClinicController implements ActionListener {

    private JMenuItem logIn, singIn;
    private ClientsView clientsView;
    private SingInView singInView;
    private ClientListView clientListView;

    public MedicalClinicController(JMenuItem logIn, JMenuItem singIn) {
        try {
            clientsView = new ClientsView();
            singInView = new SingInView();
            clientListView = new ClientListView();
        } catch (Exception e) {
        }
        this.logIn = logIn;
        this.singIn = singIn;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Object source = actionEvent.getSource();
        if (source == logIn) {
            MedicalClinicView.desktop.add(singInView);
            singInView.setVisible(true);
        } else if (source == singIn) {
            MedicalClinicView.desktop.add(clientsView);
            clientsView.setVisible(true);
        }
    }
}
