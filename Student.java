package com.company;

import java.util.Arrays;

public class Student {
    private String name;
    private int numSubject;
    private Subject [] arr;




    public Student(String name, int numSubject) {
        this.name = name;
        this.numSubject = 0;
        this.arr = new Subject[numSubject];
    }

    public void AddSubject(Subject other){
        if(numSubject<arr.length) {
            this.numSubject++;
            int i = 0;
            boolean G = true;
            while (i < arr.length && G){
                if (arr[i]==null) {
                    arr[i]=other;
                    G=false;
                }
                i++;
            }
        }
    }

    public double Avg(){
        double sum=0;
        double divider=0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i].getGrade()*arr[i].getPoint();
            divider += arr[i].getPoint();
        }
        return sum/divider;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", numSubject=" + numSubject +
                ", arr=" + Arrays.toString(arr) +
                '}';
    }










}
