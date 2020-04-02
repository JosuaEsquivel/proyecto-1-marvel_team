package una.ac.cr.pattern.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Registration {
    @JsonProperty("name")
    private String name;
    @JsonProperty("phone")
    private int phone;
    @JsonProperty("address")
    private String address;

    public Registration(String name, int phone, String address) {
        this.name = name;
        this.phone = phone;
        this.address = address;
    }


}
