package una.ac.cr.pattern.controller;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import una.ac.cr.pattern.Constants;
import una.ac.cr.pattern.services.ClientService;

import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class ClientListController implements ActionListener {

    private JTextField searchTermTextField = new JTextField(26);
    private DefaultTableModel tableModel;
    private ClientService clientService;
    private Object[][] clients;

    /**
     * Main Constructor
     *
     * @param searchTermTextField
     * @param tableModel
     * @throws JsonGenerationException
     * @throws JsonMappingException
     * @throws IOException
     */
    public ClientListController(JTextField searchTermTextField,
                                DefaultTableModel tableModel) throws JsonGenerationException,
            JsonMappingException, IOException {
        super();
        clientService = new ClientService();
        clients = clientService.loadStudentsObjWrapper();

        this.searchTermTextField = searchTermTextField;
        this.tableModel = tableModel;

        // Load the table with the list of students
        tableModel.setDataVector(clients, Constants.TABLE_HEADER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String searchTerm = searchTermTextField.getText();

        //Method to search items
        updateTableSearchTerms(searchTerm);
    }

    private void updateTableSearchTerms(String searchTerm) {
        if (searchTerm != null && !"".equals(searchTerm)
                && clients != null && clients.length > 1) {
            Object[][] newData = new Object[clients.length][];
            int idx = 0;
            for (Object[] obj : clients) {
                String fullText = obj[0].toString() + obj[1].toString() + obj[2].toString()
                        + obj[3].toString() + obj[4].toString() + obj[5].toString()
                        + obj[6].toString() + obj[7].toString() + obj[7].toString();

                if (fullText.contains(searchTerm.trim())) {
                    newData[idx++] = obj;
                }
            }
            tableModel.setDataVector(newData, Constants.TABLE_HEADER);
        } else {
            JOptionPane.showMessageDialog(null,
                    "Search term is empty", "Error",
                    JOptionPane.ERROR_MESSAGE);
            tableModel.setDataVector(clients, Constants.TABLE_HEADER);
        }
    }

}
