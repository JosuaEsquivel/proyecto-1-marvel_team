package una.ac.cr.pattern.view;

import una.ac.cr.pattern.controller.ClientController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ClientsListView extends JFrame {

    private JLabel lblName, lblPhone, lblAddress, lblAssociatedDiseases, lblObservations;
    private JTextField txtName, txtPhone, txtAddress, txtAssociatedDiseases, txtObservations;
    private JButton Add, Clean, Cancel;
    private JPanel panel;
    ClientController controller;


    public ClientsListView() {
        super("Client list");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setLookAndFeel();

        panel = new JPanel();
        FlowLayout flow = new FlowLayout();
        panel.setLayout(flow);
        this.setSize(300,400);

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

        Add = new JButton(" Add ");
        Clean = new JButton(" Clean ");
        Cancel = new JButton(" Cancel ");

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

        Add.setName("btnName");
        Clean.setName("btnClean");
        Cancel.setName("btnCancel");

        controller = new ClientController(txtName,txtPhone,txtAddress,txtAssociatedDiseases,txtObservations, Add, Clean, Cancel);
        Add.addActionListener(controller);
        Clean.addActionListener(controller);
        Cancel.addActionListener(controller);

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
        panel.add(Add);
        panel.add(Clean);
        panel.add(Cancel);
        this.add(panel);

        this.pack();
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
