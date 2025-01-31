package com.company;

public class Birth_Object {
    private double day;
    private double month;
    private double year;
    public Birth_Object(double day,double month,double year){
        this.day=day;
        this.month=month;
        this.year=year;
    }
    public double getDay() {
        return day;
    }

    public void setDay(double day) {
        this.day = day;
    }

    public double getMonth() {
        return month;
    }

    public void setMonth(double month) {
        this.month = month;
    }
    public double getYear() {
        return year;
    }

    public void setYear(double year) {
        this.year = year;
    }
}
