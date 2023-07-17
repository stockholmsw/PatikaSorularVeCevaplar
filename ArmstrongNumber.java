package patika_soru_cevaplari.com;

public class ArmstrongNumber {
    public static void main(String[] args) {

        armstrongNum(1442);

    }
    public static int armstrongNum(int value){
        int temp,basPow , result = 0;
        temp = value;
        int numberOfDigit = 0;
        int digitValue;
        temp = value;
        while(temp!=0){
            temp/=10;
            numberOfDigit++;

        }
        temp  = value;
        while(temp!=0){
            digitValue = temp%10;
            basPow = 1;

            for(int i = 1;i<=numberOfDigit;i++){
                basPow*=digitValue;
            }
            result+=basPow;

            temp/=10;
        }

        if(value == result){
            System.out.println(value + " Armstrong sayıdır");
        }else{
            System.out.println(value + " Armstrong sayı değildir.");
        }
        return result;






    }
}
