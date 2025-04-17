/**
 * 
 */
package com.shekhar.entity;

import java.util.List;

/**
 * @author shekhar
 */

public interface EmployeeService {

	public EmployeeDTO saveEmployee(EmployeeDTO employeeDTO);

	public List<EmployeeDTO> getAllEmployee();

	public EmployeeDTO updateEmployee(Long Employee, EmployeeDTO employeeDTO);

}
