package vault;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(Configuration.class)
public class Application implements CommandLineRunner {

	private final Configuration configuration;

	public Application(Configuration configuration) {
		this.configuration = configuration;
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) {

		Logger logger = LoggerFactory.getLogger(Application.class);

		logger.info("----------------------------------------");
		logger.info("Fetching details from Vault engine");
		logger.info("Username {}", configuration.getUsername());
		logger.info("Password {}", configuration.getPassword());
		logger.info("----------------------------------------");
	}
}
