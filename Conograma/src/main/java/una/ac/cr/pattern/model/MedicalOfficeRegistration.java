package una.ac.cr.pattern.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MedicalOfficeRegistration extends Registration {
    public MedicalOfficeRegistration(String name, int phone, String address) {
        super(name, phone, address);
    }
}
