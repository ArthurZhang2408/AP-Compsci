import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int wins, losses, ties, humanChoice, computerChoice;
    static final String[] choices = new String[]{"rock", "paper", "scissors"};

    public static void main(String[] args) {
        printIntro();
        do {
            getHumanChoice();
            getComputerChoice();
            printChoices();
            calculateWinner();
        } while (wantToPlayAgain());
        printStats();
    }

    public static void printIntro() {
        System.out.println("RPS 1.0\n****************************************\nGood luck, human ...\n");
        wins=0;
        losses=0;
        ties=0;
    }

    public static void getHumanChoice() {
        System.out.print("What do you throw? [1] Rock, [2] Paper, [3] Scissors? ");
        String input = sc.next();
        while (!(input.equals("1")||input.equals("2")||input.equals("3"))){
            System.out.println("Illegal input! [1] Rock, [2] Paper, [3] Scissors? ");
            input = sc.next();
        }
        humanChoice=Integer.parseInt(input);
    }

    public static void getComputerChoice() {
        computerChoice = (int) (Math.random() * 3 + 1);
    }

    public static void printChoices() {
        System.out.println("You threw "+choices[humanChoice-1]+"! I threw "+choices[computerChoice-1]+"!");
    }

    public static void calculateWinner() {
        if (humanChoice == computerChoice) {
            System.out.println("A draw ... pretty good, human!  I demand a rematch ...");
            ties++;
        } else if (humanChoice-computerChoice==-2||humanChoice-computerChoice==1) {
            System.out.println("Whaaa?? ... You beat me?  RAGE!");
            wins++;
        } else {
            System.out.println("I win!  You are not a challenge for me ...");
            losses++;
        }
        System.out.println();
    }

    public static boolean wantToPlayAgain() {
        System.out.print("Play again? [Y,N]: ");
        return sc.next().equals("Y");
    }

    public static void printStats() {
        System.out.println("\nGood game! Thanks for playing.\n****************************************");
        System.out.println("Wins:   " + wins);
        System.out.println("Losses: " + losses);
        System.out.println("Ties:   " + ties);
    }
}
