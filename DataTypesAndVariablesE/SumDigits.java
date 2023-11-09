package javaFundamentals.dataTypesAndVariablesE;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

       int sum = 0;

       while (number > 0) {
           int lastDigit = number % 10;
           sum+=lastDigit;
           number /= 10;
       }
        System.out.println(sum);

//        int number = Integer.parseInt(scanner.nextLine());
//        int sum = 0;
//
//        String numberAsString = " " + number;
//        for (int possition = 0; possition <= numberAsString.length() - 1; possition++) {
//            char currentSymbol = scanner.nextLine().charAt(possition);
//            int currentDigit = Integer.parseInt(currentSymbol + " ");
//
//            sum += currentDigit;
//            System.out.println(sum);

//        }
    }
}


