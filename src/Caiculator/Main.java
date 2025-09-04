package Caiculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("===========================================");
        System.out.println("        ...Simple Calculator...         ");
        System.out.println("==========================================="+"\n");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = input.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = input.nextInt();

        System.out.print("Enter the operator +,-,*,/,%: ");
        char operator = input.next().charAt(0);

        int sum = 0;

        switch (operator) {

            // Addition
            case '+'->{
                sum = firstNumber + secondNumber;
                System.out.println(firstNumber + " + " +secondNumber + " = " + sum);
            }

            //Substraction
            case  '-'->{
                sum = firstNumber - secondNumber;
                System.out.println(firstNumber + " - " +secondNumber + " = " + sum);
            }

            //Multiple
            case  '*'->{
                sum = firstNumber * secondNumber;
                System.out.println(firstNumber + " * " +secondNumber + " = " + sum);
            }

            //Divition
            case  '/'->{
                if(secondNumber != 0){
                    System.out.println(firstNumber + " / " +secondNumber + " = " + firstNumber / (double)secondNumber);
                }else {
                    System.out.println("cannot divide by zero");
                }
            }
            //Modulas
            case  '%'->{
                sum = firstNumber % secondNumber;
                System.out.println(firstNumber + " % " +secondNumber + " = " + sum);
            }
            default ->{
                    System.out.println("Invalid input");
            }
        }
    }
}
