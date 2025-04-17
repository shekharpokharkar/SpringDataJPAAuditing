/**
 * 
 */
package com.shekhar.entity;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author shekhar
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public EmployeeDTO saveEmployee(EmployeeDTO employeeDTO) {

		Employee employee = EmployeeUtils.map(employeeDTO);
		Employee save = employeeRepository.save(employee);
		EmployeeDTO dto = EmployeeUtils.map(save);
		return dto;
	}

	@Override
	public List<EmployeeDTO> getAllEmployee() {

		List<EmployeeDTO> list = employeeRepository.findAll().stream().map(EmployeeUtils::map).toList();

		return list;
	}

	@Override
	public EmployeeDTO updateEmployee(Long Employee, EmployeeDTO employeeDTO) {

		Employee emp = employeeRepository.findById(Employee)
				.orElseThrow(() -> new RuntimeException("Employee Not Found"));

		BeanUtils.copyProperties(employeeDTO, emp);
		emp.setEmployeeId(Employee);
		Employee save = employeeRepository.save(emp);
		EmployeeDTO dto = EmployeeUtils.map(save);
		return dto;

	}

}
