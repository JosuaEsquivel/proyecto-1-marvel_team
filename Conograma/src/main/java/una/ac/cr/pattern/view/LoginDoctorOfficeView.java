package una.ac.cr.pattern.view;

import una.ac.cr.pattern.controller.LoginDoctorOficceController;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.*;

/**
 * Definicion: Clase donde el Doctor podra elegir que consultorio va a revisar.
 */
public class LoginDoctorOfficeView extends JFrame {
    private JButton btDoctorOffice1;
    private JButton btDoctorOffice2;
    private JLabel lbDoctorOffice;
    private JPanel pOfficePanel;
    LoginDoctorOficceController controller;

    public LoginDoctorOfficeView(){
        this.setTitle("Office");
        this.setSize(250, 150);
        this.setResizable(false);
        this.setLocationRelativeTo(this);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lbDoctorOffice = new JLabel("             Doctor  Office          ");
        btDoctorOffice1 = new JButton("  CYM Hospital   ");
        btDoctorOffice2 = new JButton("Eastern Medical Center");
        pOfficePanel = new JPanel();

        lbDoctorOffice.setName("lbDoctorOffice");
        btDoctorOffice1.setName("btDoctorOffice1");
        btDoctorOffice2.setName("btDoctorOffice2");
        pOfficePanel.setName("OfficePanel");

        pOfficePanel.setBackground(Color.orange);

        controller = new LoginDoctorOficceController(btDoctorOffice1,btDoctorOffice2);
        btDoctorOffice1.addActionListener(controller);
        btDoctorOffice2.addActionListener(controller);

        pOfficePanel.add(lbDoctorOffice);
        pOfficePanel.add(btDoctorOffice1);
        pOfficePanel.add(btDoctorOffice2);
        add(pOfficePanel);
        this.setVisible(true);
    }



}
