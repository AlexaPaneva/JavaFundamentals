package javaFundamentals.textProcessingE;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        String firstText = input[0];
        String secondText = input[1];

        int minLength = Math.min(firstText.length(), secondText.length()); //дължина на по-късия текст -> 5
        int maxLength = Math.max(firstText.length(), secondText.length()); //дължина на по-дългия текст -> 6

        int sum = 0;
        for (int index = 0; index < minLength; index++) {
            sum += (firstText.charAt(index) * secondText.charAt(index));
        }
        if (maxLength == minLength) {
            System.out.println(sum);
            return;
        }

        sum = getLeftSymbols(firstText, secondText, minLength, maxLength, sum);

        System.out.println(sum);

    }

    private static int getLeftSymbols(String firstText, String secondText, int minLength, int maxLength, int sum) {
        if (maxLength == firstText.length()) {
            //първия текст ми е по-дълъг -> взимам останалите символи
            for (int index = minLength; index < firstText.length(); index++) {
                sum += firstText.charAt(index);
            }
        } else {
            //втория текст ми е по-дълъг -> взимам останали символи
            for (int index = minLength; index < secondText.length(); index++) {
                sum += secondText.charAt(index);
            }
        }
        return sum;
    }

}
