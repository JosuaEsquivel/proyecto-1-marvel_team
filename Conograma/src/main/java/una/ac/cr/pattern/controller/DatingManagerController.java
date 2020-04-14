package una.ac.cr.pattern.controller;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import una.ac.cr.pattern.Constants;
import una.ac.cr.pattern.model.CustomerRegistration;
import una.ac.cr.pattern.services.ClientService;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class DatingManagerController implements ActionListener {

    private JTextField searchTermTextField = new JTextField(26);
    private DefaultTableModel tableModel;
    private ClientService clientService;
    private Object[][] array;

    /**
     * Main Constructor
     *
     * @param searchTermTextField
     * @param tableModel
     * @throws com.fasterxml.jackson.core.JsonGenerationException
     * @throws com.fasterxml.jackson.databind.JsonMappingException
     * @throws java.io.IOException
     */
    public DatingManagerController(JTextField searchTermTextField,
                                   DefaultTableModel tableModel) throws JsonGenerationException,
            JsonMappingException, IOException {
        super();

        this.searchTermTextField = searchTermTextField;
        this.tableModel = tableModel;

        clientService = new ClientService();
        array = clientService.loadClientObjWrapper();

        tableModel.setDataVector(array, Constants.TABLE_HEADER);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String searchTerm = searchTermTextField.getText();
        updateTableSearchTerms(searchTerm);
    }

    private void updateTableSearchTerms(String searchTerm) {
        if (searchTerm != null && !"".equals(searchTerm)
                && array != null && array.length > 1) {
            Object[][] newData = new Object[array.length][];
            int idx = 0;
            for (Object[] obj : array) {
                String fullText = obj[0].toString() + obj[1].toString()
                        + obj[2].toString() + obj[3].toString();

                if (fullText.contains(searchTerm.trim())) {
                    newData[idx++] = obj;
                }
            }
            tableModel.setDataVector(newData, Constants.TABLE_HEADER);
        } else {
            JOptionPane.showMessageDialog(null,
                    "Search term is empty", "Error",
                    JOptionPane.ERROR_MESSAGE);
            tableModel.setDataVector(array, Constants.TABLE_HEADER);
        }
    }
}
