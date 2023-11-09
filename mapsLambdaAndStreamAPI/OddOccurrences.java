package javaFundamentals.mapsLambdaAndStreamAPI;

import java.util.*;

public class OddOccurrences {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] wordsArr = scanner.nextLine().split(" ");

        LinkedHashMap<String, Integer> wordsMap = new LinkedHashMap<>();

        for (String word : wordsArr) {
            word = word.toLowerCase();

            if (!wordsMap.containsKey(word)) {
                wordsMap.put(word, 0);
            }
            wordsMap.put(word, wordsMap.get(word) + 1);

//           variant2
//            if (wordsMap.containsKey(word)) {
//                wordsMap.put(word, wordsMap.get(word) + 1);
//            } else {
//                wordsMap.put(word, 1);
//            }

//            variant3
//            wordsMap.putIfAbsent(word, 0);
//            wordsMap.put(word, wordsMap.get(word) + 1);
        }
        ArrayList<String> resultList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordsMap.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                resultList.add(entry.getKey());
            }
        }
        System.out.println(String.join(", ", resultList));
    }
}
