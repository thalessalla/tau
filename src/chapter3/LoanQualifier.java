package chapter3;

import java.util.Scanner;

public class LoanQualifier {


    public static void main(String args[]){

        int requiredSalary = 3000;
        int requiredYearsEmployed = 2;

    System.out.println("Enter you salary:");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter the number of years with your current employer");
        double years = scanner.nextDouble();

        scanner.close();

        if(salary >= requiredSalary){
            if(years >= requiredYearsEmployed){
                System.out.println("Congrats! You qualify for the loan");
            }
        }

    }
}
