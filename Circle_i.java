package com.company;

import static java.lang.StrictMath.PI;

public class Circle_i implements interface1{
    protected Point center;
    protected double radius;

    public Circle_i(Point center, int radius) {

        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getradius() {
        return radius;
    }

    public void setradius(int radius) {
        this.radius = radius;
    }


    public String Shape() {
        return "the BAAAAAALL";
    }

    public double Area() {
        return PI*Math.pow(this.radius,2);
    }

    public double Pri() {
        return PI*2*this.radius;
    }
}
