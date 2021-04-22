package alhasan.dbms;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue( strategy= GenerationType.AUTO )
    private int staffid;
    private String name;
    private int login_id;
    private String password;

    public User(int staffid,String name,int login_id,String password){
        this.staffid = staffid;
        this.name = name;
        this.login_id = login_id;
        this.password = password;
    }
    public  String getUserStringDetails(){
        return "User(staffid:"+staffid+",name:'"+name+"',login_id:"+login_id+"password:"+password;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
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

    public int getLogin_id() {
        return login_id;
    }

    public void setLogin_id(int login_id) {
        this.login_id = login_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
