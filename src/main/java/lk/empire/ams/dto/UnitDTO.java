package lk.empire.ams.dto;

import lk.empire.ams.dao.Unit;
import org.springframework.beans.BeanUtils;

import java.util.List;

public class UnitDTO {

    private int id;
    private String name;
    private List<FeatureDTO> featureList;
    private AvailabilityDTO availability;

    public static UnitDTO valueOf(Unit unit){
        UnitDTO unitDTO = new UnitDTO();
        BeanUtils.copyProperties(unit, unitDTO);
        return unitDTO;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<FeatureDTO> getFeatureList() {
        return featureList;
    }

    public void setFeatureList(List<FeatureDTO> featureList) {
        this.featureList = featureList;
    }

    public AvailabilityDTO getAvailability() {
        return availability;
    }

    public void setAvailability(AvailabilityDTO availability) {
        this.availability = availability;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
