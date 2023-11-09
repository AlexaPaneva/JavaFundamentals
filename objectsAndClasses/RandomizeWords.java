package javaFundamentals.objectsAndClasses;

import java.util.Random;
import java.util.Scanner;

public class RandomizeWords {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] wordsArr = scanner.nextLine().split(" ");

        Random random = new Random();

        for (int i = 0; i < wordsArr.length; i++) {
            int randomIndexX = random.nextInt(wordsArr.length);
            int randomIndexY = random.nextInt(wordsArr.length);

            String oldWord = wordsArr[randomIndexX];
            wordsArr[randomIndexX] = wordsArr[randomIndexY];
            wordsArr[randomIndexY] = oldWord;
        }
        System.out.println(String.join(System.lineSeparator(), wordsArr));
    }
}
