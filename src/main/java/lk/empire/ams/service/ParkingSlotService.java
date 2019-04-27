package lk.empire.ams.service;

import lk.empire.ams.dao.ParkingSlot;
import lk.empire.ams.repository.ParkingSlotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ParkingSlotService {

    @Autowired
    private ParkingSlotRepository parkingSlotRepository;

    public List<ParkingSlot> getAllParkigSlots(){
        List<ParkingSlot> parkingSlotList = parkingSlotRepository.findAll();
        return parkingSlotList;
    }
}
