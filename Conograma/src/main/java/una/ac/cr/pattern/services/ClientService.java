package una.ac.cr.pattern.services;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import una.ac.cr.pattern.Constants;
import una.ac.cr.pattern.model.Client;

import java.io.File;
import java.io.IOException;


public class ClientService {

    /**
     * @throws JsonGenerationException
     * @throws JsonMappingException
     * @throws IOException
     */
    public Object[][] loadStudentsObjWrapper() throws JsonGenerationException,
            JsonMappingException, IOException {
        Client[] clients = loadStudentsFromFile();
        Object[][] data = null;

        if (clients != null && clients.length > 0) {
            data = new Object[clients.length][7]; // filas y columnas
            int i = 0;
            for (Client client : clients) {
                data[i][0] = checkIfNull(client.getId().get$oid());
                data[i][1] = checkIfNull(client.getDay());
                data[i][2] = checkIfNull(client.getMonth());
                data[i][3] = checkIfNull(client.getYear());
                data[i][4] = checkIfNull(client.getName());
                data[i][5] = checkIfNull(client.getAssociatedDiseases());
                data[i][6] = checkIfNull(client.getObservations());
                i++;
            }
        }

        return data;
    }

    private Client[] loadStudentsFromFile() throws IOException {
        Client[] clients = null;

        ObjectMapper mapper = new ObjectMapper();
        // Convert JSON string from file to Object
        clients = mapper.readValue(new File(
                getClass().getClassLoader().getResource(Constants.FILENAME).getFile()
        ), Client[].class);

        return clients;
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
