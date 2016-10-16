package hello.web;

import hello.Application;
import hello.domain.Author;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * Created by adiyatmubarak on 10/16/16.
 */
@RestController
@RequestMapping("/api/v1/authors")
public class AuthorController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public HashMap<Long, Author> getAllAuthors() {
        return Application.authors;
    }

}
