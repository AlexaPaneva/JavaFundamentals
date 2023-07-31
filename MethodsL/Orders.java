package JavaFundamentals.MethodsL;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

        System.out.printf("%.2f", totalSum(product, count));
    }

    public static double totalSum(String product, int count) {
        double price = 0;
        if (product.equals("coffee")) {
            price = 1.50;
            return price * count;
        } else if (product.equals("water")) {
            price = 1.00;
            return price * count;
        } else if (product.equals("coke")) {
            price = 1.40;
            return price * count;
        } else if (product.equals("snacks")) {
            price = 2.00;
            return price * count;
        }

        return price;
    }
}
