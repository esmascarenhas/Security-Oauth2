package br.com.tqi.OauthAndKeyclock;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Security with Oauth2", version = "1.0.0", description = "Project for practice security with Oauth2"))
public class OauthAndKeyclockApplication {

	public static void main(String[] args) {
		SpringApplication.run(OauthAndKeyclockApplication.class, args);
	}

}
