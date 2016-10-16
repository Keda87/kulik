package hello.domain;

import java.util.Date;

/**
 * Created by adiyatmubarak on 10/16/16.
 */
public class Author {

    private String name;
    private Long id;

    public Author(String name) {
        this.name = name;
        this.id = new Date().getTime();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
