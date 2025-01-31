package com.company;

public class Flashlight {
    private String model;
    private double price;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Flashlight(String model, double price){
        this.model=model;
        this.price=price;
    }
    public void ThreeFlashlight(Flashlight []arr,double total){
        System.out.println(findFlashlight(arr,total));
    }
    public String findFlashlight(Flashlight []arr,double total){
    for(int i=0;i<arr.length;i++){
        for(int k=i+1;k<arr.length;k++){
            for(int j =k+1;j<arr.length;j++){
                if(arr[i].getPrice()+arr[k].getPrice()+arr[j].getPrice()==total)
                    return (arr[i].getModel()+", "+arr[k].getModel()+", "+arr[j].getModel());
                }
            }
        }
    return null;
    }








}
