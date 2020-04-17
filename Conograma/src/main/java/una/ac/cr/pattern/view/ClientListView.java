package una.ac.cr.pattern.view;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import una.ac.cr.pattern.controller.ClientListController;

import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.BorderFactory;
import javax.swing.JSplitPane;
import javax.swing.JFrame;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.Dimension;
import java.io.IOException;

/**
 * Descripcion: Clase que contiene la lista de los clientes.
 */

public class ClientListView extends JInternalFrame {
    // Create views swing UI components

    JTextField searchTermTextField = new JTextField(26);
    JButton filterButton = new JButton("Filter");
    JTable table = new JTable();
    DefaultTableModel tableModel = new DefaultTableModel();

    /**
     * @throws JsonGenerationException
     * @throws JsonMappingException
     * @throws IOException
     */
    public ClientListView() throws JsonGenerationException,
            JsonMappingException, IOException {

        this.setClosable(true); // Para cerrar
        this.setIconifiable(true); // Para minimizar
        this.setResizable(false);
        this.setTitle("Patient List");

        searchTermTextField.setName("txtSearch");
        filterButton.setName("btnFilter");

        // Create table model
        table.setName("mainTable");
        table.setModel(tableModel);
        table.setEnabled(false);

        // Create controller
        ClientListController controller = new ClientListController(searchTermTextField, tableModel);
        filterButton.addActionListener(controller);

        // Set the view layout
        JPanel ctrlPane = new JPanel();
        ctrlPane.setName("ctrlPanel");
        ctrlPane.add(searchTermTextField);
        ctrlPane.add(filterButton);

        JScrollPane tableScrollPane = new JScrollPane(table);
        tableScrollPane.setName("scrollTablePaneStudent");
        tableScrollPane.setPreferredSize(new Dimension(700, 182));
        tableScrollPane.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Market Movers",
                TitledBorder.CENTER, TitledBorder.TOP));

        JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, ctrlPane, tableScrollPane);
        splitPane.setName("splitPane");
        splitPane.setDividerLocation(35);
        splitPane.setEnabled(false);

        // Display it all in a scrolling window and make the window appear
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(splitPane);
        pack();

    }

}
