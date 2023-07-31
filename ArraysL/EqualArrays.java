package JavaFundamentals.ArraysL;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] firstArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int[] secondArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        //1 2 3 4 5
        //1 2 4 3 5
        int sum = 0;
        int diffIndex = -1;
        //boolean isIdentical = true;
        for (int i = 0; i < firstArr.length; i++) {
            int firstNum = firstArr[i];
            int secondNum = secondArr[i];

            if (firstNum == secondNum) {
                sum += firstNum;
            } else {
                diffIndex = i;
                //isIdentical = false;
                break;
            }
        }

        if (diffIndex == -1) {
            System.out.printf("Arrays are identical. Sum: %d%n", sum);
        } else {
            System.out.printf("Arrays are not identical. Found difference at %d index.", diffIndex);
        }
    }
}
