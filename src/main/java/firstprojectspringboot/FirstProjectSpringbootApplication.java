package firstprojectspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "controller ioc_di")
public class FirstProjectSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstProjectSpringbootApplication.class, args);
	}

}
