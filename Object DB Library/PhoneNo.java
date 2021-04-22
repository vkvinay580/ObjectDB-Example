package alhasan.dbms;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PhoneNo {
    @Id
    private int id=123;
    String phoneNo="123123";

    public PhoneNo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public PhoneNo(int id, String phoneNo) {
        this.id = id;
        this.phoneNo = phoneNo;
    }
}
