package javaFundamentals.midExam;

import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] travelRouteArr = scanner.nextLine().split("\\|\\|");
        // List<String> travelRouteList = Arrays.stream(scanner.nextLine()
        //                        .split("||"))
        //                .collect(Collectors.toList());
        // fuel - гориво
        int fuel = Integer.parseInt(scanner.nextLine());
        int ammunition = Integer.parseInt(scanner.nextLine());
        int index = 0;


        for (int i = 0; i < travelRouteArr.length; i++) {


            String command = travelRouteArr[i];
            String[] commandParts = command.split(" ");
            String commandName = commandParts[0];

            switch (commandName) {
                case "Travel":
                    int lightYears = Integer.parseInt(commandParts[1]);
                    if (fuel >= lightYears) {
                        fuel -= lightYears;
                        System.out.printf("The spaceship travelled %d light-years.%n", lightYears);
                    } else {
//                        fuel < lightYears
                        System.out.println("Mission failed.");
                        return;
                    }

                    break;

                case "Enemy":
                    int armour = Integer.parseInt(commandParts[1]);
                    if (ammunition >= armour) {
                        ammunition -= armour;
                        System.out.printf("An enemy with %d armour is defeated.%n", armour);
                    } else if (fuel >= 2 * armour) {
                        fuel -= 2 * armour;
                        System.out.printf("An enemy with %d armour is outmaneuvered.%n", armour);
                    } else {
                        System.out.println("Mission failed.");
                        return;
                    }
                    break;

                case "Repair":
                    int addedAmmunition = Integer.parseInt(commandParts[1]);
                    int addedFuel = Integer.parseInt(commandParts[1]);
                    ammunition += (2 * addedAmmunition);
                    fuel += addedFuel;
                    System.out.printf("Ammunitions added: %d.%n", (2 * addedAmmunition));
                    System.out.printf("Fuel added: %d.%n", addedFuel);
                    break;

                case "Titan":
                    System.out.println("You have reached Titan, all passengers are safe.");
                    return;

            }
        }

    }
}
