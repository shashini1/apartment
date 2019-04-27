package lk.empire.ams.controller;

import lk.empire.ams.dao.Feature;
import lk.empire.ams.dto.FeatureDTO;
import lk.empire.ams.service.FeatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class FeatureController {

    @Autowired
    private FeatureService featureService;

    @CrossOrigin
    @GetMapping("/feature")
    public List<Feature> getMappingFeatures(){
        return featureService.getAllFeatues();
    }
}
