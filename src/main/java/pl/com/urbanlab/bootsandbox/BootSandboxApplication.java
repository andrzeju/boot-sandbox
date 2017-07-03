package pl.com.urbanlab.bootsandbox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootSandboxApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootSandboxApplication.class, args);
		User user = new User("John", "McLane", "john@nakatomiplaza.com");
		System.out.println("User login annotated with lombok annotation: " + user.getLogin());
	}
}
