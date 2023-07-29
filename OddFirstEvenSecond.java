package patika_soru_cevaplari.com;
import java.util.*;

public class OddFirstEvenSecond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers[] = {1,2,4,5,7,9,-2,-3};
        //1,5,7,9,3,-2,4-2;
        int[] tempArray = new int[numbers.length];
        int k = 0;
        int j = numbers.length-1;
        for(int i = 0;i< numbers.length;i++){
            if(numbers[i]%2!=0){
                tempArray[k++] = numbers[i];
            }else{
                tempArray[j--] = numbers[i];
            }
        }
        copArray(numbers,tempArray);
        System.out.println(Arrays.toString(numbers));

    }
    public static void copArray(int []numbers,int []tempArray){
        for(int i = 0;i< numbers.length;i++){
            numbers[i] = tempArray[i];
        }

    }
    
}
