package patika_soru_cevaplari.com;
import java.util.*;
public class RepeatedEvenNumber {

    public static boolean isFind(int arr[],int value){
        for(int i  :arr){
            if(i == value){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dizinin boyutunu giriniz : ");
        int dimension = scanner.nextInt();
        int arr[] = new int [dimension];
        int[] repeatedArr = new int[arr.length];

        for(int i = 0;i< arr.length;i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("Dizideki  sayılar : " + "\n " + Arrays.toString(arr));
        for(int i = 0;i< arr.length;i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j] && arr[i] % 2 == 0) {
                    if (!isFind(repeatedArr, arr[i])) {
                        repeatedArr[i] = arr[i];
                    }
                    break;
                }
            }

        }

        System.out.print("Dizide tekrar eden Çift sayılar : ");
       for(int value : repeatedArr){
           if(value!=0){
               System.out.print(value + " ");
           }
       }

    }

    }

