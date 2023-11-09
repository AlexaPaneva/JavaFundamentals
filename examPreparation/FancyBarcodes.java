package javaFundamentals.examPreparation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String regex = "@#+(?<barcode>[A-Z][A-Za-z0-9]{4,}[A-Z]@)#+";
        Pattern pattern = Pattern.compile(regex);
        for (int i = 1; i <= n; i++) {
            String barcode = scanner.nextLine();
            Matcher matcher = pattern.matcher(barcode);
            if (matcher.find()) {
                String textBarcode = matcher.group("barcode");
                StringBuilder sbCategory = new StringBuilder();
                for (char symbol : textBarcode.toCharArray()) {
                    if (Character.isDigit(symbol)) {
                        sbCategory.append(symbol);
                    }
                }
                if (sbCategory.length() == 0) {
                    System.out.println("Product group: 00");
                } else {
                    System.out.println("Product group: " + sbCategory.toString());
                }

            } else {
                System.out.println("Invalid barcode");
            }
        }
    }
}

