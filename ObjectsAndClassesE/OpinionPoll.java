package javaFundamentals.objectsAndClassesE;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OpinionPoll {

    public static class Person {
       private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;

        }

        public String getName() {
            return this.name;
        }

        public Integer getAge() {
            return this.age;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        List<Person> peopleList = new ArrayList<>();


        for (int row = 1; row <= n ; row++) {
             String data = scanner.nextLine();

             String name = data.split(" ")[0];
             int age = Integer.parseInt(data.split(" ")[1]);

             if (age > 30) {
                 Person person = new Person(name, age);
                 peopleList.add(person);
             }
        }
        for (Person person : peopleList) {


            System.out.println(person.getName() + " - " + person.getAge());
        }

    }
}
