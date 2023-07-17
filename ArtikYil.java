package patika_soru_cevaplari.com;
import javax.crypto.spec.PSource;
import java.util.*;
public class ArtikYil {
    public static void main(String[] args) {
        int year = 1800; // You can change the year to test for different values.
        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }


    public static boolean isLeapYear(int year){
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                // If the year is divisible by 100, it must also be divisible by 400 to be a leap year.
                return year % 400 == 0;
            } else {
                // If the year is not divisible by 100 but divisible by 4, it's a leap year.
                return true;
            }
        } else {
            // If the year is not divisible by 4, it's not a leap year.
            return false;
        }
    }
}


