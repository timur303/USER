package com.company.impl;

import com.company.MyException.MyException;
import com.company.dao.UserDao;
import com.company.model.User;
import com.company.servise.UserService;

import java.util.Iterator;
import java.util.List;

public class UserServiceImpl implements UserService {
    private final UserDao userDaos = new UserDao();

    @Override
    public List<User> geAll() {
        return userDaos.getUsers();
    }

    @Override
    public void addUser(User user) {
        List<User> users = userDaos.getUsers();
        users.add(user);
    }

    @Override
    public User getById(int id) {

        return userDaos.getUsers()
                .stream().filter(user -> user.getId(id) == id)
                .findFirst().orElseThrow(() -> new MyException("Not by id"));
    }


    @Override
    public User removeUser(int id) {
        Iterator<User> iterator = userDaos.getUsers().iterator();
        while (iterator.hasNext()){
            User user = iterator.next();
            if(user.getId(id) == id){
                iterator.remove();
            }return user;
        }return removeUser(id);
    }

    @Override
    public String toString() {
        return "UserServiceImpl{" +
                "userDaos=" + userDaos +
                '}';
    }
}
