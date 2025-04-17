/**
 * 
 */
package com.shekhar.entity;

import java.util.Optional;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

/**
 * @author shekhar
 */

@Component
public class EmployeeAuditor implements AuditorAware<String> {

	@Override
	public Optional<String> getCurrentAuditor() {

		return Optional.of("shekhar");
	}

}
