package una.ac.cr.pattern.view;

import javax.swing.*;

import una.ac.cr.pattern.Constants;
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

    public MedicalClinicView() {
        this.setTitle("Medical Control");
        this.setSize(350, 250);
        this.setResizable(false);
        this.setLocationRelativeTo(this);
        this.setVisible(true);

        panel = new JPanel();
        singIn = new JButton("Client");
        logIn = new JButton("Doctor");
        imageClient = new ImageIcon(Constants.IMAGECLIENTS);
        imageDoctor = new ImageIcon(Constants.IMAGEDOCTOR);

        singIn.setIcon(new ImageIcon(imageClient.getImage().getScaledInstance(106,70, Image.SCALE_SMOOTH)));
        logIn.setIcon(new ImageIcon(imageDoctor.getImage().getScaledInstance(100,70, Image.SCALE_SMOOTH)));

        singIn.setBackground(Color.lightGray);
        logIn.setBackground(Color.lightGray);

        singIn.setHorizontalTextPosition(SwingConstants.HORIZONTAL);
        singIn.setVerticalTextPosition(SwingConstants.BOTTOM);
        logIn.setHorizontalTextPosition(SwingConstants.HORIZONTAL);
        logIn.setVerticalTextPosition(SwingConstants.BOTTOM);

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
