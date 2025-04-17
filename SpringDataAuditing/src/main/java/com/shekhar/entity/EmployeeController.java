/**
 * 
 */
package com.shekhar.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shekhar
 */
@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/")
	public ResponseEntity<EmployeeDTO> saveEmployee(@RequestBody EmployeeDTO employee) {
		EmployeeDTO saveEmployee = employeeService.saveEmployee(employee);

		return new ResponseEntity<EmployeeDTO>(employee, HttpStatus.CREATED);

	}

	@GetMapping("/")
	public ResponseEntity<List<EmployeeDTO>> getAllEmployee() {
		List<EmployeeDTO> saveEmployee = employeeService.getAllEmployee();

		return new ResponseEntity<List<EmployeeDTO>>(saveEmployee, HttpStatus.CREATED);

	}

	@PutMapping("/{empId}")
	public ResponseEntity<EmployeeDTO> updateEmployee(@PathVariable("empId") Long empId,
			@RequestBody EmployeeDTO employee) {
		EmployeeDTO saveEmployee = employeeService.updateEmployee(empId, employee);

		return new ResponseEntity<EmployeeDTO>(employee, HttpStatus.CREATED);

	}
}
