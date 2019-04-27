package lk.empire.ams.dto;

import lk.empire.ams.dao.Employee;
import org.springframework.beans.BeanUtils;

import java.io.Serializable;

public class EmployeeDTO implements Serializable {

    private int id;
    private String nic;

    // convert employee DAO to DTO classes using valueOf and copyProperties method  ////

    public static EmployeeDTO valueOf(Employee employee){
        EmployeeDTO employeeDTO = new EmployeeDTO();
        BeanUtils.copyProperties(employee, employeeDTO);
//        employeeDto.setId( employee.getId() );
//        employeeDto.setFirstName( employee.getFirstName() );

        return employeeDTO;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

}
