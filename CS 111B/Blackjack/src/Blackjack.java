// Vanessa Yu

import java.util.Random;
import java.util.Scanner;

public class Blackjack {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random ranNum = new Random();
        int card, card1, card2, total;
        char input;

        while (true) {
            card1 = ranNum.nextInt(10) + 1;
            card2 = ranNum.nextInt(10) + 1;
            System.out.println("First cards: " + card1 + " " + card2);
            total = card1 + card2;
            System.out.println("Total: " + total);

            while (true) {
                System.out.print("Do you want another card? (y/n): ");
                input = keyboard.nextLine().charAt(0);
                if (input == 'n' || input == 'N') {
                    break;
                }
                card = ranNum.nextInt(10) + 1;
                System.out.println("Card: " + card);
                total += card;
                System.out.println("Total: " + total);
                if (total == 21) {
                    System.out.println("You win!");
                    break;
                } else if (total > 21) {
                    System.out.println("Bust");
                    break;
                }
            }
            System.out.print("Do you want to play again? (y/n): ");
            input = keyboard.nextLine().charAt(0);
            if (input == 'n' || input == 'N') {
                break;
            }
        }
    }
}
