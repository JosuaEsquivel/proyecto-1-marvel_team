package una.ac.cr.pattern.controller;

import una.ac.cr.pattern.view.ClientListView;
import una.ac.cr.pattern.view.MedicalClinicView;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SingInController implements ActionListener {
    private JTextField txtUser;
    private JPasswordField password;
    private JButton btnAccept, btnClean;

    public SingInController(JTextField txtUser, JPasswordField password, JButton btnAccept, JButton btnClean) {
        super();
        this.txtUser = txtUser;
        this.password = password;
        this.btnAccept = btnAccept;
        this.btnClean = btnClean;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Object source = actionEvent.getSource();
        String usuario = txtUser.getText();
        String pass = new String(password.getPassword());
        if (source == btnAccept) {
            if (usuario.equals("") || pass.equals("")) {
                txtUser.setText("");
                password.setText("");
                JOptionPane.showMessageDialog(null, "Complete all the spaces", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                if (usuario.equalsIgnoreCase("user") && pass.equals("mc2020")){
                    try {
                        ClientListView clientListView = new ClientListView();
                        MedicalClinicView.desktop.add(clientListView);
                        clientListView.setVisible(true);
                    } catch (Exception e) {
                    }
                }
            }
        } else if (source == btnClean) {
            txtUser.setText("");
            password.setText("");
        }
    }
}
