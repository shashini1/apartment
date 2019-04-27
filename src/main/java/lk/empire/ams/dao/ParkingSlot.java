package lk.empire.ams.dao;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity

public class ParkingSlot {

    @Column(name = "id", nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    @Size(min = 3, max = 20)
    private String name;

    @Size(max = 10)
    private String vehicleNumber;

    @Enumerated(value = EnumType.ORDINAL)
    private Availability availability;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "unit_id")
    private Unit unit;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public Availability getAvailability() {
        return availability;
    }

    public void setAvailability(Availability availability) {
        this.availability = availability;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "ParkingSlot{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", vehicleNumber='" + vehicleNumber + '\'' +
                ", availability=" + availability +
                ", unit=" + unit +
                '}';
    }
}
