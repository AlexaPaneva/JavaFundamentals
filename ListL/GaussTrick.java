package JavaFundamentals.ListL;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Integer> numberList = Arrays
                .stream(input.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int size = numberList.size();
        for (int i = 0; i < size / 2; i++) {
            int firstNum = numberList.get(i);
            int secondNum = numberList.get(numberList.size() - 1);

            int sum = firstNum + secondNum;
            numberList.set(i, sum);
            numberList.remove(numberList.size() - 1);
        }

        for (int item : numberList) {
            System.out.print(item + " ");
        }
    }
}
