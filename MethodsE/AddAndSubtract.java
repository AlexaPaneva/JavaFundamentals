package JavaFundamentals.MethodsE;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        System.out.println(finalSum(firstNumber, secondNumber, thirdNumber));
    }
    public static int finalSum (int firstNumber, int secondNumber, int thirdNumber) {
        return (firstNumber + secondNumber) - thirdNumber;
    }
//    public static int subtract (int firstNumber, int secondNumber, int thirdNumber) {
//        return sum(firstNumber, secondNumber) - thirdNumber;
//    }
}
