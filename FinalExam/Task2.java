package javaFundamentals.finalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String regex = "!(?<command>[A-Z][a-z]{2,})!:\\[(?<letter>[A-Za-z]{8,})\\]";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 0; i < n ; i++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String command = matcher.group("command");
                String letter = matcher.group("letter");

              StringBuilder translate = new StringBuilder();
                for (char symbol : letter.toCharArray()) {
                    translate.append((int) symbol).append(" ");
                }
                System.out.printf("%s: %s%n", command, translate.toString());
            } else {
                System.out.println("The message is invalid");
            }
        }
    }
}
