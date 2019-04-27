package lk.empire.ams.dao;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;

@Entity

public class Unit {

    @Column(name = "id", nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    @Size(max = 100)
    private String name;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "owned_units")
    private Client owner;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "rented_units")
    private Client renter;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="floor_id")
    private Floor floor;

    //enum
    @Enumerated(EnumType.ORDINAL)
    private Availability  availability;

    public Client getOwner() {
        return owner;
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }

    public Client getRenter() {
        return renter;
    }

    public void setRenter(Client renter) {
        this.renter = renter;
    }

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

    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }

    public Availability getAvailability() {
        return availability;
    }

    public void setAvailability(Availability availability) {
        this.availability = availability;
    }


    @Override
    public String toString() {
        return "Unit{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", floor=" + floor +
                ", availability=" + availability +
                '}';
    }
}
