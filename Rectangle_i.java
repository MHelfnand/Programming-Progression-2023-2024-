package com.company;

public class Rectangle_i implements interface1{
    private int width;
    private int length;


    public Rectangle_i(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String Shape() {
        return "my big box";
    }

    public double Area(){
        return this.width*this.length;
    }


    public double Pri() {
        return 0;
    }

    public int Perimeter(){
        return 2*(this.width+this.length);
    }

}
