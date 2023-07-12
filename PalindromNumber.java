package patika_soru_cevaplari.com;

public class PalindromNumber {
    public static void main(String[] args) {
        System.out.println(" isPalindrom : " + isPalindrom("Köksal is  a Software engineer in Sweden"));
    }
    public static String isPalindrom(String word){
        String myWord = "";
        for(int i = word.length()-1;i>=0;i--){
           myWord+=word.charAt(i);
        }
        if(myWord.equalsIgnoreCase(word)){
            return "Yes";
        }else {
            return "Not Yet";
        }

    }
}
