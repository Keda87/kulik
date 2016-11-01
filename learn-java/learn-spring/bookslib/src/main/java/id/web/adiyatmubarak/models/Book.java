package id.web.adiyatmubarak.models;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by adiyatmubarak on 11/2/16.
 */
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private Long totalPage;

    @ManyToOne(fetch = FetchType.LAZY)
    private Author author;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = true)
    private Date published;

    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    private Category category;

    public Book() {
    }

    public Book(String title, Long totalPage, Author author, Date published, Category category) {
        this.title = title;
        this.totalPage = totalPage;
        this.author = author;
        this.published = published;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
    }

    public Date getPublished() {
        return published;
    }

    public void setPublished(Date published) {
        this.published = published;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", totalPage=" + totalPage +
                ", author=" + author +
                ", published=" + published +
                ", category=" + category +
                '}';
    }
}
