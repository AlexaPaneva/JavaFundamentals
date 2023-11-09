package javaFundamentals.midExam;

import java.util.Scanner;

public class SoftUniReception {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//•	On the first three lines -  each employee efficiency -  integer in the range [1 - 100]
//•	On the fourth line - students count – integer in the range [0 – 10000]
//•	Input will always be valid and in the range specified
        int firstEmployeesStudents = Integer.parseInt(scanner.nextLine());
        int secondEmployeesStudents = Integer.parseInt(scanner.nextLine());
        int thirdEmployeesStudents = Integer.parseInt(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());

        int totalHours = 0;

        while (studentsCount > 0) {
            int studentsPerHour = firstEmployeesStudents + secondEmployeesStudents + thirdEmployeesStudents;
            totalHours++;

            if (totalHours % 4 == 0) {
                continue;
            }
            studentsCount -= studentsPerHour;
        }
        System.out.printf("Time needed: %dh.", totalHours);
    }
}
