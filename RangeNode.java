package com.company;

public class RangeNode {


        private int  from;
    private int to;

    public RangeNode(int from, int to) {
        this.from = from;
        this.to = to;
    }

    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public int getTo() {
        return to;
    }

    public void setTo(int to) {
        this.to = to;
    }


    public String toString() {
        return "RangeNode{" +
                "from=" + from +
                ", to=" + to +
                '}';
    }
}
