package JavaFundamentals.ArraysE;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [] number = Arrays.stream(scanner.nextLine()
                .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int index = 0; index <= number.length - 1; index++) {
            int currentNumber = number[index];

            int leftSum = 0;
            int rightSum = 0;

            for (int leftIndex = 0; leftIndex < index; leftIndex++) {
                leftSum += number[leftIndex];
            }

            for (int rightIndex = index + 1; rightIndex <= number.length - 1 ; rightIndex++) {
                rightSum += number[rightIndex];
            }

            if (leftSum == rightSum) {
                System.out.println(index);
                return;
            }

        }
        System.out.println("no");
    }
}
