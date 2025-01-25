import java.util.*;

public class Numbergame {
    public static void numberguess() {
        Scanner s = new Scanner(System.in);//initializing scanner
        Random r = new Random();
        int n = r.nextInt(100) + 1; // it will give numbers between 1 to 100
        int trials = 6;
        int guess;
        System.out.println("You have to choose a number between 1 to 100 within 5 trials");

        for (int i = 0; i < trials; i++) {
            System.out.println("Guess the number:");
            guess = s.nextInt(); // you have to guess a number

            if (n == guess) {
                System.out.println("Congratulations! You have guessed the exact number.");
                break;
            } else if (n > guess && i != trials - 1) {
                System.out.println("The actual number is greater than your guess: " + guess);
            } else if (n < guess && i != trials - 1) {
                System.out.println("The actual number is smaller than your guess: " + guess);
            }

            if (i == trials - 1) {
                System.out.println("You have completed all " + trials + " trials.");
                System.out.println("The actual number was: " + n);
            }
        }
    }

    public static void main(String[] arg) {
        numberguess();
    }
}
