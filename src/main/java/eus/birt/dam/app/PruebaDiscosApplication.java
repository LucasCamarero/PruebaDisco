package eus.birt.dam.app;
/*
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PruebaDiscosApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebaDiscosApplication.class, args);
	}

}*/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "eus.birt.dam")  // detecta BootStrapData, controladores, etc.
@EnableJpaRepositories(basePackages = "eus.birt.dam.repository")
@EntityScan(basePackages = "eus.birt.dam.domain")
public class PruebaDiscosApplication {

    public static void main(String[] args) {
        SpringApplication.run(PruebaDiscosApplication.class, args);
    }

}


