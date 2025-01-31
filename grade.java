package com.company;

        import java.util.Scanner;
public class grade {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int psycho;
        System.out.println("enter psychometric grade");
        psycho = input.nextInt();
        if (psycho > 730)
            System.out.println("accepted");
        else
        if (psycho > 600)
            System.out.println("accepted on condition");
        else
            System.out.println("Not accepted");
    }
}