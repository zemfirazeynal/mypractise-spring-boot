package az.mypractisesecond.mypractisespringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class MypractiseSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MypractiseSpringBootApplication.class, args);
	}

}
