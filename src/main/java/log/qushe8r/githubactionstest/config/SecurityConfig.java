package log.qushe8r.githubactionstest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.annotation.web.configurers.HeadersConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	private static final String[] STATIC_RESOURCES = {"/swagger-ui/**", "/swagger", "/v3/api-docs/**", "/webjars/**", "/static/**"};

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http
			.csrf(AbstractHttpConfigurer::disable)

			// enable h2-console
			.headers(headers -> headers
				.frameOptions(HeadersConfigurer.FrameOptionsConfig::sameOrigin)
			)

			.authorizeHttpRequests(authorize -> authorize
				.requestMatchers(STATIC_RESOURCES).permitAll()
				.requestMatchers("/api/login").permitAll()
				.requestMatchers("/api/signup").permitAll() // 회원가입 api
				.requestMatchers("/favicon.ico").permitAll()
				.requestMatchers("/test/**").permitAll()
				.anyRequest().authenticated() // 그 외 인증 없이 접근X
			);
		return http.build();
	}

}
