package com.company;
import java.util.Scanner;
public class trip {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bus, room, num, cap1, cap2;
        System.out.println("how many students are coming on the trip?");
        num = input.nextInt();
        System.out.println("how many seats are on each of the buses?");
        cap1 = input.nextInt();
        System.out.println("how many beds are in each of the hotel rooms?");
        cap2 = input.nextInt();
        bus = numBus(num, cap1);
        room = numRoom(num, cap2);
        System.out.println("You will need "+bus+" buses and "+room+" rooms for the trip");




    }
    public static int numBus(int num,int cap1) {
        int order;
        if (num % cap1 == 0)
            order = num / cap1;

        else
            order = (num / cap1) + 1;

        return order;
    }
    public static int numRoom(int num,int cap2) {
        int order;
        if (num % cap2 ==0)
            order = num /cap2;
        else
            order = (num/cap2) +1;

        return order;



    }




}


