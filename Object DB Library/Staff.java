package alhasan.dbms;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Staff {
    @Id
    private int staffid=123;
    private String name="staffName";
    @ManyToMany(targetEntity = Reader.class)
    private Set<Reader> readersSet;
    @ManyToOne
    private AuthenticationSystem authenticationSystem = new AuthenticationSystem();
    @OneToMany( targetEntity=Book.class )
    private List<Book> books = new ArrayList<Book>(){{
        add(new Book());
        add(new Book());
    }};
    @OneToMany( targetEntity=Report.class )
    private List<Report> reprts = new ArrayList<Report>(){{
        add(new Report());
        add(new Report());
    }};

    public Staff() {
        this.readersSet = new HashSet<Reader>(){{
            add(new Reader());
            add((new Reader()));
        }
        };
    }

    public Staff(Set<Reader> readersSet) {
        this.readersSet = readersSet;
    }

    public Staff(int staffid, String name, Set readersSet, AuthenticationSystem authenticationSystem, List books, List reprts) {
        this.staffid = staffid;
        this.name = name;
        this.readersSet = readersSet;
        this.authenticationSystem = authenticationSystem;
        this.books = books;
        this.reprts = reprts;
    }

    public int getStaffid() {
        return staffid;
    }

    public void setStaffid(int staffid) {
        this.staffid = staffid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set getReadersSet() {
        return readersSet;
    }

    public void setReadersSet(Set readersSet) {
        this.readersSet = readersSet;
    }

    public AuthenticationSystem getAuthenticationSystem() {
        return authenticationSystem;
    }

    public void setAuthenticationSystem(AuthenticationSystem authenticationSystem) {
        this.authenticationSystem = authenticationSystem;
    }

    public List getBooks() {
        return books;
    }

    public void setBooks(List books) {
        this.books = books;
    }

    public List getReprts() {
        return reprts;
    }

    public void setReprts(List reprts) {
        this.reprts = reprts;
    }
}
