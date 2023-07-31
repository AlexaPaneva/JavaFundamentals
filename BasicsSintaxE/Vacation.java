package JavaFundamentals.BasicsSintaxE;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countOfThePeople = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String day = scanner.nextLine();

        double price = 0;

        if (typeOfGroup.equals("Students")) {
            if (day.equals("Friday")) {
                price = 8.45;
            } else if (day.equals("Saturday")) {
                price = 9.80;
            } else if (day.equals("Sunday")) {
                price = 10.46;
            }
            if (countOfThePeople >= 30) {
                price = price * 0.85;
            }
        }

        if (typeOfGroup.equals("Business")) {
            if (day.equals("Friday")) {
                price = 10.90;
            } else if (day.equals("Saturday")) {
                price = 15.60;
            } else if (day.equals("Sunday")) {
                price = 16.00;
            }
            if (countOfThePeople >= 100) {
                countOfThePeople -= 10;
            }
        }

        if (typeOfGroup.equals("Regular")) {
            if (day.equals("Friday")) {
                price = 15;
            } else if (day.equals("Saturday")) {
                price = 20;
            } else if (day.equals("Sunday")) {
                price = 22.50;
            }
            if (countOfThePeople >= 10 && countOfThePeople <= 20) {
                price = price * 0.95;
            }
        }
        double totalPrice = countOfThePeople * price;
        System.out.printf("Total price: %.2f", totalPrice);
    }
}
