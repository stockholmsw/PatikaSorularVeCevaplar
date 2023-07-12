package patika_soru_cevaplari.com;
import java.util.*;
public class ArrayAddition {
    public static void main(String[] args) {
        Random random = new Random();
        int []myArr = new int[10];
        for(int i = 0;i<myArr.length;i++){
            myArr[i] = random.nextInt(2);
        }
        System.out.println("Before : ");
        printArray(myArr);
        System.out.println("\nDizideki sayıları toplamı , dizideki en büyük sayıya eşit mi : "
                + arrayAddition(myArr));


    }
    public static String arrayAddition(int array[]){
        int sum = 0;
        int maxNumber = array[0];
        int minNumber = array[0];

        for(int i = 0;i<array.length;i++){
            if(array[i]>maxNumber){
                maxNumber = array[i];
            }
        }
        System.out.println("\nDizideki en büyük sayı : " + maxNumber);
        for(int i = 0;i<array.length;i++){
            sum+=array[i];
        }
        System.out.println("\n Dizideki sayıların toplamı : " + sum);
        if(maxNumber == sum){
            return "True";
        }
        return  "False";

    }
    public static void printArray(int []a){
        for(int i = 0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }

    }
}
