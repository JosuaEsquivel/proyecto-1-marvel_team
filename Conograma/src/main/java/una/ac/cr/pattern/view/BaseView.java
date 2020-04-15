package una.ac.cr.pattern.view;

/**
 * Descripcion: Clase que maneja cual clase sea visible o cual no.
 */

public class BaseView {
    private ClientsView clientsList;
    private MedicalClinicView medicalClinic;

    public void showClientsList() {
        clientsList.setVisible(true);
    }

    public void hideClientsList() {
        clientsList.setVisible(false);
    }

    public void showmedicalClinic() {
        medicalClinic.setVisible(true);
    }

    public void hidemedicalClinict() {
        medicalClinic.setVisible(false);
    }
}
