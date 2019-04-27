package lk.empire.ams.dto;

import org.springframework.beans.BeanUtils;

public class AvailabilityDTO {

    private int id;
    private String status;

    //Convert availabilityDAO into availabilityDTo using valueOf method
    public static AvailabilityDTO valueOf(lk.empire.ams.dao.Availability availability){
        AvailabilityDTO availabilityDTO = new AvailabilityDTO();
        BeanUtils.copyProperties(availability, availabilityDTO);
        return  availabilityDTO;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
