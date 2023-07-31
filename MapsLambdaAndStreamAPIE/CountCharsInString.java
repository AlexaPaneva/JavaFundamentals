package JavaFundamentals.MapsLambdaAndStreamAPIE;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<Character, Integer> symbolsCountMap = new LinkedHashMap<>();

        for (char symbol : input.toCharArray()) {
            if (symbol == ' ') {
                continue;
            }
            if (!symbolsCountMap.containsKey(symbol)) {
                symbolsCountMap.put(symbol, 0);
            }
            int currentCount = symbolsCountMap.get(symbol);
            symbolsCountMap.put(symbol, currentCount + 1);

        }

        for (Map.Entry<Character, Integer> entry : symbolsCountMap.entrySet()) {
            System.out.printf("%c -> %d%n", entry.getKey(), entry.getValue());
        }
// Друг начин
// symbolsCountMap.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
