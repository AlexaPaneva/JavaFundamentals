package JavaFundamentals.RegularExpressionsE;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String regex = ">>(?<furnitureName>[A-Za-z]+)<<(?<price>[0-9]+\\.?[0-9]*)!(?<quantity>\\d+)";
        Pattern pattern = Pattern.compile(regex);

        List<String> furniture = new ArrayList<>();
        double totalPrice = 0;

        while (!text.equals("Purchase")) {
            Matcher matcher = pattern.matcher(text);

            if (matcher.find()) {
                String furnitureName = matcher.group("furnitureName");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));

                furniture.add(furnitureName);

                double currentPrice = price * quantity;
                totalPrice += currentPrice;
            }
            text = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        furniture.forEach(System.out::println);
        // = this up is equal to this down
//        for (String f : furniture) {
//            System.out.println(f);
//        }

        System.out.printf("Total money spend: %.2f", totalPrice);
    }
}
