package javaFundamentals.listE;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> firstHandList = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondHandList = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (firstHandList.size() != 0 && secondHandList.size() != 0) {
            int firstHand = firstHandList.get(0);
            int secondHand = secondHandList.get(0);

            firstHandList.remove(0);
            secondHandList.remove(0);

            if (firstHand > secondHand) {
                firstHandList.add(firstHand);
                firstHandList.add(secondHand);
            } else if (secondHand > firstHand) {
                secondHandList.add(secondHand);
                secondHandList.add(firstHand);
            }
        }
        if (firstHandList.size() == 0) {
            System.out.printf("Second player wins! Sum: %d", getCardsSum(secondHandList));
        } else if (secondHandList.size() == 0) {
            System.out.printf("First player wins! Sum: %d", getCardsSum(firstHandList));
        }
    }

    private static int getCardsSum(List<Integer> listCards) {
        int sum = 0;
        for (int card : listCards) {
            sum += card;
        }

        return sum;
    }
}
