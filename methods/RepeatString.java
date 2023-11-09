package javaFundamentals.methods;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int countOfRepeats = Integer.parseInt(scanner.nextLine());

        String resultText = repeatString(countOfRepeats, text);

        System.out.println(resultText);
    }

    public static String repeatString(int n, String textToRepeat) {
        String resultText = "";
        for (int i = 0; i < n; i++) {
            resultText += textToRepeat;
        }

        return resultText;
    }
}

