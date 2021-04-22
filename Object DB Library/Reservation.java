package alhasan.dbms;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.text.DateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Reservation {
    @Id
    private LocalDateTime reservationDate= LocalDateTime.now();
    private LocalDateTime dueDate = LocalDateTime.now();
    private LocalDateTime returnDate = LocalDateTime.now();
    @OneToMany( targetEntity=Book.class )
    private List<Book> books = new ArrayList<Book>(){{
        add(new Book());
        add(new Book());
    }};

    public Reservation(LocalDateTime reservationDate, LocalDateTime dueDate, LocalDateTime returnDate, List books) {
        this.reservationDate = reservationDate;
        this.dueDate = dueDate;
        this.returnDate = returnDate;
        this.books = books;
    }

    public LocalDateTime getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(LocalDateTime reservationDate) {
        this.reservationDate = reservationDate;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }

    public LocalDateTime getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDateTime returnDate) {
        this.returnDate = returnDate;
    }

    public List getBooks() {
        return books;
    }

    public void setBooks(List books) {
        this.books = books;
    }
}
