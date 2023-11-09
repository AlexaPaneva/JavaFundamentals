package javaFundamentals.examPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String places = scanner.nextLine();
        String regex = "([=\\/])(?<validPlaces>[A-Z][A-Za-z]{2,})\\1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(places);

        List<String> validPlaccesList = new ArrayList<>();
        while (matcher.find()) {
            String validPlaces = matcher.group("validPlaces");
            validPlaccesList.add(validPlaces);
        }
        System.out.println("Destinations: " + String.join(", ", validPlaccesList));

        int points = 0;
        for (String validPlaces : validPlaccesList) {
            points += validPlaces.length();
        }
        System.out.println("Travel Points: " + points);
    }
}
