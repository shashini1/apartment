package lk.empire.ams.dto;

import lk.empire.ams.dao.ParkingSlot;
import org.springframework.beans.BeanUtils;

public class VehicleDTO {

    private int id;
    private String name;
    private String vehicleNumber;

    public static VehicleDTO valueOf(ParkingSlot parkingSlot){
        VehicleDTO vehicleDTO = new VehicleDTO();
        BeanUtils.copyProperties(parkingSlot, vehicleDTO);
        return vehicleDTO;
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

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }
}
