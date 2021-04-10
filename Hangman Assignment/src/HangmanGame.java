import java.util.*;

public class HangmanGame {

    public static void main (String[] args) {
        play();
    }

    public static void play(){
        Scanner scanner = new Scanner(System.in);
        HangingMan hangingMan = new HangingMan();
        Puzzle puzzle = new Puzzle();

        while (puzzle.isUnsolved() && hangingMan.isntDead()) {
            hangingMan.show();
            puzzle.show();
            System.out.print("\nMake a guess: ");
            if (!puzzle.makeGuess(scanner.nextLine())) {
                hangingMan.dieSomeMore();
            }
            clearScreen();
        }

        if (hangingMan.isntDead()) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose! The word was " + puzzle.getWord());
        }

        //a replay program
        System.out.println("Do you want to play again? \"y\"/\"n\"");
        //case insensitivity
        if (scanner.nextLine().toLowerCase().equals("y"))play();
    }

    //since there is no way to clear the console in intellij, I have to make many new lines to simulate
    public static void clearScreen() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
}