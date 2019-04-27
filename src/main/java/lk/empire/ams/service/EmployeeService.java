package lk.empire.ams.service;

import lk.empire.ams.dao.Employee;
import lk.empire.ams.dto.EmployeeDTO;
import lk.empire.ams.repository.EmployeeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Service class for managing employees.
 */

@Service

public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    /**
    * Get all the employee. return employeeDto list
    **/

    public List<Employee> getAllEmployees(){
        List<Employee> employeeList = employeeRepository.findAll();

        // create a new object. And assign iterative value in to this obect
//        List<EmployeeDTO> employeeDTOList = new ArrayList<EmployeeDTO>();
//
//        for (Employee employee : employeeList){
//            EmployeeDTO employeeDTO = EmployeeDTO.valueOf(employee);
//            employeeDTOList.add(employeeDTO);
//        }

        return employeeList;
    }

    /**
     * Save a employee.
     */

//    public Employee create(Employee employee){
//       return employeeRepository.save(employee);
//
//    }

    /* Save a Apartment.
     */

    public Employee saveEmployee(Employee apartmentDTO){
        if(apartmentDTO == null) return null;
        Employee match = null;
        Optional<Employee> employee1 = employeeRepository.findById(apartmentDTO.getId());
        if(employee1 != null && employee1.isPresent()){
            match = employee1.get();
            dtoToEntity(apartmentDTO, match);
        }
        return employeeRepository.save(match);

    }

    private void dtoToEntity(Employee apartmentDTO, Employee employee1) {
        BeanUtils.copyProperties(apartmentDTO, employee1);
    }

    /**
     * get a one employee.
     */

    public EmployeeDTO getOneEmployee() {
        Employee employee = employeeRepository.getOne(2);
        EmployeeDTO employeeDTO = EmployeeDTO.valueOf(employee);
        return employeeDTO;
    }
}
