package javaFundamentals.methodsE;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            System.out.println(isPalindrome(input));
            input = scanner.nextLine();
        }
    }

    public static boolean isPalindrome(String text) {

        String reversedText = "";

        for (int index = text.length() - 1; index >= 0; index--) {
            reversedText += text.charAt(index);
        }
        return text.equals(reversedText);
    }
}
