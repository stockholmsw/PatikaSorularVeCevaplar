package patika_soru_cevaplari.com;

public class PalindromNumber {
    public static void main(String[] args) {
        System.out.println("Sayı Palindrome bir sayı mıdır : " + isPalindrome(156598));

    }
    public static boolean isPalindrome(int number){
        int tempNumber = number;
        int lastDigit;
        String reversedNumber ="";
        while(tempNumber!=0){
            lastDigit = tempNumber%10;
            reversedNumber+=lastDigit;
            tempNumber/=10;

        }
        System.out.println("Girilen sayı : " + number + "\n Girilen sayının Tersi : " + reversedNumber);
        int intValue = Integer.parseInt(reversedNumber);
        if(number==intValue){
            return true;
        }else{
            return false;
        }

    }

}
