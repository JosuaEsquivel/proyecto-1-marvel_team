package una.ac.cr.pattern.view;

import javax.swing.*;

import una.ac.cr.pattern.Constants;
import una.ac.cr.pattern.controller.MedicalClinicController;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Descripcion: Clase principal donde se eligen puede elegir algunas opciones
 * como cambiar informacion del consultorio, ver la agenda (utiliza
 * un JmenuBar para ver la informacion).
 */

public class MedicalClinicView extends JFrame {

    private JDesktopPane desktop;
    private JMenuBar menu;
    private JMenu items;
    private JMenuItem logInMenu, singInMenu;
    private ImageIcon imageClient, imageDoctor, imageSetting;
    MedicalClinicController controller;

    public MedicalClinicView() {
        this.setTitle("Medical Control");
        this.setSize(750, 650);
        this.setLayout(null);
        this.setLocationRelativeTo(this);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        desktop = new JDesktopPane();
        menu = new JMenuBar();
        items = new JMenu("  Setting  ");
        logInMenu = new JMenuItem("Log In ");
        singInMenu = new JMenuItem("Sing In ");
        imageClient = new ImageIcon(Constants.IMAGECLIENTS);
        imageDoctor = new ImageIcon(Constants.IMAGEDOCTOR);
        imageSetting = new ImageIcon(Constants.IMAGESSETTING);

        items.setIcon(imageSetting);
        logInMenu.setIcon(imageDoctor);
        singInMenu.setIcon(imageClient);

        controller = new MedicalClinicController(desktop,logInMenu, singInMenu);
        logInMenu.addActionListener(controller);
        singInMenu.addActionListener(controller);

        desktop.setBackground(Color.lightGray);

        menu.add(items);
        items.add(logInMenu);
        items.add(singInMenu);

        setJMenuBar(menu);
        setContentPane(desktop);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MedicalClinicView();
    }

}

/**
 * public JPanel panel;
 * private JButton logIn, singIn;
 * private ImageIcon imageClient, imageDoctor;
 * MedicalClinicController controller;
 * <p>
 * public MedicalClinicView() {
 * this.setTitle("Medical Control");
 * this.setSize(500, 500);
 * this.setLocationRelativeTo(this);
 * this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 * <p>
 * panel = new JPanel();
 * singIn = new JButton("Client");
 * logIn = new JButton("Doctor");
 * imageClient = new ImageIcon(Constants.IMAGECLIENTS);
 * imageDoctor = new ImageIcon(Constants.IMAGEDOCTOR);
 * <p>
 * singIn.setIcon(new ImageIcon(imageClient.getImage().getScaledInstance(106,70, Image.SCALE_SMOOTH)));
 * logIn.setIcon(new ImageIcon(imageDoctor.getImage().getScaledInstance(100,70, Image.SCALE_SMOOTH)));
 * <p>
 * singIn.setBackground(Color.lightGray);
 * logIn.setBackground(Color.lightGray);
 * <p>
 * singIn.setHorizontalTextPosition(SwingConstants.HORIZONTAL);
 * singIn.setVerticalTextPosition(SwingConstants.BOTTOM);
 * logIn.setHorizontalTextPosition(SwingConstants.CENTER);
 * logIn.setVerticalTextPosition(SwingConstants.BOTTOM);
 * <p>
 * controller = new MedicalClinicController(singIn, logIn);
 * singIn.addActionListener(controller);
 * logIn.addActionListener(controller);
 * <p>
 * panel.add(singIn);
 * panel.add(logIn);
 * this.add(panel);
 * <p>
 * setVisible(true);
 * }
 * <p>
 * private static void setLookAndFeel() {
 * try {
 * UIManager.setLookAndFeel(
 * "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
 * );
 * } catch (Exception exc) {
 * System.out.println(exc.getMessage());
 * }
 * }
 * <p>
 * public static void main(String[] args) {
 * MedicalClinicView.setLookAndFeel();
 * MedicalClinicView medicalClinicView = new MedicalClinicView();
 * }
 * }
 */
