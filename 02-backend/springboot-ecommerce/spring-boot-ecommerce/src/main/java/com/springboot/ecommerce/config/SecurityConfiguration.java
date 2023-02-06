package com.springboot.ecommerce.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.accept.ContentNegotiationStrategy;
import org.springframework.web.accept.HeaderContentNegotiationStrategy;

import com.okta.spring.boot.oauth.Okta;

@Configuration
public class SecurityConfiguration {

	  @Bean
	    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
	    	http.authorizeHttpRequests(configurer->{
	    		configurer.requestMatchers("/api/orders/**").authenticated().requestMatchers("/**").permitAll();;
	    		
	    	}).oauth2ResourceServer().jwt();
	    	
	        // add CORS filters
	        http.cors();
	 
	        // add content negotiation strategy
	        http.setSharedObject(ContentNegotiationStrategy.class,
	        		 new HeaderContentNegotiationStrategy());
	         

        // Send a 401 message to the browser (w/o this, you'll see a blank page)
        Okta.configureResourceServer401ResponseBody(http);
        
        // disable CSRF since we are not using Cookies for session tracking
        http.csrf().disable();
        
        return http.build();
    }
}

