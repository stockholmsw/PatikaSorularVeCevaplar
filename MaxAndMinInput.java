package patika_soru_cevaplari.com;
import java.util.*;
public class MaxAndMinInput {
    public static void main(String[] args) {
          /*
        Write a program which reads a sequence of positive integers.The program stops .The program stops when the user
        fills a negative value and shows the maximum and minimum value of these numbers;
         */
        Scanner scanner = new Scanner(System.in);
        int num;
        int max = 0,min = 0;
        do {
            System.out.print("Bir sayı giriniz : ");
            num = scanner.nextInt();
            if(num>max){
                max = num;
            }else if(num<min){
                min = num;
            }
        }while(num>=0);
        System.out.println("Girilen en nüyük sayı : " + max);
        System.out.println("Girilen en küçük sayı : " + min);
    }


}
