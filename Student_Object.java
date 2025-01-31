package com.company;

public class Student_Object {

    private Birth_Object birthday;
    private String name;

    public Student_Object(Birth_Object birthday,String name) {
        this.birthday = birthday;
        this.name = name;
    }


    public Birth_Object getBirthday() {
        return birthday;
    }

    public void setBirthday(Birth_Object birthday) {
        this.birthday = birthday;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
