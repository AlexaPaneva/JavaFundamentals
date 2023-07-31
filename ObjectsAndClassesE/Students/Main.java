package JavaFundamentals.ObjectsAndClassesE.Students;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Student> studentList = new ArrayList<>();


        for (int i = 1; i <= n ; i++) {
            String data = scanner.nextLine();

            String firstName = data.split(" ")[0];
            String lastName = data.split(" ")[1];
            double grade = Double.parseDouble(data.split(" ")[2]);


            Student student = new Student(firstName, lastName, grade);
            studentList.add(student);
        }

        Collections.sort(studentList, Comparator.comparingDouble(Student::getGrade)
                .reversed());

        for (Student student : studentList) {

            System.out.printf("%s %s: %.2f%n",student.getFirstName(), student.getLastName(), student.getGrade());
        }
    }
}
