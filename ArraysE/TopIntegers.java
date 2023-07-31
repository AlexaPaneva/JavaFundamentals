package JavaFundamentals.ArraysE;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int index = 0; index < numbers.length; index++) {
            int currentsNumber = numbers[index];
            boolean isBigger = true;
            for (int i = index + 1; i < numbers.length; i++) {
                int numberAfter = numbers[i];
                if (currentsNumber <= numberAfter) {
                    isBigger = false;
                    break;
                }

            }
            if (isBigger) {
                System.out.print(currentsNumber + " ");
            }
        }
    }
}
