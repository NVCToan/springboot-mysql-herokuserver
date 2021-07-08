package com.laptrinhjavaweb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

@Configuration
@EnableJpaAuditing (auditorAwareRef = "auditorProvider")
public class JPAAuditingConfig {
	@Bean 
	public AuditorAware<String> auditorProvider(){
		return new AuditorAwareImp();
	}
	
	public static class AuditorAwareImp implements AuditorAware<String> {

		
		// Đây là chỗ dùng để get username cho phần createBy và 
		@Override
		public String getCurrentAuditor() {
			Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
			if(authentication == null) {
				return null;
			}
			return authentication.getName();
		}
		
		
		
	}
}
