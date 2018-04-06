package ru.mephi.onlineplatform.entities;


import java.util.Date;
import java.util.List;
import java.util.Random;

public abstract class User {

    private Long id;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String picture;
    private Status status;
    private int enable = 0;
    private Date lastLogin;
    private Date createAt;
    private SystemRole userRole;

    public enum Status {
        NEW,
        EMAIL_VERIFICATION,
        BLOCKED
    }

    public User() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getEnable() {
        return enable;
    }

    public void setEnable(int enable) {
        this.enable = enable;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public SystemRole getUserRole() {
        return userRole;
    }

    public void setUserRole(SystemRole userRole) {
        this.userRole = userRole;
    }
}
