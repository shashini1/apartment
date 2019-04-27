package lk.empire.ams.service;

import lk.empire.ams.dao.Unit;
import lk.empire.ams.dto.UnitDTO;
import lk.empire.ams.repository.UnitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Service class for managing block.
 */

@Service

public class UnitService {

    @Autowired
    private UnitRepository unitRepository;

    /**
     * Get all the block. return blockDto list
     */

    public List<Unit> getAllUnit(){
        List<Unit> unitList = unitRepository.findAll();

        // create a new object. And assign iterative value in to this obect
//        List<UnitDTO> unitDTOList = new ArrayList<UnitDTO>();
//
//        for (Unit unit : unitList){
//            UnitDTO unitDTO = UnitDTO.valueOf(unit);
//            unitDTOList.add(unitDTO);
//        }
        return unitList;
    }

    public void saveUnit(Unit unit){
        unitRepository.save(unit);

    }
}
