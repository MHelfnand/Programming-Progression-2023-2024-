package com.company;

public class Subject {
    private String name;
    private int point;
    private int grade;

    public Subject(String name, int point, int grade) {
        this.name = name;
        this.point = point;
        this.grade = grade;
    }



    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String toString() {
        return "Subject{" +
                "name='" + name + '\'' +
                ", point=" + point +
                ", grade=" + grade +
                '}';
    }










}
