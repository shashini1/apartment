package lk.empire.ams.dto;

import lk.empire.ams.dao.Floor;
import org.springframework.beans.BeanUtils;

public class FloorDTO {

    private int id;
    private  String color;
    private String name;
    private int commonAreaId;
    private String commonAreaName;
    private int apartmentId;

//    public static FloorDTO valueOf(Floor floor){
//        FloorDTO floorDTO = new FloorDTO();
//        BeanUtils.copyProperties(floor, floorDTO);
//        return floorDTO;
//    }

    public String getColor() {
        return color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getCommonAreaId() {
        return commonAreaId;
    }

    public void setCommonAreaId(int commonAreaId) {
        this.commonAreaId = commonAreaId;
    }

    public String getCommonAreaName() {
        return commonAreaName;
    }

    public void setCommonAreaName(String commonAreaName) {
        this.commonAreaName = commonAreaName;
    }

    public int getApartmentId() {
        return apartmentId;
    }

    public void setApartmentId(int apartmentId) {
        this.apartmentId = apartmentId;
    }
}
