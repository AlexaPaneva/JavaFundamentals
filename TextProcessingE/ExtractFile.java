package JavaFundamentals.TextProcessingE;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] path = scanner.nextLine().split("\\\\");
        String fullFileName = path[path.length - 1];

        String name = fullFileName.split("\\.")[0];
        String extension = fullFileName.split("\\.")[1];

        System.out.println("File name: " + name);
        System.out.println("File extension: " + extension);
    }
}
