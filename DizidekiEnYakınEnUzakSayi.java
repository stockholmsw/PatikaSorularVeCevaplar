package patika_soru_cevaplari.com;
import java.util.*;
public class DizidekiEnYakınEnUzakSayi {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the array elements: ");
        int[] array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Enter the number to find the closest numbers: ");
        int number = scanner.nextInt();

        int minClosestNumber = array[0];
        int maxClosestNumber = array[array.length - 1];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < number && Math.abs(array[i] - number) < Math.abs(minClosestNumber - number)) {
                minClosestNumber = array[i];
            }
            if (array[i] > number && Math.abs(array[i] - number) < Math.abs(maxClosestNumber - number)) {
                maxClosestNumber = array[i];
            }
        }

        System.out.println("The closest smaller number is " + minClosestNumber);
        System.out.println("The closest greater number is " + maxClosestNumber);


    }
    }

