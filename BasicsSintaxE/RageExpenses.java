package javaFundamentals.basicsSintaxE;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countLoseGames = Integer.parseInt(scanner.nextLine());
        double priceHeadset = Double.parseDouble(scanner.nextLine());
        double priceMouse = Double.parseDouble(scanner.nextLine());
        double priceKeyboard = Double.parseDouble(scanner.nextLine());
        double priceDisplay = Double.parseDouble(scanner.nextLine());

        int countHeadset = countLoseGames / 2;
        int countMouse = countLoseGames / 3;
        int countKeyboard = countLoseGames / 6;
        int countDisplay = countLoseGames / 12;

        double totalPrice = (countHeadset * priceHeadset)
                + (countMouse * priceMouse)
                + (countKeyboard * priceKeyboard)
                + (countDisplay * priceDisplay);

        System.out.printf("Rage expenses: %.2f lv.", totalPrice);


        //int countHeadset = 0; //бр. слушалки
        //        int countMouse = 0; //бр. мишки
        //        int countKeyboard = 0; //бр. калвиатури
        //        int countDisplay = 0; //бр. монитори
        //
        //        for (int loseGame = 1; loseGame <= countLoseGames; loseGame++) {
        //            if (loseGame % 2 == 0) {
        //                //всяка втора игра -> слушалки
        //                countHeadset++;
        //            }
        //            if (loseGame % 3 == 0) {
        //                //всяка трета игра -> мишка
        //                countMouse++;
        //            }
        //            if (loseGame % 6 == 0) {
        //                //всяка шеста игра -> калвиатура
        //                countKeyboard++;
        //            }
        //            if (loseGame % 12 == 0) {
        //                //всяка дванадесета игра -> монитор
        //                countDisplay++;
        //            }
        //        }
        //
        //        double totalPrice = (countHeadset * priceHeadset)
        //                + (countMouse * priceMouse)
        //                + (countKeyboard * priceKeyboard)
        //                + (countDisplay * priceDisplay);
        //
        //        System.out.printf("Rage expenses: %.2f lv.", totalPrice);

    }
}
