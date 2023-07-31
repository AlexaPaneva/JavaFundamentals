package JavaFundamentals.ListL;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        List<Integer> numbersList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            //Add {number} – add a number to the end of the list
            //• Remove {number} – remove a number from the list
            //• RemoveAt {index} – remove a number at a given index
            //• Insert {number} {index} –

            String[] commandArr = input.split(" ");
            String command = commandArr[0];

            if (command.equals("Add")) {
                int numToAdd = Integer.parseInt(commandArr[1]);
                numbersList.add(numToAdd);
            }
            if (command.equals("Remove")) {
                int numToRemove = Integer.parseInt(commandArr[1]);
                numbersList.remove(Integer.valueOf(numToRemove));
            }
            if (command.equals("RemoveAt")) {
                int indexToRemoveAt = Integer.parseInt(commandArr[1]);
                numbersList.remove(indexToRemoveAt);
            }
            if (command.equals("Insert")) {
                int numToInsert = Integer.parseInt(commandArr[1]);
                int insertIndex = Integer.parseInt(commandArr[2]);

                numbersList.add(insertIndex, numToInsert);
            }

            input = scanner.nextLine();
        }
        System.out.println(numbersList.toString().replaceAll("[\\[\\],]", ""));
    }
}
