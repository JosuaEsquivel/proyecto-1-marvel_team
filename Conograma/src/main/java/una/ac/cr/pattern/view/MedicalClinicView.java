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

    private JButton logIn, singIn;
    private ImageIcon imageClient, imageDoctor;

    public MedicalClinicView() {
        this.setTitle("Medical Control");
        this.setSize(350, 250);
        this.setResizable(false);
        this.setLocationRelativeTo(this);
        this.setVisible(true);
    }


    public static void main(String[] args) {
        new MedicalClinicView();
    }

}
