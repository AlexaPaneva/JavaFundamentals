package JavaFundamentals.MapsLambdaAndStreamAPIE;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class CompanyUsers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, List<String>> employeesMap = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] info = input.split(" -> ");

            List<String> currentCompanyEmployees = employeesMap.get(info[0]);
            boolean containsId = currentCompanyEmployees != null && currentCompanyEmployees.contains(info[1]);

            if (!containsId) {
                employeesMap.putIfAbsent(info[0], new ArrayList<>());
                employeesMap.get(info[0]).add(info[1]);
            }


            input = scanner.nextLine();
        }

        employeesMap.entrySet().stream()
                .forEach(c -> {
                    System.out.printf("%s%n", c.getKey());
                    c.getValue().forEach(e -> System.out.printf("-- %s%n", e));
                });

    }
}
