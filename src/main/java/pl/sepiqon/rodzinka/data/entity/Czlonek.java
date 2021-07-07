package pl.sepiqon.rodzinka.data.entity;

import javax.persistence.Entity;

import pl.sepiqon.rodzinka.data.AbstractEntity;

@Entity
public class Czlonek extends AbstractEntity {

    private String rola_W_Rodzinie;
    private String rolaWRodzinie;
    private Double age;
    private String name;
    private String lastName;

    public String getRolaWRodzinie() {
        return rolaWRodzinie;
    }

    public void setRolaWRodzinie(String rolaWRodzinie) {
        this.rolaWRodzinie = rolaWRodzinie;
    }

    public String getRola_W_Rodzinie() {
        rolaWRodzinie = rola_W_Rodzinie;
        return rolaWRodzinie;
    }

    public void setRola_W_Rodzinie(String rola_W_Rodzinie) {
        this.rola_W_Rodzinie = rola_W_Rodzinie;
        this.rolaWRodzinie = rola_W_Rodzinie;
    }

    public Double getAge() {
        return age;
    }

    public void setAge(Double age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
