package com.primtech.RegisterLogin.Entity;


import jakarta.persistence.*;

@Entity
@Table(name="user")
public class User {
    @Id
    @Column(name="user_id", length = 50)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;

    @Column(name="user_fname", length = 255)
    private String userfname;

    @Column(name="user_lname", length = 255)
    private String userlname;

    @Column(name="email",length = 255)
    private String email;

    @Column(name="password", length = 255)
    private String password;
    @Column(name="mobilenumber", length = 12)
    private int mobilenumber;

    @Column(name="NIC", length = 255)
    private String NIC;
    @Column(name="gender", length = 255)
    private String gender;

    public User(int userId, String userfname, String userlname, String email, int mobilenumber, String NIC, String gender, String encode) {
        this.userId = userId;
        this.userfname = userfname;
        this.userlname = userlname;
        this.email = email;
        this.password = password;
        this.mobilenumber = mobilenumber;
        this.NIC = NIC;
        this.gender = this.gender;
    }

    public User() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserfname() {
        return userfname;
    }

    public void setUserfname(String userfname) {
        this.userfname = userfname;
    }

    public String getUserlname() {
        return userlname;
    }

    public void setUserlname(String userlname) {
        this.userlname = userlname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(int mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    public String getNIC() {
        return NIC;
    }

    public void setNIC(String NIC) {
        this.NIC = NIC;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userfname='" + userfname + '\'' +
                ", userlname='" + userlname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", mobilenumber=" + mobilenumber +
                ", NIC='" + NIC + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
