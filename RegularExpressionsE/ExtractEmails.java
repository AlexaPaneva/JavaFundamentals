package JavaFundamentals.RegularExpressionsE;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String regex = "(?<user>\\w+[.-]?\\w+)@(?<host>[A-Za-z]+\\-?[A-Za-z](\\.[a-z]+\\-?[a-z]+)+)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
