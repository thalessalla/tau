package chapter4;

import java.util.Scanner;

public class AddNumbers {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        boolean again = false;

        do{
            System.out.print("Enter the first number");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number");
            double num2 = scanner.nextDouble();

            double sum = num1 + num2;

            System.out.println(("The sum is " + sum));
            System.out.print("Would you to start over?");
            again = scanner.nextBoolean();

        } while(again);

        scanner.close();
    }

}
