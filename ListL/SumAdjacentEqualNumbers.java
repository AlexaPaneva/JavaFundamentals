package JavaFundamentals.ListL;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Double> numberList = Arrays
                .stream(input.split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        for (int i = 0; i < numberList.size() - 1; i++) {
            double currentNumber = numberList.get(i);
            double nextNumber = numberList.get(i + 1);

            if (currentNumber == nextNumber) {
                double sum = currentNumber + nextNumber;

                numberList.set(i, sum);
                numberList.remove(i + 1);
                i = -1;
            }
        }
        System.out.println(jointsElementsByDelimiter(" ", numberList));
    }

    public static String jointsElementsByDelimiter(String delimiter, List<Double> list) {
        DecimalFormat fd = new DecimalFormat("0.#");

        String result = "";
        for (double item : list) {
            String numDf = fd.format(item) + delimiter;
            result += numDf;
        }
        return result;

    }
}
