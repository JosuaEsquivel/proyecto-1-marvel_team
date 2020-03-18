package una.ac.cr.pattern.controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientController implements ActionListener {

    private int option;
    private JTextField txtName = new JTextField(12);
    private JTextField txtPhone = new JTextField(12);
    private JTextField txtAddress = new JTextField(12);
    private JTextField txtAssociatedDiseases = new JTextField(12);
    private JTextField txtObservations = new JTextField(12);

    public ClientController(JTextField txtName, JTextField txtPhone, JTextField txtAddress, JTextField txtAssociatedDiseases, JTextField txtObservations) {
        super();
        this.txtName = txtName;
        this.txtPhone = txtPhone;
        this.txtAddress = txtAddress;
        this.txtAssociatedDiseases = txtAssociatedDiseases;
        this.txtObservations = txtObservations;
        this.option = option;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
            txtName.setText(" ");
            txtPhone.setText(" ");
            txtAddress.setText(" ");
            txtAssociatedDiseases.setText(" ");
            txtObservations.setText(" ");
    }
}
