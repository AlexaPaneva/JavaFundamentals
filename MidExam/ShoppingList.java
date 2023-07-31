package JavaFundamentals.MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> productsList = Arrays.stream(scanner.nextLine()
                        .split("!"))
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("Go Shopping!")) {
            String[] commandParts = command.split(" ");
            String commandName = commandParts[0];
            String item = commandParts[1];
            //Urgent {item} - add the item at the start of the list. If the item already exists, skip this command.
            //• Unnecessary {item} - remove the item with the given name, only if it exists in the list. Otherwise skip
            //this command.
            //• Correct {oldItem} {newItem} – if the item with the given old name exists, change its name with the
            //new one. If it doesn't exist, skip this command.
            //• Rearrange {item} - if the grocery exists in the list, remove it from its current position and add it at the
            //end of the list

            switch (commandName) {
                case "Urgent":
                    if (!productsList.contains(item)) {
                        productsList.add(0, item);
                    }
                    break;

                case "Unnecessary":
                        productsList.remove(item);
                    break;

                case "Correct":
                    String newItem = commandParts[2];
                    int index = productsList.indexOf(item);
                    if (productsList.contains(item)) {
                        productsList.set(index, newItem);
                    }
                    break;

                case "Rearrange":
                    if (productsList.contains(item)) {
                        productsList.remove(item);
                        productsList.add(item);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println(String.join(", ",productsList ));
    }
}
