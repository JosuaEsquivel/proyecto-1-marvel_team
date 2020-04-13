package una.ac.cr.pattern.view;

import una.ac.cr.pattern.controller.ClientController;

import javax.swing.*;
import java.awt.*;

/**
 * Descripcion: Clase que agrega y almacena en Json la informacion general
 * de los clientes.
 */

public class ClientsListView extends JFrame {

    private JPanel panel;
    String[] formats = {"Hospital CYM", "Centro Medico del Este"};
    JComboBox formatBox;
    private JLabel lblName, lblPhone, lblAddress, lblAssociatedDiseases, lblObservations;
    private JTextField txtName, txtPhone, txtAddress, txtAssociatedDiseases;
    private JTextArea txtObservations;
    private JButton Add, Clean;
    ClientController controller;


    public ClientsListView() {
        this.setTitle("Sing in");
        this.setSize(255, 400);
        this.setResizable(false);
        this.setLocationRelativeTo(this);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        formatBox = new JComboBox();
        lblName = new JLabel("  Name:           ");
        lblPhone = new JLabel("  Phone:          ");
        lblAddress = new JLabel("  Address:       ");
        lblAssociatedDiseases = new JLabel("  Associated Diseases:   ");
        lblObservations = new JLabel("  Observations:   ");
        txtName = new JTextField(16);
        txtPhone = new JTextField(16);
        txtAddress = new JTextField(16);
        txtAssociatedDiseases = new JTextField(16);
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

        for (int i = 0; i < formats.length; i++) {
            formatBox.addItem(formats[i]);
        }

        controller = new ClientController(formatBox,txtName, txtPhone, txtAddress, txtAssociatedDiseases, txtObservations, Add, Clean);
        formatBox.addActionListener(controller);
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
        panel.add(formatBox);
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

    public Insets getInsets() {
        return new Insets(50, 10, 10, 10);
    }

    public static void main(String[] args) {
        ClientsListView.setLookAndFeel();
        ClientsListView clientsListView = new ClientsListView();
    }
}
