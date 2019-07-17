package com.frezer;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        System.out.println("Enter any number to be tested: ");
        Scanner scan = new Scanner(System.in);
        int number  = scan.nextInt();

       if (number >= 0 & number <= 10){
           System.out.println(number + " is under 10: ");
       }else if (number >= 11 & number <= 20  ) {
           System.out.println(number + " is between 11 to 20 ");
       }
       else {
           System.out.println(number + " is above 20 ");
       }
    }
}