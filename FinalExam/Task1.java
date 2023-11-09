package javaFundamentals.finalExam;

import java.util.Scanner;


public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String decryptingMessage = scanner.nextLine();

        String command = scanner.nextLine();
        while (!command.equals("Finish")) {
            String[] commandParts = command.split("\\s+");
            String commandName = commandParts[0];
            switch (commandName) {
                case "Replace":
                    String currentWord = commandParts[1];
                    String newWord = commandParts[2];

                    decryptingMessage = decryptingMessage.replace(currentWord, newWord);
                    System.out.println(decryptingMessage);

                    break;

                case "Cut":

                    int startIndex = Integer.parseInt(commandParts[1]);
                    int endIndex = Integer.parseInt(commandParts[2]);

                    if (startIndex >= 0 && endIndex < decryptingMessage.length()) {
                        decryptingMessage = decryptingMessage.substring(0, startIndex) + decryptingMessage.substring(endIndex + 1);
                        System.out.println(decryptingMessage);
                    } else {

                        System.out.println("Invalid indices!");
                    }

                    break;

                case "Make":

                    if (commandParts[1].contains("Upper")) {
                        decryptingMessage = decryptingMessage.toUpperCase();
                    } else if (commandParts[1].contains("Lowe")) {
                        decryptingMessage = decryptingMessage.toLowerCase();
                    }

                    System.out.println(decryptingMessage);

                    break;

                case "Check":

                    String message = commandParts[1];
                    if (decryptingMessage.contains(message)) {
                        System.out.printf("Message contains %s", message);
                    } else {
                        System.out.printf("Message doesn't contain %s%n", message);
                    }

                    break;

                case "Sum":

                    int firstIndex = Integer.parseInt(commandParts[1]);
                    int secondIndex = Integer.parseInt(commandParts[2]);

                    if (firstIndex >= 0 && secondIndex < decryptingMessage.length()) {
                        int sum = 0;
                        for (int i = firstIndex; i <= secondIndex; i++) {
                            sum += decryptingMessage.charAt(i);
                        }
                        System.out.println(sum);
                    } else {
                        System.out.println("Invalid indices!");
                    }

                    break;
            }


            command = scanner.nextLine();
        }
    }
}
