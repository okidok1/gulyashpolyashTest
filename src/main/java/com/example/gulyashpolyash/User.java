package com.example.gulyashpolyash;

import org.hibernate.annotations.Table;
import org.springframework.aop.IntroductionAwareMethodMatcher;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(appliesTo = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String pass;
    private int accessLevel;
    public User() {

    }

    public User(long id, String name, String pass, int accessLevel) {
        this.id = id;
        this.name = name;
        this.pass = pass;
        this.accessLevel = accessLevel;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPass() {
        return pass;
    }

    public int getAccessLevel() {
        return accessLevel;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setAccessLevel(int accessLevel) {
        this.accessLevel = accessLevel;
    }

    public void addUser(int id, String name, String pass, int accessLevel){
        User user1 = new User();
        user1.id = id;
        user1.name = name;
        user1.pass = pass;
        user1.accessLevel = accessLevel;
    }
}
