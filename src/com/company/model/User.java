package com.company.model;

public class User {
    private int id;
    private String name;
    private int age;
    private  Gender gender;

    public User(int id, String name, int age, Gender gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getId(int i) {
        return id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
