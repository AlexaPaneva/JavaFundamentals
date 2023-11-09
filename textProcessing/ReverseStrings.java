package javaFundamentals.textProcessing;

import java.util.Scanner;

public class ReverseStrings {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        while (!text.equals("end")) {
            String reversedText = "";
            for (int i = text.length() - 1; i >= 0 ; i--) {
                char symbol = text.charAt(i);

                reversedText += symbol;
            }
            System.out.println(String.join("", text, " = ", reversedText));
 //           System.out.println(text + " = " + reversedText);
 //           System.out.printf("%s = %s%n", text, reversedText);
            text = scanner.nextLine();
        }
    }
}
