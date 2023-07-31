package JavaFundamentals.MethodsL;

import java.util.Scanner;

public class SignOfIntegerNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        printSign(number);
    }

    public static void printSign(int number) {
        String sign = "";
        if (number > 0) {
            sign = "positive";
        } else if (number < 0) {
            sign = "negative";
        } else {
            sign = "zero";
        }
        System.out.printf("The number %d is %s.", number, sign);
    }
}
