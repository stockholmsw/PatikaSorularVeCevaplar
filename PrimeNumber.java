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
<<<<<<< HEAD
                System.out.print(i + "  ");
=======
                System.out.print(i + " ,");

            }
        }
    }
}
