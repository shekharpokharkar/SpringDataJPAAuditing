/**
 * 
 */
package com.shekhar.entity;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shekhar.entity.Employee;

/**
 * @author shekhar
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
