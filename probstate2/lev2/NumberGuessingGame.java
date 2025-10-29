import java.util.*;
public class NumberGuessingGame {
    static int generateGuess(int low, int high) {
        return new Random().nextInt(high - low + 1) + low;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = 1, high = 100, guess;
        String feedback;
        while (true) {
            guess = generateGuess(low, high);
            System.out.println("Is your number " + guess + "? (high/low/correct)");
            feedback = sc.nextLine().toLowerCase();
            if (feedback.equals("correct")) {
                System.out.println("Yay! I guessed it!");
                break;
            } else if (feedback.equals("high")) high = guess - 1;
            else if (feedback.equals("low")) low = guess + 1;
            if (low > high) {
                System.out.println("Hmm, something's off. Let's restart!");
                break;
            }
        }
    }
}
