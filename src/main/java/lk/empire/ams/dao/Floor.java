package lk.empire.ams.dao;

import lk.empire.ams.dto.FloorDTO;
import org.springframework.beans.BeanUtils;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;

@Entity

public class Floor {

    @Column(name = "id", nullable = false, updatable = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private int id;

    @Size(max = 20)
    @Pattern(regexp = "^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$")
    private String color; ////Color code hexa 	e.g "#1AFFA1"


    @Size(min = 0, max = 20)
    private String name;

    @Size(max = 100)
    private int number;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="floors")
    private Apartment apartment;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Apartment getApartment() {
        return apartment;
    }

    public void setApartment(Apartment apartment) {
        this.apartment = apartment;
    }


    @Override
    public String toString() {
        return "Floor{" +
                "id=" + id +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", number=" + number +
                ", apartment=" + apartment +
                '}';
    }

    public FloorDTO getDTO(){
        FloorDTO dto = new FloorDTO();
        BeanUtils.copyProperties(this, dto);
        return dto;
    }

    public void setDTO(FloorDTO dto){
        if(dto == null) return;
        BeanUtils.copyProperties(dto, this);
    }
}
