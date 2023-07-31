package JavaFundamentals.ArraysE;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String firstRow = scanner.nextLine();
        String secondRow = scanner.nextLine();

        String[] firstArr = firstRow.split(" ");
        String[] secondArr = secondRow.split(" ");

        for (String el2 : secondArr) {
            for (String el1 : firstArr) {
                if (el2.equals(el1)) {
                    System.out.print(el1 + " ");
                }
            }
        }
    }
}
