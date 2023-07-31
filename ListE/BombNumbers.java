package JavaFundamentals.ListE;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> numbersList = Arrays.stream(scanner.nextLine()
                        .split("\\s+"))
                .collect(Collectors.toList());

        String[] data = scanner.nextLine().split("\\s+");
        String bombNumber = data[0];
        int power = Integer.parseInt(data[1]);
        int sum = 0;

        while (numbersList.contains(bombNumber)){
            int elementIndex = numbersList.indexOf(bombNumber);

            int left = Math.max(0, elementIndex - power);
            int right = Math.min( elementIndex + power, numbersList.size() - 1);

            for (int i = right; i >= left; i--) {
                numbersList.remove(i);

            }
        }
        System.out.println(numbersList.stream().mapToInt(Integer::parseInt).sum());
    }
}
