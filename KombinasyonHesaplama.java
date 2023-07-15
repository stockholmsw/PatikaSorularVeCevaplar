package patika_soru_cevaplari.com;
import java.util.*;
public class KombinasyonHesaplama {
    public static void main(String[] args) {
       //C(n, r) = n! / (r! * (n - r)!)

        int result = calculateCombination(10,4);
        System.out.println("Kombinasyon sonucu : " + result);


    }
    // Recursive ;
    public static int faktoriel(int n ){
        if(n==0 || n == 1){
            return 1;
        }else{
           return n*faktoriel(n-1);
        }
    }
    public static int calculateCombination(int n , int r){
        int nominator = faktoriel(n);
        int denominator = faktoriel(r) *faktoriel(n-r);
        return nominator/denominator;
    }
}
