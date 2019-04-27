package lk.empire.ams.service;

import lk.empire.ams.dao.Apartment;
import lk.empire.ams.dao.Floor;
import lk.empire.ams.enums.ApartmnetOperation;
import lk.empire.ams.repository.ApartmentRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Service class for managing apartment.
 */

@Service
public class ApartmentService {

    @Autowired
    private ApartmentRepository apartmentRepository;

    /**
     * Get all the apartment
     */

    public List<Apartment> getAllApartment(){
        List<Apartment> apartmentList = (List<Apartment>) apartmentRepository.findAll();
            return apartmentList;
    }

     /* Get a Apartment by id.
     */
     public Optional<Apartment> getApartmentById(int id) {
         Optional<Apartment> apartment = apartmentRepository.findById(id);
         return apartment;
     }


      /* Save a Apartment.
     */

    public Apartment saveBasicApartment(Apartment apartmentDTO){
        if(apartmentDTO == null) return null;
        Apartment match = null;
        Optional <Apartment> apartment1 = apartmentRepository.findById(apartmentDTO.getId());
        if(apartment1 != null && apartment1.isPresent()){
            match = apartment1.get();
            dtoToEntity(apartmentDTO, match);
        }
        return apartmentRepository.save(match);

    }

   /* public Apartment updateFloors(int apartmentID, Floor floor, ApartmnetOperation operation){
        Optional <Apartment> apartment1 = apartmentRepository.findById(apartmentID);
        if(apartment1 == null || !apartment1.isPresent() || floor == null || operation == null){
          return null;
        }
        Apartment  match = apartment1.get();
        if(match == null) return null;
        floor.setApartment(match);
        switch (operation){
            case ADD:
                match.getFloors().add(floor); break;
            case EDIT:
            default:


        }}*/




    private void dtoToEntity(Apartment apartmentDTO, Apartment apartment1) {
        BeanUtils.copyProperties(apartmentDTO, apartment1);
    }

      /* Delete a Apartment.
     */

    public void delete(int id){
        apartmentRepository.deleteById(id);

    }
}
