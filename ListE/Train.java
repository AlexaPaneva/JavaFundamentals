package JavaFundamentals.ListE;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> wagonsList = Arrays.stream(scanner.nextLine()
                .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] commandParts = command.split(" ");

            if (commandParts[0].contains("Add")) {
                int passengers = Integer.parseInt(commandParts[1]);
                wagonsList.add(passengers);
            } else {
                int passengersToAdd = Integer.parseInt(commandParts[0]);
                for(int index = 0; index < wagonsList.size(); index++) {
                    int currentWagon = wagonsList.get(index);
                    if(currentWagon + passengersToAdd <= maxCapacity) {
                        wagonsList.set(index, currentWagon + passengersToAdd);
                        break;
                    }
                }
            }

            command = scanner.nextLine();
        }
        System.out.print(wagonsList
               .toString()
               .replaceAll("[\\[\\],]", ""));
    }
}
