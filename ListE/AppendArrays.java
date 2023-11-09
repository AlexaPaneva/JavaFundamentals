package javaFundamentals.listE;

import java.util.*;
import java.util.stream.Collectors;

public class AppendArrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        List<String> separatedByPipeList = Arrays.stream(input
                .split("\\|"))
                .collect(Collectors.toList());

        Collections.reverse(separatedByPipeList);
        System.out.println(separatedByPipeList
                .toString()
                .replaceAll("[\\[\\],]", "")
                .trim()
                .replaceAll(",", "")
                .replaceAll("\\s+", " "));

    }
}
