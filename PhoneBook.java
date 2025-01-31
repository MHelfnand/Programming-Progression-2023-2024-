package com.company;

public class PhoneBook {

   private Contacts [] arr;
   private int currentNumContacts;

   public PhoneBook(Contacts [] arr, int currentNumContacts){
       this.arr = new Contacts[100];
       this.currentNumContacts = currentNumContacts;
   }

   public void addContact(Contacts c){
       int i = 0;
       boolean N = true;

       while (i < arr.length|| N){
           if(arr[i]==null){
               arr[i]=c;
               N=false;
           }
           i++;
       }


   }
    public void delContact(String name){
       int n=0,i=0;
       while(i==0&&n<this.arr.length){
           if(name.equals(arr[n])){
               arr[n]=null;

           }


       }

    }










}
