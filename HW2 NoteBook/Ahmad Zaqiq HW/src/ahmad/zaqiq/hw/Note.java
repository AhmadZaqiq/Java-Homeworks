package ahmad.zaqiq.hw;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Note {

    private int id = 0;
    private LocalDateTime createDate = LocalDateTime.now();
    private String title = "";
    private String body = "";
    private Person author = new Person("", 0, "");

    public Note(int id, LocalDateTime createDate, String title, String body, Person author) {
        this.id = id;
        this.createDate = createDate;
        this.title = title;
        this.body = body;
        this.author = author;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Person getAuthor() {
        return author;
    }

    public void setAuthor(Person author) {
        this.author = author;
    }

}
