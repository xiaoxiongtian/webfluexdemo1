package com.spring5.webfluexdemo1.entity;

public class User {
    private String name;
    private String xingbie;
    private int age;
    public User(){};
    public User(String name, String xingbie, int age) {
        this.name = name;
        this.xingbie = xingbie;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getXingbie() {
        return xingbie;
    }

    public void setXingbie(String xingbie) {
        this.xingbie = xingbie;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
