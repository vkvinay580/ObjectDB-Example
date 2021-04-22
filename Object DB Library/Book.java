package alhasan.dbms;

import javax.persistence.*;

@Entity
public class Book {
    @Id
    //@GeneratedValue( strategy= GenerationType.AUTO )
    private String isdn="123";
    private String title="title";
    private int authNo=123;
    private int price=123;
    private String category ="123";
    private int edition=123;
    @ManyToOne
    private Publisher publisher;

    public Book() {
    }

    public Book(String isdn,
                String title,
                int authNo,
                int price,
                String category ,
                int edition,
                Publisher publisher){

        this.isdn = isdn;
        this.title = title;
        this.authNo = authNo;
        this.price = price;
        this.category = category;
        this.edition = edition;
        this.publisher = publisher;

    }

    public String getIsdn() {
        return isdn;
    }

    public void setIsdn(String isdn) {
        this.isdn = isdn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAuthNo() {
        return authNo;
    }

    public void setAuthNo(int authNo) {
        this.authNo = authNo;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }
}
