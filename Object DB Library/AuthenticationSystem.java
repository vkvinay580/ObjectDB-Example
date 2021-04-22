package alhasan.dbms;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AuthenticationSystem {
    @Id
    private int loginId=0;
    private String password="123";

    public AuthenticationSystem() {
    }

    public AuthenticationSystem(int loginId, String password) {
        this.loginId = loginId;
        this.password = password;
    }

    public int getLoginId() {
        return loginId;
    }

    public void setLoginId(int loginId) {
        this.loginId = loginId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
