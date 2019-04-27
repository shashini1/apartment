package lk.empire.ams.controller;

import lk.empire.ams.dao.Maintenance;
import lk.empire.ams.dto.MaintenanceDTO;
import lk.empire.ams.service.MaintenanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class MaintenanceController {

    @Autowired
    private MaintenanceService maintenanceService;

    @CrossOrigin
    @GetMapping("/maintenance")
    public List<Maintenance> getMappingMaintenance(){
        return maintenanceService.getAllMaintenace();
    }
}
