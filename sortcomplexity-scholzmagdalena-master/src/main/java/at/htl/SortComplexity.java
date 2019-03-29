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

        int summe = 0;

        for (int i = 1; i <= anzahl; i++) {
            System.out.println("Laufzeit zur Sortierung des " + i + ". Arrays: " + sortRandomArray(length) + " ms");
            summe = summe + (int)sortRandomArray(length);
        }
        System.out.println();
        System.out.print("Durchschnittliche Laufzeit: " + (summe/anzahl) + " ms");
    }

    // Sorts an array of random numbers and returns the sorting run time in ms
    public static long sortRandomArray(int length) {
        long help = System.currentTimeMillis();
        sort(generateRandomArray(length));
        long time = System.currentTimeMillis();
        time-=help;

        return time;
    }

    // Returns an array of random numbers
    public static int[] generateRandomArray(int length) {
        Random random = new Random();
        int[] randomArray = new int[length];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt()*1000;
        }
        return randomArray;
    }

    // Sorts an array of numbers in ascending order
    public static void sort(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            int min = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[min]){
                    swap(array, i, j);
                }
                min = j;
            }
        }
    }
    // Swaps the array elements with index i and j
    public static void swap(int[] array, int i, int j) {
        int help;
        help = array[j];
        array[j] = array[i];
        array[i] = array[j];
    }
}
