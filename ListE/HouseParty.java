package javaFundamentals.listE;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> guestsList = new ArrayList<>();

        int countCommands = Integer.parseInt(scanner.nextLine());
        for (int count = 1; count <= countCommands; count++) {

            String command = scanner.nextLine();

            String[] commandParts = command.split(" ");
            String name = commandParts[0];

            if (command.contains("not")) {
                if (guestsList.contains(name)) {
                    guestsList.remove(name);
                } else {
                    System.out.println(name + " is not in the list!");
                }
            } else {
                if (guestsList.contains(name)) {
                    System.out.println(name + " is already in the list!");
                } else {
                    guestsList.add(name);
                }
            }
        }
        for (String guestName : guestsList) {
            System.out.println(guestName);

        }
    }
}
