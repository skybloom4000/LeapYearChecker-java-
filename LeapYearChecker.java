package java_methods;

import java.util.Scanner;

public class LeapYearChecker {
    
    public static void checkLeapYear() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        if (isLeapYear) {
            System.out.println("The year you entered is a leap year.");
        } else {
            System.out.println("The year you entered is not a leap year.");
        }
        
        scanner.close();
    }

    public static void main(String[] args) {
        checkLeapYear();
    }
}
