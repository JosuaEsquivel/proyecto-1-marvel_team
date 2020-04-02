package una.ac.cr.pattern.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Id {

    @JsonProperty("$oid")
    private String $oid;

    /**
     *
     */
    public Id() {
    }

    /**
     *
     * @param $oid
     */
    public Id(String $oid) {
        this.$oid = $oid;
    }

    /**
     *
     * @return
     */
    public String get$oid() {
        return $oid;
    }

    /**
     *
     * @param $oid
     */
    public void set$oid(String $oid) {
        this.$oid = $oid;
    }

    @Override
    public String toString() {
        return "Id{" + "$oid=" + $oid + '}';
    }

}