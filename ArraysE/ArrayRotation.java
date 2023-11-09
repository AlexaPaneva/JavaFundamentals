package javaFundamentals.arraysE;

import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        String row = scanner.nextLine();
//        String[] input = row.split(" ");
        // Това е малко по-дългия начин да се напише това долу

        String[] array = scanner.nextLine()
                .split(" ");
        int countRotation = Integer.parseInt(scanner.nextLine());

        for (int rotation = 1; rotation <= countRotation; rotation++) {
            String firstElement = array[0];
            for (int index = 0; index < array.length - 1; index++) {
                array[index] = array[index + 1];
            }
            array[array.length - 1] = firstElement;
        }
            for (String element : array) {
                System.out.print(element + " ");
            }
        }

    }

