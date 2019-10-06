// Vanessa Yu
import java.util.Scanner;

public class PokerHands {
    public static int[] lst;

    public static void main(String[] args) {
        int card1, card2, card3, card4, card5;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter five numeric cards, no face cards. Use 2 - 9.");
        System.out.print("Card 1: ");
        card1 = keyboard.nextInt();
        System.out.print("Card 2: ");
        card2 = keyboard.nextInt();
        System.out.print("Card 3: ");
        card3 = keyboard.nextInt();
        System.out.print("Card 4: ");
        card4 = keyboard.nextInt();
        System.out.print("Card 5: ");
        card5 = keyboard.nextInt();
        int[] hand = {card1, card2, card3, card4, card5};
        lst = new int[10];
        for (int card : hand) {
            lst[card] = lst[card] + 1;
        }

        if (PokerHands.containsFourOfaKind(hand)) {
            System.out.println("Four of a kind!");
        } else if (PokerHands.containsFullHouse(hand)) {
            System.out.println(("Full house!"));
        } else if (PokerHands.containsStraight(hand)) {
            System.out.println("Straight!");
        } else if (PokerHands.containsThreeOfaKind(hand)) {
            System.out.println("Three of a kind!");
        } else if (PokerHands.containsTwoPair(hand)){
            System.out.println("Two Pairs!");
        } else if (PokerHands.containsPair(hand)) {
            System.out.println("Pair!");
        } else {
            System.out.println("High card!");
        }

    }

    public static boolean containsPair(int[] hand) {
        for (int i = 2; i < lst.length; i++) {
            if (lst[i] >= 2) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsTwoPair(int[] hand) {
        int numPairs = 0;
        for (int i = 2; i < lst.length; i++) {
            if (lst[i] >= 2) {
                numPairs++;
                if (numPairs == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean containsThreeOfaKind(int[] hand) {
        for (int i = 2; i < lst.length; i++) {
            if (lst[i] >= 3) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsStraight(int[] hand) {
        int count = 0;
        for (int i = 2; i < lst.length; i++) {
            if (lst[i] > 1) {
                return false;
            } else if (lst[i] == 1) {
                count++;
                if (count == 5) {
                    return true;
                }
            } else {
                count = 0;
            }
        }
        return false;
    }

    public static boolean containsFullHouse(int[] hand) {
        return containsTwoPair(hand) && containsThreeOfaKind(hand);
    }

    public static boolean containsFourOfaKind(int[] hand) {
        for (int i = 2; i < lst.length; i++) {
            if (lst[i] >= 4) {
                return true;
            }
        } return false;

    }
}
