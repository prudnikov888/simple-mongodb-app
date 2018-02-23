package github.prudnikov888;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("/spring-security.xml")
public class AppConfiguration {

    public static void main(String[] args) {
        SpringApplication.run(AppConfiguration.class, args);
    }
}
