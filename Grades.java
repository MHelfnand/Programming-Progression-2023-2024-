package com.company;

       	import java.util.Scanner;
		public class Grades
		{
            	static int highNum,highGrade;
        	public static void main(String[] args)
        {
        	  Scanner input=new Scanner(System.in);
        	  int num,grade;
          System.out.println("enter num");
        	  highNum=input.nextInt();
        	  System.out.println("rnter grade");
        	  highGrade=input.nextInt();
        	  for(int i=2; i<11; i++)
        	  {
        	    System.out.println("enter num");
        	    num=input.nextInt();
        	    System.out.println("enter grade");
        	    grade=input.nextInt();
        	    high(num,grade);
        	  }
        	  System.out.println(highNum +"got the highest grade");
        	 }
        	 public static void high(int num , int grade)
        	 {
        	   if(grade>highGrade)
        	   {
        	     highGrade=grade;
        	     highNum=num;
        	    }
        	  }
        	}