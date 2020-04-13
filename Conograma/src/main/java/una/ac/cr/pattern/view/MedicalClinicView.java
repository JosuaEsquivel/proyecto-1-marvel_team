package una.ac.cr.pattern.view;

import com.fasterxml.jackson.databind.util.ISO8601Utils;
import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import una.ac.cr.pattern.Constants;
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

        singIn.setIcon(new ImageIcon(imageClient.getImage().getScaledInstance(100,70, Image.SCALE_SMOOTH)));
        logIn.setIcon(new ImageIcon(imageDoctor.getImage().getScaledInstance(100,70, Image.SCALE_SMOOTH)));

        singIn.setBackground(Color.lightGray);
        logIn.setBackground(Color.lightGray);

        panel.add(singIn);
        panel.add(logIn);
        this.add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new MedicalClinicView();
    }

}
