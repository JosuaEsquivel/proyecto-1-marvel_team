package una.ac.cr.pattern.view;

import javax.swing.JFrame;
import javax.swing.JDesktopPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;

import una.ac.cr.pattern.Constants;
import una.ac.cr.pattern.controller.MedicalClinicController;

import java.awt.Color;

/**
 * Descripcion: Clase principal donde se eligen puede elegir algunas opciones
 * como cambiar informacion del consultorio, ver la agenda (utiliza
 * un JmenuBar para ver la informacion).
 */

public class MedicalClinicView extends JFrame {

    public static final JDesktopPane desktop = new JDesktopPane();
    private JMenuBar menu;
    private JMenu items;
    private JMenuItem logInMenu, singInMenu;
    private ImageIcon imageClient, imageDoctor, imageSetting;
    MedicalClinicController controller;

    public MedicalClinicView() {
        this.setTitle("Medical Control");
        this.setSize(1250, 750);
        this.setLayout(null);
        this.setLocationRelativeTo(this);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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

        controller = new MedicalClinicController(logInMenu, singInMenu);
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