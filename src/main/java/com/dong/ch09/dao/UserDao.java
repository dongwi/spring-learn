package com.dong.ch09.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    private int id;
    private String name;

    public UserDao() {
    }

    public UserDao(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserDao{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
