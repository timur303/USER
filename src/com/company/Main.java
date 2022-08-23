package com.company;

import com.company.impl.UserServiceImpl;
import com.company.model.Gender;
import com.company.model.User;

import java.util.Scanner;
;

public class Main {
    public static void main(String[] args) {


        User user1 = new User(1, "Eshmat", 20, Gender.MAIL);
        User user2 = new User(2, "Tashmat", 28,Gender.MAIL);
        User user3 = new User(3, "Talgat", 22,Gender.MAIL);


      try {
          UserServiceImpl userService = new UserServiceImpl();
          userService.addUser(user1);
          userService.addUser(user2);
          userService.addUser(user3);


          System.out.println(" 'Call by id' "+userService.getById(10));
          System.out.println(""+userService.geAll());
          System.out.println("'removed users ' " +userService.removeUser(1));
          System.out.println(""+userService.geAll());
      }catch (RuntimeException e){
          System.out.println(e.getMessage());
      }
    }
}
