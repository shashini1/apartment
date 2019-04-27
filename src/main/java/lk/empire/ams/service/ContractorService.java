package lk.empire.ams.service;

import lk.empire.ams.dao.Contractor;
import lk.empire.ams.dto.ContractorsDTO;
import lk.empire.ams.repository.ContractorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Service class for managing contractors.
 */

@Service

public class ContractorService {

    @Autowired
    private ContractorRepository contractorRepository;

    /**
     * Get all the Contractor. return contractorDto list
     */
    public List<Contractor> getAllContracts(){
        List<Contractor> contractorList = contractorRepository.findAll();

        // create a new object. And assign iterative value in to this obect
//        List<ContractorsDTO> contractorsDTOList = new ArrayList<ContractorsDTO>();
//        for (Contractor contractor : contractorList){
//            ContractorsDTO contractorsDTO = ContractorsDTO.valueOf(contractor);
//            contractorsDTOList.add(contractorsDTO);
//        }
        return contractorList;
    }
}
