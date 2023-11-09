package javaFundamentals.dataTypesAndVariables;

import java.util.Scanner;

public class RefactorVolumeOfPyramid {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        double dul, sh, V = 0;
//        System.out.print("Length: ");
//        double width = Double.parseDouble(scanner.nextLine());
//        System.out.print("Width: ");
//        double height = Double.parseDouble(scanner.nextLine());
//        System.out.print("Height: ");
//         double V = Double.parseDouble(scanner.nextLine());
//        V = (width * height * V) / 3;
//        System.out.printf("Pyramid Volume: %.2f", V);

        double length = Double.parseDouble(scanner.nextLine());
        System.out.print("Length: ");
        double width = Double.parseDouble(scanner.nextLine());
        System.out.print("Width: ");
        double height = Double.parseDouble(scanner.nextLine());
        System.out.print("Height: ");

        double V = length * width * height / 3;

        System.out.printf("Pyramid Volume: %.2f", V);
    }
}
