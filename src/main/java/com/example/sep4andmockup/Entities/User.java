package com.example.sep4andmockup.Entities;

import javax.persistence.*;


@Entity
@Table(name = "user_accounts")
public class User {

    @Id
    @Column(name = "user_id")
    private String id;
    private String username;
    private String email;


    public User() {

    }

    public User(String id, String username, String email) {
        this.id = id;
        this.username = username;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + email + '\'' +
                '}';
    }
}
