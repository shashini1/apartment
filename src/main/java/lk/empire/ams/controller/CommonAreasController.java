package lk.empire.ams.controller;

import lk.empire.ams.dao.CommonArea;
import lk.empire.ams.service.CommonAreasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController

public class CommonAreasController {

    @Autowired
    private CommonAreasService commonAreasService;

    @CrossOrigin
    @GetMapping("/commonarea")
    public List<CommonArea> getMappingCommonArea() {
        List<CommonArea> commonAreas = commonAreasService.getAllCommonArea();
        return commonAreas;
    }

    //Add a new Apartment
    @PostMapping("/commonarea")
    public CommonArea saveApartment(@Valid @RequestBody CommonArea commonArea) {
        return commonAreasService.saveCommonAreas(commonArea);
    }
}
