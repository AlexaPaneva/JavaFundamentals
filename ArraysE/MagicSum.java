package javaFundamentals.arraysE;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] rowOfNumbers = Arrays.stream(scanner.nextLine()
                .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int magicNumber = Integer.parseInt(scanner.nextLine());

        for (int index = 0; index < rowOfNumbers.length - 1 ; index++) {
            int currentsNumber = rowOfNumbers[index];
            for (int i = index + 1; i <= rowOfNumbers.length - 1 ; i++) {
                int nextNumber = rowOfNumbers[i];
                if (currentsNumber + nextNumber == magicNumber) {
                    System.out.println(currentsNumber + " " + nextNumber);
                }
            }
        }
    }
}
