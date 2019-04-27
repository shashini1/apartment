package lk.empire.ams.service;

import lk.empire.ams.dao.Maintenance;
import lk.empire.ams.dto.MaintenanceDTO;
import lk.empire.ams.repository.MaintenanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class MaintenanceService {

    @Autowired
    private MaintenanceRepository maintenanceRepository;

    /**
     * Get all maintenance. return maintenance list
     **/

    public List<Maintenance> getAllMaintenace(){
        List<Maintenance> maintenancesList = maintenanceRepository.findAll();

        // create a new object. And assign iterative value in to this obect
//        List<MaintenanceDTO> maintenanceDTOList = new ArrayList<MaintenanceDTO>();
//        for (Maintenance maintenance : maintenancesList){
//            MaintenanceDTO maintenanceDTO = MaintenanceDTO.valueOf(maintenance);
//            maintenanceDTOList.add(maintenanceDTO);
//        }
        return maintenancesList;
    }
}
