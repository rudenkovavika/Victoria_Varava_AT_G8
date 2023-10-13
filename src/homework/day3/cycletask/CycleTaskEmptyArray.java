package homework.day3.cycletask;

import java.util.Random;

public class CycleTaskEmptyArray {
    public static void printRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }

    public static void printAllElements(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printAllElementsReverse(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void printMultiplication(int[] array) {
        for (int i : array) {
            System.out.print(i * 5 + " ");
        }
        System.out.println();
    }

    public static void printSquare(int[] array) {
        for (int i : array) {
            System.out.print(i * i + " ");
        }
        System.out.println();
    }

    public static void printMinElement(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);
    }

    public static void changeFirstAndLastElements(int[] array) {
        int lastElement = array[array.length - 1];
        array[array.length - 1] = array[0];
        array[0] = lastElement;
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void descendingSortElements(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}