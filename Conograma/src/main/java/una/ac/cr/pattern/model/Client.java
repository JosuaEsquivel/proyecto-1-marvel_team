package una.ac.cr.pattern.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Client Model
 *
 * @author mguzmana
 */
public class Client {

    @JsonProperty("_id")
    private Id id;
    @JsonProperty("day")
    private int day;
    @JsonProperty("month")
    private int month;
    @JsonProperty("year")
    private int year;
    @JsonProperty("name")
    private String name;
    @JsonProperty("associatedDiseases")
    private String associatedDiseases;
    @JsonProperty("observations")
    private String observations;

    /**
     *
     */
    public Client() {
    }

    /**
     *
     * @param id
     * @param day
     * @param month
     * @param year
     * @param name
     * @param associatedDiseases
     * @param observations
     */
    public Client(Id id, int day, int month, int year, String name, String associatedDiseases, String observations) {
        this.id = id;
        this.day = day;
        this.month = month;
        this.year = year;
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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


    @Override
    public String toString() {
        return "Client{" + "id=" + id + "day=" + day + "month=" + month + "year=" + year + ", name=" + name + ", associatedDiseases=" + associatedDiseases + ", observations=" + observations + '}';
    }

}
