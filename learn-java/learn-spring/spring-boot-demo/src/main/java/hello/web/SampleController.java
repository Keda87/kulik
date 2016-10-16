package hello.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by adiyatmubarak on 10/16/16.
 */
@RestController
public class SampleController {

    @RequestMapping("/")
    String name() {
        return "Hello world!";
    }

}
