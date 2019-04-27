package lk.empire.ams.controller;

import lk.empire.ams.dao.Unit;
import lk.empire.ams.dto.UnitDTO;
import lk.empire.ams.service.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
@CrossOrigin
public class UnitController {

    @Autowired
    private UnitService unitService;

    @GetMapping("/unit")
    public List<Unit> GetMappingUnit(){
        return unitService.getAllUnit();
    }

    @PostMapping("/unit/save")
    public void saveUnit(@RequestBody Unit unit){
        unitService.saveUnit(unit);
    }
}

