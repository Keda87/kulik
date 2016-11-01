package id.web.adiyatmubarak;

import id.web.adiyatmubarak.models.Author;
import id.web.adiyatmubarak.repositories.AuthorRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner demo(AuthorRepository repository) {
        return (args) -> {
            // Save some customers.
            repository.save(new Author("John", "Doe"));
            repository.save(new Author("Fizz", "Buzz"));
            repository.save(new Author("Alex", "Ferguson"));
            repository.save(new Author("Adiyat", "Mubarak"));
            repository.save(new Author("Anthony", "Mubarak"));

            // Fetch all author.
            log.info("Fetch all authors.");
            log.info("------------------");
            for (Author author: repository.findAll()) {
                log.info(author.toString());
            }
            log.info("");

            // Get individual data. Get the second data.
            Author author = repository.findOne(2L);
            log.info("Customer 2 found:");
            log.info("-----------------");
            log.info(author.toString());
            log.info("");

            // Fetch last name that has Mubarak.
            log.info("Fetch authors that has last name 'Mubarak'.");
            log.info("------------------");
            for (Author a: repository.findByLastName("Mubarak")) {
                log.info(a.toString());
            }
            log.info("");
        };
    }
}
