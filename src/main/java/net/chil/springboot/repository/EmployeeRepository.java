package net.chil.springboot.repository;

import net.chil.springboot.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    //all crud database methods

}
