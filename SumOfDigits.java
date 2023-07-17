package patika_soru_cevaplari.com;

public class SumOfDigits {
    public static void main(String[] args) {
        digitsSum(13265845);
    }
    public static int digitsSum(int value){
        int sum = 0;
        int lastDigit = 0;
        int temp = value;

        while(temp!=0){
            lastDigit = temp%10;
            sum = sum+lastDigit;
            temp/=10;
        }
        System.out.println(value + " Sayısının rakamları toplamı : " + sum);
        return sum;
    }
}
