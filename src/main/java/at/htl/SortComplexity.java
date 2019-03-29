package at.htl;

import java.util.Random;
import java.util.Scanner;

public class SortComplexity {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Anzahl der zu sortierenden Arrays: ");
        int anzahl = scanner.nextInt();

        System.out.print("Größe der Arrays: ");
        int length = scanner.nextInt();
        System.out.println();

        for (int i = 0; i < length; i++) {
            sortRandomArray(length);
        }

        int[] array = generateRandomArray(length);

        for (int i = 1; i <= anzahl; i++) {
            System.out.print("Laufzeit zur Sortierung des " + i + ". Arrays: ");
            System.out.print(System.currentTimeMillis());
            System.out.println(" ms");
        }
        System.out.println();
        System.out.print("Durchschnittliche Laufzeit: " + System.currentTimeMillis()/anzahl + " ms");
    }

    // Sorts an array of random numbers and returns the sorting run time in ms
    public static long sortRandomArray(int length) {
        int[] array = generateRandomArray(length);
        long time = System.currentTimeMillis();
        return time;
    }

    // Returns an array of random numbers
    public static int[] generateRandomArray(int length) {
        Random random = new Random();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {

            array[i] = random.nextInt();
        }
        return array;
    }

    // Sorts an array of numbers in ascending order
    public static void sort(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            int min = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[min]){
                    min = j;
                }
                swap(array, i, j);
            }
        }
    }
    // Swaps the array elements with index i and j
    public static void swap(int[] array, int i, int j) {
        int help;
        help = i;
        i = j;
        j = help;
    }
}
