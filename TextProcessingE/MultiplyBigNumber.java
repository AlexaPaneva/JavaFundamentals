package javaFundamentals.textProcessingE;

import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        String firstInput = scanner.nextLine(); //"923847238931983192462832102"
//        String secondInput = scanner.nextLine(); //"4"
//
//        BigInteger firstNumber = new BigInteger(firstInput); //923847238931983192462832102
//        BigInteger secondNumber = new BigInteger(secondInput);// 4
//
//        System.out.println(firstNumber.multiply(secondNumber));


        String largeNumber = scanner.nextLine();
        int singleDigit = Integer.parseInt(scanner.nextLine());

        String product = calculateProduct(largeNumber, singleDigit);
        System.out.println(product);
    }

    private static String calculateProduct(String largeNumber, int singleDigit) {
        if (singleDigit == 0 || largeNumber.equals("0")) {
            return "0";
        }

        int startIndex = 0;
        while (startIndex < largeNumber.length() && largeNumber.charAt(startIndex) == '0') {
            startIndex++;
        }

        StringBuilder productBuilder = new StringBuilder();
        int carry = 0;

        for (int i = largeNumber.length() - 1; i >= startIndex; i--) {
            int digit = Character.getNumericValue(largeNumber.charAt(i));
            int product = digit * singleDigit + carry;
            carry = product / 10;
            product %= 10;
            productBuilder.insert(0, product);
        }

        if (carry > 0) {
            productBuilder.insert(0, carry);
        }

        return productBuilder.toString();
    }
}

