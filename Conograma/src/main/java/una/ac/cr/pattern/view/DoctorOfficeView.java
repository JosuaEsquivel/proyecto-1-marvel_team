package una.ac.cr.pattern.view;



import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.*;

/**
 * Descripcion: En esta Clase se Encuentra la vista de la funcionalidad que tiene el doctor, es decir los
 * diferentes paneles que puede acceder, como son: ClientLis, work agenda,Add Appointments, change office, etc.
 * se trabaja con paneles para tener mayor facilidad al trabajar con el JMenuBar.
 */
public class DoctorOfficeView extends JFrame{

    private JPanel pMenu;
    private JMenuBar menu;
    private JMenu items;
    private JMenuItem jmClientListMenu;
    private JMenuItem jmWorkAgendaMenu;
    private JMenuItem jmAddAppointmentsMenu;
    private JMenuItem jmAddClientMenu;
    private JMenuItem jmChangeOfficeMenu;


    public DoctorOfficeView(){
        this.setTitle("  Doctor Office  ");
        this.setSize(750, 500);
        this.setLayout(null);
        this.setLocationRelativeTo(this);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        pMenu= new JPanel();
        menu = new JMenuBar();
        items = new JMenu("  Setting  ");
        jmClientListMenu = new JMenuItem("Client List ");
        jmWorkAgendaMenu = new JMenuItem("Work Agenda ");
        jmAddAppointmentsMenu = new JMenuItem("Add Appointments ");
        jmAddClientMenu = new JMenuItem("Add Client ");
        jmChangeOfficeMenu = new JMenuItem("Change Office ");

        menu.setName("menu");
        items.setName("items");
        jmClientListMenu.setName("jmClientListMenu");
        jmWorkAgendaMenu.setName("jmWorkAgendaMenu");
        jmAddAppointmentsMenu.setName("jmAddAppointmentsMenu");
        jmAddClientMenu.setName("jmAddClientMenu");
        jmChangeOfficeMenu.setName("jmChangeOfficeMenu");

        pMenu.setBackground(Color.lightGray);
        items.add(jmClientListMenu);
        items.add(jmWorkAgendaMenu);
        items.add(jmAddAppointmentsMenu);
        items.add(jmAddClientMenu);
        items.add(jmChangeOfficeMenu);
        menu.add(items);


    }
}
