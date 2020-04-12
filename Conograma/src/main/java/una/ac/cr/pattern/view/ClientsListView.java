package una.ac.cr.pattern.view;

import una.ac.cr.pattern.controller.ClientController;

import javax.swing.*;
import java.awt.*;

/**
 * Descripcion: Clase que agrega y almacena en Json la informacion general
 * de los clientes.
 */

public class ClientsListView extends JFrame {

    private JLabel lblName, lblPhone, lblAddress, lblAssociatedDiseases, lblObservations;
    private JTextField txtName, txtPhone, txtAddress, txtAssociatedDiseases;
    private JTextArea txtObservations;
    private JButton Add, Clean;
    private JPanel panel;
    ClientController controller;


    public ClientsListView() {
        this.setTitle("Sing in");
        this.setSize(255, 355);
        this.setResizable(false);
        this.setLocationRelativeTo(this);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lblName = new JLabel("  Name:           ");
        lblPhone = new JLabel("  Phone:          ");
        lblAddress = new JLabel("  Address:       ");
        lblAssociatedDiseases = new JLabel("  Associated Diseases:   ");
        lblObservations = new JLabel("  Observations:   ");
        txtName = new JTextField(14);
        txtPhone = new JTextField(14);
        txtAddress = new JTextField(17);
        txtAssociatedDiseases = new JTextField(17);
        txtObservations = new JTextArea(4, 16);
        Add = new JButton(" Accept ");
        Clean = new JButton(" Clean ");
        panel = new JPanel();

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

        panel.setBackground(Color.lightGray);

        controller = new ClientController(txtName, txtPhone, txtAddress, txtAssociatedDiseases, txtObservations, Add, Clean);
        Add.addActionListener(controller);
        Clean.addActionListener(controller);

        txtObservations.setLineWrap(true);
        txtObservations.setWrapStyleWord(true);

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
        panel.add(Clean);
        panel.add(Add);
        this.add(panel);

        this.setVisible(true);
    }

    private static void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
                    "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        } catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
    }

    public static void main(String[] args) {
        ClientsListView.setLookAndFeel();
        ClientsListView clientsListView = new ClientsListView();
    }
}
