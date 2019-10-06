import java.util.ArrayList;
import java.util.Scanner;

public class HighScores {
    public static void main (String[] args) {
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> scores = new ArrayList<>();
        HighScores.initialize(names, scores);
        HighScores.sort(names, scores);
        HighScores.display(names, scores);
    }

    /**
     * Take in user input and store input in two lists.
     * @param names list of input names
     * @param scores list of input scores
     */
    public static void initialize(ArrayList<String> names, ArrayList<Integer> scores) {
        Scanner keyboard = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the name for score #" + (i + 1) + ": ");
            String name = keyboard.nextLine();
            names.add(name);
        }
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter for score for score #" + (i + 1) + ": ");
            int score = keyboard.nextInt();
            scores.add(score);
        }
    }

    /**
     * Sorts names and scores into descending order
     * @param names list of input names
     * @param scores list of input scores
     */
    public static void sort(ArrayList<String> names, ArrayList<Integer> scores) {

        int[] lst = new int[5];
        ArrayList<Integer> tempScores = new ArrayList<>(scores);
        ArrayList<String> tempNames = new ArrayList<>(names);
        for (int i = 0; i < 5; i++) {
            int currentMaxIndex = HighScores.findMaxIndex(scores);
            lst[i] = currentMaxIndex;
            scores.set(currentMaxIndex, Integer.MIN_VALUE);
        }

        names.clear();
        scores.clear();

        for (int num : lst) {
            scores.add(tempScores.get(num));
            names.add(tempNames.get(num));
        }
    }

    public static int findMaxIndex(ArrayList<Integer> lst) {
        int maxIndex = 0;
        for (int i = 1; i < lst.size(); i++) {
            if (lst.get(i) > lst.get(maxIndex)) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    /**
     * Displays names and scores
     * @param names list of input names
     * @param scores list of input scores
     */
    public static void display(ArrayList<String> names, ArrayList<Integer> scores) {
        System.out.println("Top Scorers:");
        for (int i = 0; i < 5; i++) {
            System.out.println((names.get(i)) + ": " + (scores.get(i)));
        }
    }
}
