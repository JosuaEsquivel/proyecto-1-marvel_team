package una.ac.cr.pattern.view;

public class BaseView {
    private ClientsListView clientsList;
    private DatingManagerView datingManager;
    private MedicalClinicView medicalClinic;

    public void showClientsList() {
        clientsList.setVisible(true);
    }

    public void hideClientsList() {
        clientsList.setVisible(false);
    }

    public void showdatingManager() {
        datingManager.setVisible(true);
    }

    public void hidedatingManager() {
        datingManager.setVisible(false);
    }

    public void showmedicalClinic() {
        medicalClinic.setVisible(true);
    }

    public void hidemedicalClinict() {
        medicalClinic.setVisible(false);
    }
}
