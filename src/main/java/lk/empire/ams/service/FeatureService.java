package lk.empire.ams.service;

import lk.empire.ams.dao.Feature;
import lk.empire.ams.dto.FeatureDTO;
import lk.empire.ams.repository.FeatureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Service class for managing features.
 */

@Service

public class FeatureService {

    @Autowired
    private FeatureRepository featureRepository;

    /**
     * Get all the features. return featureDto list
     */

    public List<Feature> getAllFeatues(){
        List<Feature> featureList = featureRepository.findAll();

        // create a new object. And assign iterative value in to this obect
//        List<FeatureDTO> featureDTOList = new ArrayList<FeatureDTO>();
//
//        for(Feature feature : featureList){
//            FeatureDTO featureDTO = FeatureDTO.valueOf(feature);
//            featureDTOList.add(featureDTO);
//        }
        return featureList;
    }
}
