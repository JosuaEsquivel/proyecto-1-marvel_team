package una.ac.cr.pattern.view;

import com.fasterxml.jackson.databind.util.ISO8601Utils;
import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.awt.*;

/**
 * Descripcion: Clase principal donde se eligen puede elegir algunas opciones
 *                como cambiar informacion del consultorio, ver la agenda (utiliza
 *                un JmenuBar para ver la informacion).
 */

public class MedicalClinicView extends JFrame {
    public MedicalClinicView() {
        this.setTitle("Medical Control");
        this.setSize(900, 600);
        this.setResizable(false);
        this.setLocationRelativeTo(this);
        this.setVisible(true);
        //ocultarMenu();
    }

    public static void main(String[] args) {
        new MedicalClinicView();
    }

}
