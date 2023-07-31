package JavaFundamentals.MidExam;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double neededPoints = Double.parseDouble(scanner.nextLine());
        int battlesCount = Integer.parseInt(scanner.nextLine());

        int currentBattle = 0;
        double totalPoints = 0;

        for (int i = 1; i <= battlesCount ; i++) {
            double currentsPoints = Double.parseDouble(scanner.nextLine());

            if (i == 3) {
                currentsPoints = currentsPoints + (currentsPoints * 0.15);
            }
            if (i == 5) {
                currentsPoints = currentsPoints - (currentsPoints * 0.10);
            }
            if (i == 15) {
                currentsPoints = currentsPoints + (currentsPoints * 0.05);
            }
            totalPoints += currentsPoints;
            currentBattle++;

            if (totalPoints >= neededPoints) {
                break;
            }
        }
        if (totalPoints >= neededPoints) {
            System.out.printf("Player successfully collected his needed experience for %d battles.%n", currentBattle);
        } else {
            double moreNeededPoints = neededPoints - totalPoints;
            System.out.printf("Player was not able to collect the needed experience, %.2f more needed.", moreNeededPoints);
        }
    }
}
