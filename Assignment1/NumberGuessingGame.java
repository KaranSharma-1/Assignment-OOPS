import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int ans = 27;
        boolean isGuessed = false;

        for (int attempts = 1; attempts <= 5; attempts++) {
            int guess = sn.nextInt();
            if (guess < ans) {
                System.out.println("Too Low");
            } else if (guess > ans) {
                System.out.println("Too High");
            } else {
                System.out.println("Congratulations! You guessed it.");
                isGuessed = true;
                break;
            }
        }

        if (!isGuessed) {
            System.out.println("Better Luck Next Time!");
        }
        sn.close();
    }
}
