package lk.empire.ams.service;

import lk.empire.ams.dao.CommonArea;
import lk.empire.ams.dto.CommonAreaDTO;
import lk.empire.ams.repository.CommonAreaRepository;
import lk.empire.ams.repository.FloorRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Service class for managing common Areas.
 */

@Service

public class CommonAreasService {

    @Autowired
    private CommonAreaRepository commonAreaRepository;

    @Autowired
    private FloorRepository floorRepository;

    public List<CommonArea> getAllCommonArea(){
        List<CommonArea> commonAreas = commonAreaRepository.findAll();
        return commonAreas;
    }

    public CommonArea saveCommonAreas(CommonArea commonAreaDTO){
        if(commonAreaDTO == null) return null;
        CommonArea match = null;
        Optional <CommonArea> commonArea1 = commonAreaRepository.findById(commonAreaDTO.getId());
        if(commonArea1 != null && commonArea1.isPresent()){
            match = commonArea1.get();
            dtoToEntity(commonAreaDTO, match);
        }
        return commonAreaRepository.save(match);

    }

    private void dtoToEntity(CommonArea commonAreaDTO, CommonArea commonArea1) {
        BeanUtils.copyProperties(commonAreaDTO, commonArea1);
    }

//    public String save(CommonAreaDTO commonAreaDTO){
//        Optional<Floor> floorOptional = floorRepository.findById(commonAreaDTO.getId());
//        if(floorOptional == null || !floorOptional.isPresent()){
//            return "Matching floor not found";
//        }
//
//        CommonArea commonArea = new CommonArea();
//        BeanUtils.copyProperties(commonAreaDTO, commonArea);
//        commonArea.setFloor(floorOptional.get());
//        floorRepository.save(commonArea);
//        return "success";
//    }
}
