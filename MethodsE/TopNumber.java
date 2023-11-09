package javaFundamentals.methodsE;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int number = 1; number <= n; number++) {
            if (isSumDivisibleBy8(number) && isDigitContainsOdd(number)) {
                System.out.println(number);
            }
        }
    }

    public static boolean isSumDivisibleBy8(int number) {
        int sum = 0;
        while (number > 0) {
            int lastNumber = number % 10;
            sum += lastNumber;
            number = number / 10;
        }
        return sum % 8 == 0; //може и с проверка!
        // if (sum % 8 == 0) {
        //return true;
        //   } else {
        //return false;
        //}
    }

    public static boolean isDigitContainsOdd(int number) {
        while (number > 0) {
            int lastNumber = number % 10;
            if (lastNumber % 2 != 0) {
                return true;
            } else {
                number = number / 10;
            }

        }
        return false;
    }
}

