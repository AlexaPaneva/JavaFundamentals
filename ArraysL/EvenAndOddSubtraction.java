package JavaFundamentals.ArraysL;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int[] numbersArr = Arrays.stream(input.split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < numbersArr.length; i++) {
            int currentNumber = numbersArr[i];
            if (currentNumber % 2 == 0 ) {
                sumEven += currentNumber;
            } else {
                sumOdd += currentNumber;
            }
        }
        int sum = sumEven - sumOdd;
        System.out.println(sum);        // System.out.println(sumEven - sumOdd);
    }
}
