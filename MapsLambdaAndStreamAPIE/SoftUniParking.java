package javaFundamentals.mapsLambdaAndStreamAPIE;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countCommands = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, String> parkingDataMap = new LinkedHashMap<>();

        for (int count = 1; count <= countCommands; count++) {
            String command = scanner.nextLine();

            String[] commandParts = command.split(" ");
            String commandName = commandParts[0];
            String username = commandParts[1];

            switch (commandName) {
                case "register":
                    String carNumber = commandParts[2];
                    if (parkingDataMap.containsKey(username)) {
                        System.out.printf("ERROR: already registered with plate number %s%n", parkingDataMap.get(username));
                    } else {
                        parkingDataMap.put(username, carNumber);
                        System.out.printf("%s registered %s successfully%n", username, carNumber);
                    }
                    break;

                case "unregister":
                    if (parkingDataMap.containsKey(username)) {
                        parkingDataMap.remove(username);
                        System.out.printf("%s unregistered successfully%n", username);
                    } else {
                        System.out.printf("ERROR: user %s not found%n", username);
                    }
                    break;
            }
        }
        parkingDataMap.forEach((key, value) -> System.out.println(key + " => " + value));
         //трети начин
        // parkingDataMap.entrySet().forEach(entry -> System.out.println(entry.getKey() + " => " + entry.getValue()));
    }
}
