package una.ac.cr.pattern.view;

import una.ac.cr.pattern.controller.ClientController;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Color;

/**
 * Descripcion: Clase que agrega y almacena en Json la informacion general
 * de los clientes.
 */

public class ClientsView extends JInternalFrame {

    private JPanel panel;
    String[] formats = {"Hospital CYM", "Centro Medico del Este"};
    JComboBox formatBox;
    private JLabel lblName, lblPhone, lblAddress, lblAssociatedDiseases, lblObservations;
    private JTextField txtName, txtPhone, txtAddress, txtAssociatedDiseases;
    private JTextArea txtObservations;
    private JButton Add, Clean;
    ClientController controller;


    public ClientsView() {
        this.setClosable(true); // Para cerrar
        this.setIconifiable(true); // Para minimizar
        this.setResizable(false);
        this.setTitle("Sing in");
        this.setSize(255, 400);


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

        panel.setBackground(Color.yellow);

        for (int i = 0; i < formats.length; i++) {
            formatBox.addItem(formats[i]);
        }

        controller = new ClientController(formatBox, txtName, txtPhone, txtAddress, txtAssociatedDiseases, txtObservations, Add, Clean);
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
    }
}
