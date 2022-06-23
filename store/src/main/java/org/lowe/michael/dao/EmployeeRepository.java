package org.lowe.michael.dao;

import java.util.List;

import org.lowe.michael.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	//add a method to sort by last name
	
	public List<Employee> findAllByOrderByLastNameAsc();
}
