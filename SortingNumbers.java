package patika_soru_cevaplari.com;
import java.util.*;

public class SortingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz  : ");
        int [] numbers = new int[scanner.nextInt()];
        System.out.println( "\nSayıları giriniz : ");
        for (int i = 0; i < numbers.length; i++) {
           numbers[i] = scanner.nextInt();
        }

        System.out.println("Before:");
        printArray(numbers);

        //Sorting algorithm here
        boolean swappedSomething = true;

        while (swappedSomething) {
            swappedSomething = false;

            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    swappedSomething = true;
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
            }
        }


        System.out.println("\nAfter:");
        printArray(numbers);
    }

    private static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
    }


