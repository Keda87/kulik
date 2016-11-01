package id.web.adiyatmubarak.repositories;

import id.web.adiyatmubarak.models.Author;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by adiyatmubarak on 11/2/16.
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {

    List<Author> findByFirstName(String firstName);

    List<Author> findByLastName(String lastName);
}
