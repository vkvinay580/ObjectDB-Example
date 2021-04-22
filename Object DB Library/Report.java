package alhasan.dbms;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Report {
    @Id
    private int Reg_no=123;
    private int UserUid=123;
    private int bookNo=123;
    private int issue_Return=123;

    public Report() {
    }

    public Report(int reg_no, int userUid, int bookNo, int issue_Return) {
        Reg_no = reg_no;
        UserUid = userUid;
        this.bookNo = bookNo;
        this.issue_Return = issue_Return;
    }

    public int getReg_no() {
        return Reg_no;
    }

    public void setReg_no(int reg_no) {
        Reg_no = reg_no;
    }

    public int getUserUid() {
        return UserUid;
    }

    public void setUserUid(int userUid) {
        UserUid = userUid;
    }

    public int getBookNo() {
        return bookNo;
    }

    public void setBookNo(int bookNo) {
        this.bookNo = bookNo;
    }

    public int getIssue_Return() {
        return issue_Return;
    }

    public void setIssue_Return(int issue_Return) {
        this.issue_Return = issue_Return;
    }
}
