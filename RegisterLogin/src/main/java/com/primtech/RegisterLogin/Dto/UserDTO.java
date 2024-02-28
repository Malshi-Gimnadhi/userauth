package com.primtech.RegisterLogin.Dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class UserDTO {


    private int userId;

    private String userfname;


    private String userlname;

    private String email;

    private String password;

    private int mobilenumber;

    private String NIC;

    private String gender;

    public UserDTO(int userId, String userfname, String userlname, String email, String password, int mobilenumber, String NIC, String gender) {
        this.userId = userId;
        this.userfname = userfname;
        this.userlname = userlname;
        this.email = email;
        this.password = password;
        this.mobilenumber = mobilenumber;
        this.NIC = NIC;
        this.gender = gender;
    }

    public UserDTO() {
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
        return "UserDTO{" +
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
