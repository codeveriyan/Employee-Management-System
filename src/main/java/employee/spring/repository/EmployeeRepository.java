package employee.spring.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import employee.spring.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}