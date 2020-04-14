package una.ac.cr.pattern.view;

import com.fasterxml.jackson.databind.util.ISO8601Utils;
import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import una.ac.cr.pattern.Constants;
import una.ac.cr.pattern.controller.ClientController;
import una.ac.cr.pattern.controller.MedicalClinicController;

import java.awt.*;

/**
 * Descripcion: Clase principal donde se eligen puede elegir algunas opciones
 * como cambiar informacion del consultorio, ver la agenda (utiliza
 * un JmenuBar para ver la informacion).
 */

public class MedicalClinicView extends JFrame {

    private JPanel panel;
    private JButton logIn, singIn;
    private ImageIcon imageClient, imageDoctor;
    MedicalClinicController controller;
    Icon icoClient, icoDoctor;

    public MedicalClinicView() {
        this.setTitle("Medical Control");
        this.setSize(350, 250);
        this.setResizable(false);
        this.setLocationRelativeTo(this);
        this.setVisible(true);

        panel = new JPanel();
        icoClient = new ImageIcon(getClass().getResource("/icons/Client.png"));
        //icoDoctor = new ImageIcon(getClass().getResource("/icons/Doctor.png"));
        singIn = new JButton("Client");
        logIn = new JButton("Doctor");
        imageClient = new ImageIcon(Constants.IMAGECLIENTS);
        imageDoctor = new ImageIcon(Constants.IMAGEDOCTOR);

        //singIn.setIcon(new ImageIcon(imageClient.getImage().getScaledInstance(106,70, Image.SCALE_SMOOTH)));
        //logIn.setIcon(new ImageIcon(imageDoctor.getImage().getScaledInstance(100,70, Image.SCALE_SMOOTH)));

        singIn.setBackground(Color.lightGray);
        logIn.setBackground(Color.lightGray);

        controller = new MedicalClinicController(singIn, logIn);
        singIn.addActionListener(controller);
        logIn.addActionListener(controller);

        panel.add(singIn);
        panel.add(logIn);
        this.add(panel);

        setVisible(true);
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
        MedicalClinicView.setLookAndFeel();
        MedicalClinicView medicalClinicView = new MedicalClinicView();
    }

}
