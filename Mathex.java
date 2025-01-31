package com.company;

import java.util.Scanner;

public class Mathex {

    static int n1, n2;

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        boolean answer = true;

        while (answer) {

            ten_exe();

            System.out.println("do you want more exercises? type true or false");

            answer = input.nextBoolean();

        }

        System.out.println("bye bye");

    }

    public static void ten_exe() {

        int result, i, operation;
        boolean N;
        System.out.println("do you want specific questions? false,true");
        N=input.nextBoolean();
        if(N) {
            operation = choose1();
            for (i = 1; i <= 10; i++) {

                result = calculate(operation);

                one_exe(result, operation);

            }
        }
        else
            for (i = 1; i <= 10; i++) {


                operation = choose();

                result = calculate(operation);

                one_exe(result, operation);

            }

    }

    public static int choose() {

        int operation;

        System.out.println("choose operation 1- for + , 2 -for - , 3 -for *");

        operation = input.nextInt();

        while (operation != 1 && operation != 2 && operation != 3) {

            System.out.println("choose operation 1- for + , 2 -for - , 3 -for *");

            operation = input.nextInt();

        }

        return operation;

    }
    public static int choose1(){
        int operation;

        System.out.println("choose operation 1- for + , 2 -for - , 3 -for *");

        operation = input.nextInt();

        while (operation != 1 && operation != 2 && operation != 3) {

            System.out.println("choose operation 1- for + , 2 -for - , 3 -for *");

            operation = input.nextInt();

        }

        return operation;
    }
    public static int calculate(int operation) {

        int result;


        n1 = (int) (Math.random() * 10);

        n2 = (int) (Math.random() * 10);

        while (n2>n1){
            n1 = (int) (Math.random() * 10);

            n2 = (int) (Math.random() * 10);

        }

        if (operation == 1)

            result = n1 + n2;

        else if (operation == 2)

            result = n1 - n2;

        else

            result = n1 * n2;

        return result;

    }


    public static void one_exe(int result, int operation) {

        int answer;

        char op;

        if (operation == 1)

            op = '+';

        else if (operation == 2)

            op = '-';

        else

            op = '*';

        System.out.println("" + n1 + op + n2 + "=?");

        answer = input.nextInt();

        if (answer == result) {

            System.out.println("excellent");
        }else {

            System.out.println("wrong");
            System.out.println("try again");
            answer = input.nextInt();
            if (answer == result) {

                System.out.println("excellent");
            } else
                System.out.println("wrong");

        }
    }

}