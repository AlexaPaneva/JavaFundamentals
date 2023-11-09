package javaFundamentals.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        // int[] numbersArr = new int[scanner.nextLine().split(" ").length]; така може да се напишат първите два реда

//        String[] inputArr = input.split(" ");
//        int [] numbersArr = new int[inputArr.length];
//        for (int i = 0; i < numbersArr.length; i++) {
//            numbersArr[i] = Integer.parseInt(inputArr[i]);
        //}

        //краткото на горните редове
        int[] numbersArr = Arrays.stream(input.split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

       int sum = 0;
        for (int i = 0; i < numbersArr.length; i++) {
            int currentNumber = numbersArr[i];
            if (currentNumber % 2 == 0 ) {
                sum += currentNumber;
            }
        }
        System.out.println(sum);
    }
}

