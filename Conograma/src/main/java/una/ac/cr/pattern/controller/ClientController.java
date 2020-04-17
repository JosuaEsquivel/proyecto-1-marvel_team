package una.ac.cr.pattern.controller;

import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JOptionPane;
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
    private JTextArea txtObservations = new JTextArea(4, 15);
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
            if (txtName.getText().equals("") || txtPhone.getText().equals("")
                    || txtAddress.getText().equals("")
                    || txtAssociatedDiseases.getText().equals("")) {
                txtName.setText("");
                txtPhone.setText("");
                txtAddress.setText("");
                txtAssociatedDiseases.setText("");
                txtObservations.setText("");
                JOptionPane.showMessageDialog(null, "Complete all the spaces", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                // Agrega al Json los datos ingresados
            }
        } else if (source == btnClean) {
            txtName.setText("");
            txtPhone.setText("");
            txtAddress.setText("");
            txtAssociatedDiseases.setText("");
            txtObservations.setText("");
        }
    }

    @Override
    public void itemStateChanged(ItemEvent itemEvent) {
        int choice = formatBox.getSelectedIndex();
        if (choice > 0) {
        }
    }
}
