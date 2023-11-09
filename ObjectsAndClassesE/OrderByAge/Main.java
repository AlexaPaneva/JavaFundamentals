package javaFundamentals.objectsAndClassesE.orderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        List<PersonId> personIdList = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] inputData = input.split("\\s+");
            String name = inputData[0];
            String id = inputData[1];
            int age = Integer.parseInt(inputData[2]);

            PersonId personId = new PersonId(name, id, age);
            personIdList.add(personId);

            input = scanner.nextLine();
        }
        personIdList.sort(Comparator.comparing(PersonId::getAge));

        for (PersonId personId : personIdList) {
            System.out.printf("%s with ID: %s is %d years old.%n"
                    , personId.getName(), personId.getId(), personId.getAge());
        }
    }
}
