package javaFundamentals.mapsLambdaAndStreamAPIE;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String data = scanner.nextLine();

        Map<String, Integer> productsQuantityMap = new LinkedHashMap<>();
        Map<String, Double> productsPriceMap = new LinkedHashMap<>();

        while (!data.equals("buy")) {
            String product = data.split(" ")[0];
            double price = Double.parseDouble(data.split(" ")[1]);
            int quantity = Integer.parseInt(data.split(" ")[2]);

            if (!productsPriceMap.containsKey(product)) {
                productsQuantityMap.put(product, quantity);
            } else {
                int currentQuantity = productsQuantityMap.get(product);
                productsQuantityMap.put(product, currentQuantity + quantity);
            }
            productsPriceMap.put(product, price);

            data = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> entry : productsQuantityMap.entrySet()) {
            String productName = entry.getKey();
            double finalSum = productsQuantityMap.get(productName) * productsPriceMap.get(productName);
            System.out.printf("%s -> %.2f%n", productName, finalSum);
        }
    }
}
