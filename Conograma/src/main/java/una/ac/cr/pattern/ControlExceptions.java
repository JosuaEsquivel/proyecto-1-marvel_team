package una.ac.cr.pattern;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import una.ac.cr.pattern.view.ClientListView;

import javax.swing.*;
import java.io.IOException;

public class ControlExceptions {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    createAndShowGUI();

                } catch (JsonGenerationException e) {
                    System.err.println(e);
                } catch (JsonMappingException e) {
                    System.err.println(e);
                } catch (IOException e) {
                    System.err.println(e);
                } catch (Exception e) {
                    System.err.println(e);
                }
            }
        });
    }

    /**
     * Create the GUI
     *
     * @throws Exception
     */
    public static void createAndShowGUI() throws Exception {
        ClientListView datingManagerView = new ClientListView();
    }
}
