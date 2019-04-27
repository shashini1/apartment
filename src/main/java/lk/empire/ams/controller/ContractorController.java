package lk.empire.ams.controller;

import lk.empire.ams.dao.Contractor;
import lk.empire.ams.dto.ContractorsDTO;
import lk.empire.ams.service.ContractorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class ContractorController {

    @Autowired
    private ContractorService contractorService;

    @CrossOrigin
    @GetMapping("/contractor")
    public List<Contractor> getMappingContracts(){
        return contractorService.getAllContracts();
    }
}
