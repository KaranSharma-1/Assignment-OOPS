import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int start = sn.nextInt();
        int end = sn.nextInt();
        for (int i = start; i <= end; i++) {
            if (i <= 1) {
                continue;
            }
            boolean isPrime = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
        sn.close();
    }
}
