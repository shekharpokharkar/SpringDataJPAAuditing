/**
 * 
 */
package com.shekhar.entity;

import org.springframework.beans.BeanUtils;

/**
 * @author shekhar
 */
public interface EmployeeUtils {

	public static Employee map(EmployeeDTO employeedto) {
		Employee employee = new Employee();
		BeanUtils.copyProperties(employeedto, employee);

		return employee;

	}

	public static EmployeeDTO map(Employee employee) {
		EmployeeDTO dto = new EmployeeDTO();
		BeanUtils.copyProperties(employee, dto);

		return dto;

	}
}
