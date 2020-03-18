package una.ac.cr.pattern.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ClientsListView extends JFrame implements ActionListener {

    private JLabel lblName, lblPhone, lblAddress, lblAssociatedDiseases, lblObservations;
    private JTextField txtName, txtPhone, txtAddress, txtAssociatedDiseases, txtObservations;
    private JButton btnAdd, btnClean, btnCancel;
    private JPanel panel;


    public ClientsListView() {
        super("Client list");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(350,90);

        this.setLookAndFeel();
        FlowLayout flow = new FlowLayout();
        this.setLayout(flow);

        panel = new JPanel();

        lblName = new JLabel("Name: ");
        lblPhone = new JLabel("Phone: ");
        lblAddress = new JLabel("Address: ");
        lblAssociatedDiseases = new JLabel("Associated Diseases: ");
        lblObservations = new JLabel("Observations: ");

        txtName = new JTextField(12);
        txtPhone = new JTextField(12);
        txtAddress = new JTextField(12);
        txtAssociatedDiseases = new JTextField(12);
        txtObservations = new JTextField(12);

        btnAdd = new JButton(" Add ");
        btnClean = new JButton(" Clean ");
        btnCancel = new JButton(" Cancel ");

        btnAdd.addActionListener(this);
        btnClean.addActionListener(this);
        btnCancel.addActionListener(this);

        txtName.setName("txtName");
        txtPhone.setName("txtPhone");
        txtAddress.setName("txtAddress");
        txtAssociatedDiseases.setName("txtAssociatedDiseases");
        txtObservations.setName("txtObservations");

        lblName.setName("lblName");
        lblPhone.setName("lblPhone");
        lblAddress.setName("lblAddress");
        lblAssociatedDiseases.setName("lblAssociatedDiseases");
        lblObservations.setName("lblObservations");

        btnAdd.setName("btnName");
        btnClean.setName("btnClean");
        btnCancel.setName("btnCancel");

        panel.add(lblName);
        panel.add(txtName);
        panel.add(lblPhone);
        panel.add(txtPhone);
        panel.add(lblAddress);
        panel.add(txtAddress);
        panel.add(lblAssociatedDiseases);
        panel.add(txtAssociatedDiseases);
        panel.add(lblObservations);
        panel.add(txtObservations);
        panel.add(btnAdd);
        panel.add(btnClean);
        panel.add(btnCancel);
        this.add(panel);

        this.pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Object source = actionEvent.getSource();
        if (source == btnAdd){

        } else if (source == btnClean){
            txtName.setText(" ");
            txtPhone.setText(" ");
            txtAddress.setText(" ");
            txtAssociatedDiseases.setText(" ");
            txtObservations.setText(" ");
        } else if (source == btnCancel){

        }
        repaint();
    }

    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
                    "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception exc) {
            System.err.println("Couldn't use the system "
                    + "look and feel: " + exc);
        }
    }

    public static void main(String[] args) {
        new ClientsListView();
    }
}
