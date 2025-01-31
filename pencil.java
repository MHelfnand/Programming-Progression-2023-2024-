package com.company;

public class pencil {
    private int length;
    private boolean sharpened;

    public pencil(int length, boolean sharpened) {
        this.length = length;
        this.sharpened = sharpened;
    }
    public boolean Islonger(pencil other){
        return this.length==other.length;
    }
}
