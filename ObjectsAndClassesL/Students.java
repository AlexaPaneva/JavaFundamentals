package JavaFundamentals.ObjectsAndClassesL;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {
    public static class Student {
        String firstName;
        String lastName;
        String age;
        String town;


        public Student(String firstName, String lastName, String age, String town) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.town = town;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getAge() {
            return age;
        }

        public String getTown() {
            return town;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Student> studentsList = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] studentsArr = input.split(" ");
            String firstName = studentsArr[0];
            String lastName = studentsArr[1];
            String age = studentsArr[2];
            String town = studentsArr[3];

            Student currentStudent = new Student(firstName, lastName, age, town);
            studentsList.add(currentStudent);


            input = scanner.nextLine();
        }
        String homeTown = scanner.nextLine();
        for (Student student : studentsList) {
            if (student.getTown().equals(homeTown)) {
                System.out.printf("%s %s is %s years old%n",
                        student.getFirstName(), student.getLastName(), student.getAge());
            }
        }
    }
}
