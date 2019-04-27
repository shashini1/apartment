package lk.empire.ams.controller;

import lk.empire.ams.dao.Employee;
import lk.empire.ams.dto.EmployeeDTO;
import lk.empire.ams.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;


    /**
     * Get employee list. return omployee list
     */
    @CrossOrigin
    @GetMapping("/employee")
    public List<Employee> getMappingEmployee(){
        return employeeService.getAllEmployees();
    }

    /**
     * Get a one employee. return a one omployee
     */

    @GetMapping("/oneemp")
    public EmployeeDTO getemp() {
        return employeeService.getOneEmployee();
    }

    /**
     * Add new Employee
     */
    @PostMapping("/addemployeedetails")
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);

    }


}
