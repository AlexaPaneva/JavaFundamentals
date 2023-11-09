package javaFundamentals.mapsLambdaAndStreamAPIE;

import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, List<Double>> studentDataMap = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            String studentName = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (studentDataMap.containsKey(studentName)) {
                List<Double> currentGrades = studentDataMap.get(studentName);
                currentGrades.add(grade);
            } else {
                studentDataMap.put(studentName, new ArrayList<>());
                studentDataMap.get(studentName).add(grade);
            }
        }
        Map<String, Double> studentsAverageGradeMap = new LinkedHashMap<>();
        for (Map.Entry<String, List<Double>> entry : studentDataMap.entrySet()) {
            String studentName = entry.getKey();
            List<Double> grades = entry.getValue();
            double averageGrade = getAverageGrade(grades);
            if (averageGrade >= 4.50) {
                studentsAverageGradeMap.put(studentName, averageGrade);
            }
        }
studentsAverageGradeMap.entrySet().forEach(entry -> System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue()));
    }

    private static double getAverageGrade(List<Double> grades) {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
}
