package br.com.letscode.moviesbattle;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableWebSecurity
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private DataSource dataSource;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		.authorizeRequests()
		.antMatchers("/inicio/**")
		.permitAll()
		.antMatchers("/api/**")
		.permitAll()
		.antMatchers("/h2-console/**")
			.permitAll()
		.anyRequest()
			.authenticated()
		.and()
			.formLogin(form -> 
				form.loginPage("/acesso")
				.defaultSuccessUrl("/jogo", true)
				.permitAll()
			)
			.logout(logout -> logout.logoutUrl("/saida").logoutSuccessUrl("/inicio"))
			.csrf().disable();
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
				
		auth.jdbcAuthentication()
			.dataSource(dataSource)
			.passwordEncoder(encoder);
	}
	
	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/**.html", "/v2/api-docs", "/webjars/**", "/configuration/**", "/swagger-resources/**");
	}
	
}