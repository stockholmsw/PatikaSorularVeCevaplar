package patika_soru_cevaplari.com;
import java.util.*;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz  :");
        int number = scanner.nextInt();
        int sumOfNumber = 0;
        for(int i = 1;i<number;i++){
            if(number%i==0){
                sumOfNumber+=i;
            }
        }
        if(sumOfNumber == number){
            System.out.println(number + " Mükemmel bir sayıdır");
        }else{
            System.out.println(number + " Mükemmel bir sayı değildir.");
        }



    }



}
