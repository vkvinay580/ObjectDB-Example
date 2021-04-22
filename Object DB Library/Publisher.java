package alhasan.dbms;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.time.Year;

@Entity
public class Publisher {
    @Id
    private int publisherId=123;
    private String name="pubname";
    private LocalDateTime yearOfPublication=LocalDateTime.now();

    public Publisher() {
    }

    public Publisher(int publisherId, String name, LocalDateTime yearOfPublication) {
        this.publisherId = publisherId;
        this.name = name;
        this.yearOfPublication = yearOfPublication;
    }

    public int getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(int publisherId) {
        this.publisherId = publisherId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(LocalDateTime yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
}
