package patika_soru_cevaplari.com;
import java.util.*;

public class IsPrimeOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        boolean isPrime = true;
        do {
            System.out.print("Sayı giriniz : ");
            number = scanner.nextInt();
            for(int i = 2;i<number;i++){
                isPrime = true;
                if(number%i==0){
                    isPrime = false;
                    System.out.println(number + " sayısı  Asal değildir!.");
                    break;
                }
            }
            if(isPrime==true){
                System.out.println(number + " sayısı ASALDIR!");
            }

        }while (number>0);
    }
}
