package JavaFundamentals.ObjectsAndClassesE.AdvertisementMessage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Message message = new Message();

        for (int i = 0; i < n; i++) {
            System.out.println(message.randomMessage());
        }
    }
}
