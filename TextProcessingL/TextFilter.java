package JavaFundamentals.TextProcessingL;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TextFilter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> banWordsList = Arrays.stream(scanner.nextLine()
                        .split(", "))
                .collect(Collectors.toList());
        String text = scanner.nextLine();

        for (String banWords : banWordsList) {
            String asterisk = repeatString(banWords);
            text = text.replace(banWords, asterisk);
        }
        System.out.println(text);
    }

    public static String repeatString(String banWord) {
        String result = "";

        for (int i = 0; i < banWord.length(); i++) {
            result += "*";
        }
        return result;
    }
}
