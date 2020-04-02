package una.ac.cr.pattern.controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientController implements ActionListener {

    private JTextField txtName = new JTextField(12);
    private JTextField txtPhone = new JTextField(12);
    private JTextField txtAddress = new JTextField(12);
    private JTextField txtAssociatedDiseases = new JTextField(12);
    private JTextField txtObservations = new JTextField(12);
    private JButton btnAdd, btnClean, btnCancel;

    public ClientController(JTextField txtName, JTextField txtPhone, JTextField txtAddress, JTextField txtAssociatedDiseases, JTextField txtObservations, JButton btnAdd, JButton btnClean, JButton btnCancel) {
        super();
        this.txtName = txtName;
        this.txtPhone = txtPhone;
        this.txtAddress = txtAddress;
        this.txtAssociatedDiseases = txtAssociatedDiseases;
        this.txtObservations = txtObservations;
        this.btnAdd = btnAdd;
        this.btnClean = btnClean;
        this.btnCancel = btnCancel;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Object source = actionEvent.getSource();
        if (source == btnAdd) {
        } else if (source == btnClean) {
            txtName.setText(" ");
            txtPhone.setText(" ");
            txtAddress.setText(" ");
            txtAssociatedDiseases.setText(" ");
            txtObservations.setText(" ");
        } else if (source == btnCancel) {
        }
    }
}
