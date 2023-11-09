package javaFundamentals.examPreparation;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String activationKey = scanner.nextLine();

        int startIndex = 0;
        int endIndex = 0;

        String input = scanner.nextLine();
        while (!input.equals("Generate")) {
            String[] tokens = input.split(">>>");
            String command = tokens[0];

            String substring = "";
            if (command.contains("Contains")) {
                substring = tokens[1];
                if (activationKey.contains(substring)) {
                    System.out.printf("%s contains %s%n", activationKey, substring);
                } else {
                    System.out.println("Substring not found!");
                }
            }

            if (command.contains("Flip")) {
                String upperOrLower = tokens[1];
                startIndex = Integer.parseInt(tokens[2]);
                endIndex = Integer.parseInt(tokens[3]);
                substring = activationKey.substring(startIndex, endIndex);
                if (upperOrLower.contains("Upper")) {
                    activationKey = activationKey.replace(substring, substring.toUpperCase());
                } else {
                    activationKey = activationKey.replace(substring, substring.toLowerCase());
                }
                System.out.println(activationKey);
            }

            if (command.contains("Slice")) {
                startIndex = Integer.parseInt(tokens[1]);
                endIndex = Integer.parseInt(tokens[2]);

                substring = activationKey.substring(startIndex, endIndex);
                activationKey = activationKey.replace(substring, "");

                System.out.println(activationKey);
            }


            input = scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s%n", activationKey);
    }
}
