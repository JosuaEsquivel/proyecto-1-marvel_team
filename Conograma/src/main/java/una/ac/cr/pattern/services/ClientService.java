package una.ac.cr.pattern.services;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import una.ac.cr.pattern.Constants;
import una.ac.cr.pattern.model.CustomerRegistration;

import java.io.File;
import java.io.IOException;

public class ClientService {

    /**
     * Empty Constructor
     */


    /**
     * Wrapper to return the list of students from the File
     *
     * @return Object[][] data
     * @throws com.fasterxml.jackson.core.JsonGenerationException
     * @throws com.fasterxml.jackson.databind.JsonMappingException
     * @throws java.io.IOException
     */
    public Object[][] loadClientObjWrapper() throws JsonGenerationException,
            JsonMappingException, IOException {
        CustomerRegistration[] custom = loadClientFromFile();
        Object[][] data = null;

        if (custom != null && custom.length > 0) {
            data = new Object[custom.length][4]; // filas y columnas
            int i = 0;
            for (CustomerRegistration customerRegistration : custom) {
                data[i][0] = checkIfNull(customerRegistration.getId().get$oid());;
                data[i][6] = checkIfNull(customerRegistration.getYear());
                data[i][7] = checkIfNull(customerRegistration.getAssociatedDiseases());
                data[i][8] = checkIfNull(customerRegistration.getObservations());
                i++;
            }
        }

        return data;
    }

    private CustomerRegistration[] loadClientFromFile() throws JsonGenerationException,
            JsonMappingException, IOException {
        // Library Jackson parse JSon
        // http://wiki.fasterxml.com/JacksonHome
        CustomerRegistration[] custom = null;

        ObjectMapper mapper = new ObjectMapper();
        // Convert JSON string from file to Object
        custom = mapper.readValue(new File(
                getClass().getClassLoader().getResource(Constants.FILENAME).getFile()
        ), CustomerRegistration[].class);

        return custom;
    }

    private String checkIfNull(Object obj) {
        String text;
        if (obj == null) {
            text = "";
        } else {
            text = obj.toString();
        }
        return text;
    }
}
