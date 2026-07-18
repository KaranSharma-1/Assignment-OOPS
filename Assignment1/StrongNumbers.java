import java.util.Scanner;

public class StrongNumbers {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int start = sn.nextInt();
        int end = sn.nextInt();

        for (int i = start; i <= end; i++) {
            int temp = i;
            int sum = 0;
            while (temp > 0) {
                int rem = temp % 10;
                int fact = 1;
                for (int j = 2; j <= rem; j++) {
                    fact *= j;
                }
                sum += fact;
                temp /= 10;
            }
            if (sum == i) {
                System.out.println(i);
            }
        }
        sn.close();
    }
}
