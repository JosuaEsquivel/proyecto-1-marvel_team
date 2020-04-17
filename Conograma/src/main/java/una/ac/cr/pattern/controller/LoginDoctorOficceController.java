package una.ac.cr.pattern.controller;




import javafx.scene.SnapshotResult;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
public class LoginDoctorOficceController implements ActionListener{
    JButton btDoctorOffice1;
    JButton btDoctorOffice2;
    public LoginDoctorOficceController(JButton btDoctorOffice1,JButton btDoctorOffice2){
        super();
        this.btDoctorOffice1 = btDoctorOffice1;
        this.btDoctorOffice2 = btDoctorOffice2;
    }
    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        Object source = actionEvent.getSource();
        if (source == btDoctorOffice1) {

        }

        if (source == btDoctorOffice2) {

        }
    }
}
