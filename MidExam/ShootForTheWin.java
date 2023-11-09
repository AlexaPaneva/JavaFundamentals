package javaFundamentals.midExam;

import java.util.Arrays;
import java.util.Scanner;

public class ShootForTheWin {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] targetsArr = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int countShootTarget = 0;

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            int index= Integer.parseInt(input);

            if (index >= 0 && index <= targetsArr.length - 1) {
                int shotTarget = targetsArr[index];
                for (int i = 0; i < targetsArr.length - 1; i++) {
                    int currentTarget = targetsArr[i];
                    if (i != index && currentTarget != -1) {
                        if (currentTarget > shotTarget) {
                            currentTarget -= shotTarget;
                        } else {
                            shotTarget += currentTarget;
                        }
                        targetsArr[i] = currentTarget;
                    }
                }


                targetsArr[index] = -1;
                countShootTarget++;
            }
            input = scanner.nextLine();
        }

        System.out.print("Shot targets: " + countShootTarget + " -> ");
        for (int target : targetsArr) {
            System.out.print(target + " ");
        }
    }
}
