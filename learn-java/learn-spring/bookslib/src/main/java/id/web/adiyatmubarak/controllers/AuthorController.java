package id.web.adiyatmubarak.controllers;

import id.web.adiyatmubarak.models.Author;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created by adiyatmubarak on 11/2/16.
 */
@Controller
public class AuthorController {

    private static final Logger log = LoggerFactory.getLogger(AuthorController.class);

    @GetMapping("/author")
    public String authorForm(Model model) {
        model.addAttribute("author", new Author());
        return "author";
    }

    @PostMapping("/author")
    public String authorSubmit(@ModelAttribute Author author) {
        log.info("Submited data.");
        log.info("--------------");
        log.info(author.toString());
        return "author";
    }

}
