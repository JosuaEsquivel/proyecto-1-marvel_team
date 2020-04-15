/*
 * Copyright (C) 2016 mguzmana
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * Universidad Nacional de Costa Rica, Prof: Maikol Guzman Alan.
 */
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
     * @param name
     * @param associatedDiseases
     * @param observations
     */
    public Client(Id id, String name, String associatedDiseases, String observations) {
        this.id = id;
        this.name = name;
        this.associatedDiseases = associatedDiseases;
        this.observations = observations;
    }

    /**
     *
     * @return
     */
    public Id getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(Id id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
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

    /**
     *
     * @return
     */


    public void setObservations(String observations) {
        this.observations = observations;
    }

    /**
     *
     * @return
     */


    @Override
    public String toString() {
        return "Client{" + "id=" + id + ", name=" + name + ", associatedDiseases=" + associatedDiseases + ", observations=" + observations + '}';
    }

}
