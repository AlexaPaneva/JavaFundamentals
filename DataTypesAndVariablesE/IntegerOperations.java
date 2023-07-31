package JavaFundamentals.DataTypesAndVariablesE;

import java.util.Scanner;


public class IntegerOperations {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {



        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());
        int fourthNumber = Integer.parseInt(scanner.nextLine());

        int firstSum = firstNumber + secondNumber;
        int secondSum = firstSum / thirdNumber;
        int result = secondSum * fourthNumber;

        System.out.println(result);
    }
}
