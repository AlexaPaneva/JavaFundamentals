package JavaFundamentals.ArraysE;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String command = scanner.nextLine();
        while (!command.equals("end")) {

            if (command.contains("swap")) {

                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);

                int firstIndexNumber = numbers[index1];
                int secondIndexNumber = numbers[index2];

                numbers[index1] = secondIndexNumber;
                numbers[index2] = firstIndexNumber;

            } else if (command.contains("multiply")) {

                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);

                int firstIndexNumber = numbers[index1];
                int secondIndexNumber = numbers[index2];

                int product = firstIndexNumber * secondIndexNumber;

                numbers[index1] = product;

            } else if (command.contains("decrease")) {
                for (int index = 0; index <= numbers.length - 1; index++) {
                    numbers[index]--;
//                    numbers[index] -= 1;

                }
            }

            command = scanner.nextLine();
        }

        System.out.println(Arrays.toString(numbers)
                .replace("[", " ")
                .replace("]", " "));
    }
}
