package lk.empire.ams.controller;

import lk.empire.ams.dao.Apartment;
import lk.empire.ams.service.ApartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
public class ApartmentController {

    @Autowired
    private ApartmentService apartmentService;

    @CrossOrigin
    @GetMapping("/apartment")
    public List<Apartment> getMappingApartment(){
        return apartmentService.getAllApartment();
    }

    @GetMapping("/{id}")
    public Optional<Apartment> getById(@PathVariable(required = true) int id) {
        return apartmentService.getApartmentById(id);
    }

     //Add a new Apartment
    @PostMapping("/apartment")
    public Apartment saveApartment(@Valid @RequestBody Apartment apartment) {
        return apartmentService.saveBasicApartment(apartment);
    }

    /* Delete a  Apartment */
    @DeleteMapping("/{id}")
    public void delete(@PathVariable(required = true) int id){
        apartmentService.delete(id);
    }
}
