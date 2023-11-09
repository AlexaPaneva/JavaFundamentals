package javaFundamentals.methods;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double grades = Double.parseDouble(scanner.nextLine());

        printGrades(grades);
    }

    public static void printGrades(double grades) {
        String gradeName = "Fail";

        if (grades >= 3.00 && grades <= 3.49) {
            gradeName = "Poor";
        } else if (grades >= 3.50 && grades <= 4.49) {
            gradeName = "Good";
        } else if (grades >= 4.50 && grades <= 5.49) {
            gradeName = "Very good";
        } else if (grades >= 5.50 && grades <= 6.00) {
            gradeName = "Excellent";
        }
        System.out.println(gradeName);
    }
}
