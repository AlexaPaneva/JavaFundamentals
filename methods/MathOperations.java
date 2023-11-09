package javaFundamentals.methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int secondNumber = Integer.parseInt(scanner.nextLine());

        DecimalFormat df = new DecimalFormat("0.##");

        double result = mathOperations(operator, firstNumber, secondNumber);

        System.out.println(df.format(result));

    }
    public static double mathOperations(String operator, int firstNumber, int secondNumber){
        double result = 0;
        switch (operator) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                result = firstNumber * 1.0 / secondNumber;
                break;
        }
        return result;
    }
}
