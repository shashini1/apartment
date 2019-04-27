package lk.empire.ams.dto;

import lk.empire.ams.dao.Feature;
import org.springframework.beans.BeanUtils;

public class FeatureDTO {

    private int id;
    private String name;
    private double amount;
    private String description;
    private String image;

    public static FeatureDTO valueOf(Feature feature){
        FeatureDTO featureDTO = new FeatureDTO();
        BeanUtils.copyProperties(feature, featureDTO);
        return featureDTO;
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

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}
