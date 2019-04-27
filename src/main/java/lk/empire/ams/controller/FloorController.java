package lk.empire.ams.controller;

import lk.empire.ams.dao.Floor;
import lk.empire.ams.dto.FloorDTO;
import lk.empire.ams.service.FloorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FloorController {

    @Autowired
    private FloorService floorService;

    @CrossOrigin
    @GetMapping("/floor")
    public List<Floor> getMappingFloor() {
        return floorService.getAllFloors();
    }

    @PostMapping("/floor")
    public String saveEmployee(@RequestBody FloorDTO employee) {
        return floorService.save(employee);
    }

}
