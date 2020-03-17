package una.ac.cr.pattern.model;

public class CustomerRegistration extends Registration {
    private int day;
    private int month;
    private int year;
    private String associatedDiseases;
    private String Observations;

    public CustomerRegistration(String name, int phone, String address, int day, int month, int year, String associatedDiseases, String observations) {
        super(name, phone, address);
        this.day = day;
        this.month = month;
        this.year = year;
        this.associatedDiseases = associatedDiseases;
        Observations = observations;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAssociatedDiseases() {
        return associatedDiseases;
    }

    public void setAssociatedDiseases(String associatedDiseases) {
        this.associatedDiseases = associatedDiseases;
    }

    public String getObservations() {
        return Observations;
    }

    public void setObservations(String observations) {
        Observations = observations;
    }
}
