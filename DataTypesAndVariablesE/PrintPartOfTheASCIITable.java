package JavaFundamentals.DataTypesAndVariablesE;

import java.util.Scanner;

public class PrintPartOfTheASCIITable {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int last = Integer.parseInt(scanner.nextLine());

        for (int i = first; i <= last ; i++) {
            System.out.print((char) i + " ");
        }

    }
}
