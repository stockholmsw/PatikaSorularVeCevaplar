package patika_soru_cevaplari.com;
public class RecursiveFibonacci {
    public static void main(String[] args) {

        System.out.println(fibonacciNum(10));
    }
    public static long  fibonacciNum(long  n){
        if( n == 0||n==1){
            return n;
        }else{
             return  fibonacciNum(n-1) + fibonacciNum (n-2);
        }
    }
}
