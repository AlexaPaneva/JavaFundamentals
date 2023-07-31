package JavaFundamentals.MapsLambdaAndStreamAPIE;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class Courses {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        LinkedHashMap<String, List<String>> coursesMap = new LinkedHashMap<>();

        while (!input.equals("end")) {

            String courseName = input.split(" : ")[0];
            String studentName = input.split(" : ")[1];

            if (!coursesMap.containsKey(courseName)) {
                coursesMap.put(courseName, new ArrayList<>());
            }
            coursesMap.get(courseName).add(studentName);

            input = scanner.nextLine();
        }
        coursesMap.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + ": " + entry.getValue().size());
       entry.getValue().forEach(studentName -> System.out.println("-- " + studentName));
        });
    }
}
