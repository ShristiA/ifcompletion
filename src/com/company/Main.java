package com.company;
import java.util. Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner src = new Scanner(System.in);
                //creating object src from class 'Scanner.'
        int num1 , num2 ;
        int sum ;
        int product;
        int average;
              // initializing variables

        System.out.print("Enter your first number");
        num1 = src.nextInt();
        System.out.print("Enter your second number");
        num2 = src.nextInt();
        // asking and storing the numbers in num1 and num2

        sum = num1 + num2;
        product = num1 * num2;
        average = sum / 2 ;
        //inserting the formulas.
        System.out.println(" Average = " + average);
        System.out.println(" Product = " + product);

        if(sum <1000 ) {
            System.out.println("this sum " + sum + "~");
            }else if(sum>200){
            System.out.println("this sum " + sum  +  "*" );
        }


    }
}
