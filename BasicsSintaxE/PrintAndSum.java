package javaFundamentals.basicsSintaxE;

import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        boolean isValid = true;

        for (int i = n1; i <= n2 ; i++) {
            if (isValid) {
                System.out.print(i + " ");
                sum += i ;
            }
        }
        System.out.println();
        System.out.println("Sum: " + sum);
    }
}
