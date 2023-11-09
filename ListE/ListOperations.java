package javaFundamentals.listE;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String[] commandParts = command.split(" ");
            String commandName = commandParts[0];

            switch (commandName) {
                case "Add":
                    int numberToAdd = Integer.parseInt(commandParts[1]);
                    numbersList.add(numberToAdd);
                    break;

                case "Insert":
                    int numberForInsert = Integer.parseInt(commandParts[1]);
                    int indexForInsert = Integer.parseInt(commandParts[2]);

                    if (isValidIndex(indexForInsert, numbersList.size())) {
                        numbersList.add(indexForInsert, numberForInsert);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;

                case "Remove":
                    int indexToRemove = Integer.parseInt(commandParts[1]);
                    if (isValidIndex(indexToRemove, numbersList.size())) {
                        numbersList.remove(indexToRemove);
                        //remove index -> numbers.remove((int) index);
                        //remove element -> numbers.remove(Integer.valueOf(number));
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;

                case "Shift":
                    String direction = commandParts[1];
                    int count = Integer.parseInt(commandParts[2]);

                    if (direction.equals("left")) {
                        for (int i = 1; i <= count; i++) {
                            int firstElement = numbersList.get(0);
                            numbersList.remove(0);
                            numbersList.add(firstElement);
                        }

                    } else if (direction.equals("right")) {
                        for (int i = 1; i <= count; i++) {
                            int lastElement = numbersList.get(numbersList.size() - 1);
                            numbersList.remove(numbersList.size() - 1);
                            numbersList.add(0, lastElement);
                        }
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        for (int number : numbersList) {
            System.out.print(number + " ");
        }
//        System.out.println(numbersList
//                .toString()
//                .replaceAll("[\\[\\],]", " "));

    }

    //метод, който проверява дали даден индекс е валиден
    //true -> ако индексът е валиден
    //false -> ако индексът не е валиден
    public static boolean isValidIndex(int index, int size) {
        return index >= 0 && index <= size - 1;
    }
}