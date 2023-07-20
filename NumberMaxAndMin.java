package patika_soru_cevaplari.com;
import java.util.*;
public class NumberMaxAndMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Java ile klavyeden girilen N tane sayma sayısından
         en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.
         */
        int nNum;


        System.out.print("Kaç tane  sayı gireceksiniz?  ");
        nNum = scanner.nextInt();
       int[] dizi = new int[nNum];
        for(int i = 0;i<nNum;i++){
           System.out.println((i+1) + " . sayı :  ");
           dizi[i] = scanner.nextInt();
       }

        int largestNumber = dizi[0];
        int smallestNumber = dizi[0];

        for(int i = 0;i< dizi.length;i++){
            if(dizi[i]<smallestNumber){
                smallestNumber = dizi[i];
            }if(dizi[i]>largestNumber){
                largestNumber = dizi[i];
            }
        }
        System.out.println(Arrays.toString(dizi));
        System.out.println("Girilen En Büyük sayı : " + largestNumber);
        System.out.println("Girilen En Küçük sayı : " + smallestNumber);







    }
   
}
