package patika_soru_cevaplari.com;
import java.util.*;
public class FiboNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("N sayısını giriniz : ");
        int n = scanner.nextInt();
        int firstNumber = 0;
        int secondNumber = 1;

        System.out.println("Fibonacci Sequence:");
        System.out.print(firstNumber + " " + secondNumber);

        for (int i = 1; i < n; i++) {
            int nextNumber = firstNumber + secondNumber;
            System.out.print(" " + nextNumber);

            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
    }
}
