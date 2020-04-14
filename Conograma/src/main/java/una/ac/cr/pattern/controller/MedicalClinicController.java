package una.ac.cr.pattern.controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MedicalClinicController implements ActionListener {

    private JButton logIn, singIn;

    public MedicalClinicController(JButton logIn, JButton singIn) {
        this.logIn = logIn;
        this.singIn = singIn;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }
}
