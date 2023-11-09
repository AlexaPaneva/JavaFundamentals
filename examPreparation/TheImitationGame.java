package javaFundamentals.examPreparation;

import java.util.Scanner;

public class TheImitationGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String encryptedMessage = scanner.nextLine();
        StringBuilder modifyMessage = new StringBuilder(encryptedMessage);

        String command = scanner.nextLine();
        while (!command.equals("Decode")) {
            String[] commandParts = command.split("\\|");
            String commandName = commandParts[0];

            switch (commandName) {

                case "Move":
                    int countLetters = Integer.parseInt(commandParts[1]);

                    String firstLetters = modifyMessage.substring(0, countLetters);

                    modifyMessage.delete(0, countLetters);
                    modifyMessage.append(firstLetters);

                    break;

                case "Insert":
                    int index = Integer.parseInt(commandParts[1]);
                    String textToInsert = commandParts[2];
                    modifyMessage.insert(index, textToInsert);
                    break;

                case "ChangeAll":
                    String textForChange = commandParts[1];
                    String replacement = commandParts[2];

                    String currentMessage = modifyMessage.toString();
                    currentMessage = currentMessage.replace(textForChange, replacement);

                    modifyMessage =new StringBuilder(currentMessage);
                    break;
            }


            command = scanner.nextLine();
        }
        System.out.printf("The decrypted message is: %s", modifyMessage);
    }
}
