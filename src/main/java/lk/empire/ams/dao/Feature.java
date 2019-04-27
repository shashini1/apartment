package lk.empire.ams.dao;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Arrays;

@Entity
@Table(name = "feature")

public class Feature {

    @Column(name = "id", nullable = false, updatable = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private int id;

    @Size(min = 0, max = 60)
    private String name;

    @Size(min = 0)
    private String description;

    @Lob
    private byte[] image;

    @Size(min = 0, max = 2000)
    private double amount;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Feature{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", image=" + Arrays.toString(image) +
                ", amount=" + amount +
                '}';
    }
}
