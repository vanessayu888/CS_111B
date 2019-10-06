import java.util.Scanner;

public class NumberGuesser {
    public static void main(String[] args) {
        do {
            playOneGame();
        } while (shouldPlayAgain());
    }


    public static void playOneGame() {
        int low = 1;
        int high = 100;
        int guess = 50;
        System.out.println("Guess a number between 1 and 100.");
        while (true) {
            char response = getUserResponseToGuess(guess);
            if (response == 'h') {
                low = guess;
                guess = getMidpoint(low, high);
            } else if (response == 'l') {
                high = guess;
                guess = getMidpoint(low, high);
            } else {
                return;
            }
        }
    }

    public static boolean shouldPlayAgain() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Do you want to play again? (y/n): ");
        char response = keyboard.nextLine().charAt(0);
        if (response == 'y')
            return true;
        else
            return false;
    }

    public static char getUserResponseToGuess(int guess) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Is it " + guess + "? (h/l/c): ");
        return keyboard.nextLine().charAt(0);
    }

    public static int getMidpoint(int low, int high) {
        return (low + high) / 2;
    }
}
