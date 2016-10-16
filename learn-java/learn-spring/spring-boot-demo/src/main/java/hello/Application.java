package hello;

import hello.domain.Author;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;

/**
 * Created by adiyatmubarak on 10/16/16.
 */
@SpringBootApplication
public class Application {

    public static HashMap<Long, Author> authors;

    public static void main(String[] args) {
        Author a1 = new Author("Foo");
        Author a2 = new Author("Bazz");
        authors = new HashMap<>();
        authors.put(a1.getId(), a1);
        authors.put(a2.getId(), a2);

        SpringApplication.run(Application.class, args);
    }
}
