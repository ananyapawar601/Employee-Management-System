package psu.edu.Project.security;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectSecurityConfig {

	
	@Bean
	public UserDetailsManager userDetailsManager(DataSource dataSource) {
	    JdbcUserDetailsManager jdbcUserDetailsManager = new JdbcUserDetailsManager(dataSource);
	    
	    // Configure query to retrieve user by username (matches your users table)
	    jdbcUserDetailsManager.setUsersByUsernameQuery(
	        "SELECT username, password, active FROM users WHERE username=?"
	    );
	    
	    // Configure query to retrieve authorities by username (matches your roles table)
	    jdbcUserDetailsManager.setAuthoritiesByUsernameQuery(
	        "SELECT username, role FROM roles WHERE username=?"
	    );
	    
	    return jdbcUserDetailsManager;
	}
	
	
	@Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(configurer ->
            configurer
                .requestMatchers("/employees/showFormForAdd").hasAnyRole("MANAGER", "ADMIN")
                .requestMatchers("/employees/showFormForUpdate").hasAnyRole("MANAGER", "ADMIN")
                .requestMatchers("/employees/delete").hasAnyRole("ADMIN")
                .requestMatchers("/employees/**").authenticated()
                .anyRequest().permitAll()
        )
        .formLogin(form ->
            form
                .loginPage("/showMyLoginPage")
                .loginProcessingUrl("/authenticateTheUser")
                .defaultSuccessUrl("/employees/list")
                .permitAll()
        )
        .logout(logout -> logout.permitAll())
        .exceptionHandling(configurer -> 
            configurer.accessDeniedPage("/access-denied")
        );
        
        return http.build();
    }
}
