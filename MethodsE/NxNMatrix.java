package JavaFundamentals.MethodsE;

import java.util.Scanner;

public class NxNMatrix {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        printNxN(number);

    }
    public static void printNxN (int number) {
        for (int rows = 1; rows <= number  ; rows++) {
            for (int cols = 1; cols <= number; cols++) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
