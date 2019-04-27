package lk.empire.ams.service;

import lk.empire.ams.dao.Apartment;
import lk.empire.ams.dao.Floor;
import lk.empire.ams.dto.FloorDTO;
import lk.empire.ams.repository.ApartmentRepository;
import lk.empire.ams.repository.FloorRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class FloorService {
    @Autowired
    ApartmentRepository apartmentRepository;

    @Autowired
    private FloorRepository floorRepository;

    /**
     * Get all the floors. return floorDto list
     */

    public List<Floor> getAllFloors(){
        List<Floor> floorsList = floorRepository.findAll();

        // create a new object. And assign iterative value in to this obect
//        List<FloorDTO> floorDTOList = new ArrayList<FloorDTO>();
//
//        for (Floor floor : floorsList){
//            FloorDTO floorDTO = FloorDTO.valueOf(floor);
//            floorDTOList.add(floorDTO);
//        }
        return floorsList;
    }

    public String save(FloorDTO floorDTO){
        Optional<Apartment> apartmentOptional = apartmentRepository.findById(floorDTO.getApartmentId());
        if(apartmentOptional == null || !apartmentOptional.isPresent()){
            return "Matching apartment not found";
        }

        Floor floor = new Floor();
        BeanUtils.copyProperties(floorDTO, floor);
        floor.setApartment(apartmentOptional.get());
        floorRepository.save(floor);
        return "success";
    }
}
