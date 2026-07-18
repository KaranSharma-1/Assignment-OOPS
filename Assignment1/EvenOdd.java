import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " -> Even");
            } else {
                System.out.println(i + " -> Odd");
            }
        }
        sn.close();
    }
}
