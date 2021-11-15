package net.codejava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication
@ComponentScan("net.codejava")
@EntityScan(basePackages = {"net.codejava"})
public class GestionUtilisateurApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionUtilisateurApplication.class, args);
		System.out.println("app working");
	}

}
