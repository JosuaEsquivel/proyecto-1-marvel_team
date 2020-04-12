package una.ac.cr.pattern.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomerRegistration extends Registration {
    @JsonProperty("id")
    private Id id;
    @JsonProperty("day")
    private int day;
    @JsonProperty("month")
    private int month;
    @JsonProperty("year")
    private int year;
    @JsonProperty("associatedDiseases")
    private String associatedDiseases;
    @JsonProperty("observations")
    private String observations;

    public CustomerRegistration(String name, int phone, String address, Id id,
                                int day, int month, int year, String associatedDiseases,
                                String observations) {
        super(name, phone, address);
        this.id = id;
        this.day = day;
        this.month = month;
        this.year = year;
        this.associatedDiseases = associatedDiseases;
        this.observations = observations;
    }

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
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
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }
}
