package lk.empire.ams.dao;

import javax.persistence.*;
import java.util.List;

@Entity(name = "Contractor")
@DiscriminatorValue("Contractor")

public class Contractor extends User{

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Maintenance> maintenances;

    public List<Maintenance> getMaintenances() {
        return maintenances;
    }

    public void setMaintenances(List<Maintenance> maintenances) {
        this.maintenances = maintenances;
    }

    @Override
    public String toString() {
        return "Contractor{" +
                "maintenances=" + maintenances +
                '}';
    }
}
