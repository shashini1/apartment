package lk.empire.ams.controller;

import lk.empire.ams.dao.ParkingSlot;
import lk.empire.ams.service.ParkingSlotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class ParkingSlotController {

    @Autowired
    private ParkingSlotService parkingSlotService;

    @GetMapping("/parkingslot")
    public List<ParkingSlot> getMappingParkingSlots(){
        return parkingSlotService.getAllParkigSlots();
    }
}
