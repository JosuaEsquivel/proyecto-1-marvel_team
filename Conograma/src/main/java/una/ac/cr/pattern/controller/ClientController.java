package una.ac.cr.pattern.controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ClientController implements ActionListener, ItemListener {

    private JComboBox formatBox;
    private JTextField txtName = new JTextField(12);
    private JTextField txtPhone = new JTextField(12);
    private JTextField txtAddress = new JTextField(12);
    private JTextField txtAssociatedDiseases = new JTextField(12);
    private JTextArea txtObservations = new JTextArea(4,15);
    private JButton btnAdd, btnClean;

    public ClientController(JComboBox formatBox, JTextField txtName, JTextField txtPhone, JTextField txtAddress, JTextField txtAssociatedDiseases, JTextArea txtObservations, JButton btnAdd, JButton btnClean) {
        super();
        this.formatBox = formatBox;
        this.txtName = txtName;
        this.txtPhone = txtPhone;
        this.txtAddress = txtAddress;
        this.txtAssociatedDiseases = txtAssociatedDiseases;
        this.txtObservations = txtObservations;
        this.btnAdd = btnAdd;
        this.btnClean = btnClean;
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
        }
    }

    @Override
    public void itemStateChanged(ItemEvent itemEvent) {
        int choice = formatBox.getSelectedIndex();
        if (choice > 0) {
        }
    }
}
