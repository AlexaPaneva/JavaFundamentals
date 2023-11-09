package javaFundamentals.regularExpressionsE;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String regex = "%(?<name>[A-Z][a-z]+)%[^\\|$%\\.]*<(?<product>\\w+)>[^\\|\\$%\\.]*\\|(?<count>\\d+)\\|[^\\|\\$%\\.]*?(?<price>\\d+\\.?[0-9]*)\\$";


        Pattern pattern = Pattern.compile(regex);

        double totalIncome = 0;

        String text = scanner.nextLine();
        while (!text.equals("end of shift")) {
            Matcher matcher = pattern.matcher(text);

            if (matcher.find()) {
                String name = matcher.group("name");
                String product = matcher.group("product");
                int count = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));


                double totalPricePerOrder = price * count;
                totalIncome += totalPricePerOrder;

                System.out.printf("%s: %s - %.2f%n", name, product, totalPricePerOrder);
            }
            text = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f", totalIncome);
    }
}
