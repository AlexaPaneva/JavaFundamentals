package JavaFundamentals.MethodsE;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        printMiddleSymbol(text);
    }

    public static void printMiddleSymbol(String text) {
        int length = text.length();
        if (length % 2 != 0) {
            int indexOfMiddleSymbol = length / 2;
            System.out.println(text.charAt(indexOfMiddleSymbol));
        } else {
            int indexOfFirstSymbol = length/ 2 - 1;
            int indexOfSecondSymbol =length / 2;
            System.out.print(text.charAt(indexOfFirstSymbol));
            System.out.print(text.charAt(indexOfSecondSymbol));
        }
    }
}
