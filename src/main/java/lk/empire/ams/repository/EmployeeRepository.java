package lk.empire.ams.repository;

import lk.empire.ams.dao.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

    Employee save(Employee employee);
}
