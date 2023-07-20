package patika_soru_cevaplari.com;

public class PrimeNumber {
    public static void main(String[] args) {
        primeNum();
    }
    public static void primeNum() {

        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
//<<<<<<< HEAD
                System.out.print(i + "  ");
//=======
                System.out.print(i + " ,");
<<<<<<< HEAD
//>>>>>>> 660863f16a266c86e8d477efe967626ba54aa269
=======

>>>>>>> ed8bbca1468bf9055cf1781aab8d8eb91e42f4f2
            }
        }
    }
}
