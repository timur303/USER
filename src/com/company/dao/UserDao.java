package com.company.dao;

import com.company.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserDao {
        private final List<User> users = new ArrayList<>();

    public List<User> getUsers() {
        return users;
    }

    @Override
    public String toString() {
        return "UserDao{" +
                "users=" + users +
                '}';
    }
}
