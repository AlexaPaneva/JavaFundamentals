package JavaFundamentals.TextProcessingE;

import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.stream;

public class ValidUsernames {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] usernamesArr = scanner.nextLine().split(", ");

        for (String username : usernamesArr) {
            if (isValidUsername(username)) {
                System.out.println(username);
            }
        }
    }

    public static boolean isValidUsername(String username) {
        if (username.length() < 3 || username.length() > 16) {
            return false;
        }
        for (char symbol : username.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol) && symbol != '-' && symbol != '_') {
                return false;
            }
        }
        return true;
    }
}
