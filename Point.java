package com.company;

public class Point {
    private double x;
    private double y;


    public Point(double x, double y) {
        this.y = y;
        this.x = x;
    }
    public double getx(){
        return this.x;
    }
    public double gety(){
        return this.y;
    }
    public void setx(double x){
        this.x=x;
    }
    public void sety(double y){
        this.y=y;
    }
    public String toString(){
        return "("+x+","+y+")";
    }

}