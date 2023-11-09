package javaFundamentals.objectsAndClassesE.vehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Catalogue> catalogueList = new ArrayList<>();
        while (!input.equals("End")) {
            String[] inputData = input.split(" ");

            String type = inputData[0];
            String model = inputData[1];
            String color = inputData[2];
            int horsepower = Integer.parseInt(inputData[3]);

            Catalogue catalogue = new Catalogue(type, model, color, horsepower);
            catalogueList.add(catalogue);

            input = scanner.nextLine();
        }

        String enteredModel = scanner.nextLine();
        while (!enteredModel.equals("Close the Catalogue")) {

            for (Catalogue catalogue : catalogueList) {
                if (enteredModel.equals(catalogue.getModel())) {
                    System.out.println(catalogue);
                    break;
                }
            }
            enteredModel = scanner.nextLine();
        }
        System.out.printf("Cars have average horsepower of: %.2f.%n", getAverageHP(catalogueList, "cars"));
        System.out.printf("Trucks have average horsepower of: %.2f.", getAverageHP(catalogueList, "trucks"));
    }


    private static double getAverageHP(List<Catalogue> catalogueList, String type) {
        double sum = 0;
        int count = 0;
        if (type.equals("cars")) {
            for (Catalogue catalogue : catalogueList) {
                if (catalogue.getType().equals("car")) {
                    sum += catalogue.getHorsepower();
                    count++;
                }
            }
        } else if (type.equals("trucks")) {
            for (Catalogue catalogue : catalogueList) {
                if (catalogue.getType().equals("truck")) {
                    sum += catalogue.getHorsepower();
                    count++;
                }
            }
        }
        if (sum == 0) {
            return 0;
        }
        return sum / count;
    }
}


