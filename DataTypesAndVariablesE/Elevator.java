package javaFundamentals.dataTypesAndVariablesE;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int p = Integer.parseInt(scanner.nextLine());

        double courses = (int) Math.ceil((double) n / p);

        System.out.printf("%.0f", courses);

        }

    }
