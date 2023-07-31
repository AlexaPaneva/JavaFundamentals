package JavaFundamentals.MidExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> priceRatingsList = new ArrayList<>();
        String[] ratings = scanner.nextLine().split(", ");
        for (String rating : ratings) {
            priceRatingsList.add(Integer.parseInt(rating));
        }

        int startPoint = Integer.parseInt(scanner.nextLine());
        String objectType = scanner.nextLine();

        int left = calculateDamage(priceRatingsList, startPoint, objectType, true);
        int right = calculateDamage(priceRatingsList, startPoint, objectType, false);

        if (left >= right) {
            System.out.printf("Left - %d", left);
        } else {
            System.out.printf("Right - %d", right);
        }
    }

    private static int calculateDamage(List<Integer> priceRatings, int entryPoint, String objectType, boolean isLeft) {
        int damage = 0;
        int direction = 0;
        if (isLeft) {
            direction = -1;
        } else {
            //isRight
            direction = 1;
        }
        int currentIndex = entryPoint + direction;

        while (currentIndex >= 0 && currentIndex < priceRatings.size()) {
            int currentPriceRating = priceRatings.get(currentIndex);

            if (objectType.equals("cheap") && currentPriceRating < priceRatings.get(entryPoint)) {
                damage += currentPriceRating;
            } else if (objectType.equals("expensive") && currentPriceRating >= priceRatings.get(entryPoint)) {
                damage += currentPriceRating;
            }

            currentIndex += direction;
        }

        return damage;
    }

}



