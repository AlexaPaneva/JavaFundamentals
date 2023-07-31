package JavaFundamentals.MidExam;

import java.util.Scanner;

public class BonusScoringSystem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int studentsCount = Integer.parseInt(scanner.nextLine());
        int lecturesCount = Integer.parseInt(scanner.nextLine());
        int initBonus = Integer.parseInt(scanner.nextLine());

        double maxBonus = 0;
        int maxAttendances = 0;
        for (int i = 0; i < studentsCount; i++) {
            int attendances = Integer.parseInt(scanner.nextLine());

            double currentBonus = attendances * 1.0 / lecturesCount * (5 + initBonus);

            if (currentBonus > maxBonus) {
                maxBonus = currentBonus;
                maxAttendances = attendances;
            }
        }
        System.out.printf("Max Bonus: %.0f.%n", Math.ceil(maxBonus));
        System.out.printf("The student has attended %d lectures.%n", maxAttendances);
    }
}
