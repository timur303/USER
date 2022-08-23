package com.company.servise;

import com.company.model.User;

import java.util.List;

public interface UserService {

    List<User> geAll();
    void addUser(User user);
    User getById(int id);
    User removeUser(int id);



}
