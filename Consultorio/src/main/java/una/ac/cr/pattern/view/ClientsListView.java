package una.ac.cr.pattern.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ClientsListView extends JFrame implements ActionListener, ItemListener {

    private JLabel lblName, lblPhone, lblAddress,  lblAssociatedDiseases, lblObservations;
    private JTextField txtName, txtPhone, txtAddress, txtAssociatedDiseases,txtObservations;
    private JButton add, clean, cancel;


    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }

    @Override
    public void itemStateChanged(ItemEvent itemEvent) {

    }
}
