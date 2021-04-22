package alhasan.dbms;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Reader {
    @Id
    private int Uid=123;
    private FullName fullName;
    private String address="address";
    private String email="email@email.com";
    @OneToMany( targetEntity=PhoneNo.class )
    private List<PhoneNo> phoneNumbers = new ArrayList<PhoneNo>(){{
        add(new PhoneNo(123,"123"));
        add(new PhoneNo(456,"456"));
    }};
    @OneToOne
    private Reservation reservation;
    @ManyToMany(targetEntity = Staff.class)
    private Set<Staff> staffSet = new HashSet<Staff>(){{
    add(new Staff(null));
    add((new Staff(null)));
    }
    };

    public Reader() {
    }

    public Reader(int uid, FullName fullName, String address, String email, List phoneNumbers, Reservation reservation) {
        Uid = uid;
        this.fullName = fullName;
        this.address = address;
        this.email = email;
        this.phoneNumbers = phoneNumbers;
        this.reservation = reservation;
    }

    public int getUid() {
        return Uid;
    }

    public void setUid(int uid) {
        Uid = uid;
    }

    public FullName getFullName() {
        return fullName;
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
}
