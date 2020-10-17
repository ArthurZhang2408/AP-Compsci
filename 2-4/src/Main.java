import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    }

    public static void Exercise1(){
        int i = 100;
        while(i>=10){
            System.out.println("i is: "+i);
            i--;
        }
    }

    /*
    * Exercise2:
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
1 2 3 4 5 6 7
1 2 3 4 5 6 7 8
1 2 3 4 5 6 7 8 9
1 2 3 4 5 6 7 8 9 10
    * */

    public static void RunningTally(){
        //the while loop way
        System.out.println("Let's add some numbers! [Type a negative number to quit]");
        Scanner sc = new Scanner(System.in);
        int output = 0;
        while (true){
            System.out.print("Add: ");
            int input = sc.nextInt();
            if (input<0)break;
            output+=input;
        }
        System.out.print("Your total is "+output);
    }

    public static void Bar(){
        Scanner sc = new Scanner(System.in);
        System.out.print("What character do you want your bar made of? ");
        String c = sc.nextLine();
        System.out.print("How long do you want your bar? ");
        int length = sc.nextInt();
        for (int i = 0; i < length; i ++){
            System.out.print(c);
        }
    }

    public static void Triangle(){
        Scanner sc = new Scanner(System.in);
        System.out.print("What character do you want your triangle made of? ");
        String s = sc.next();
        System.out.print("How tall do you want your triangle? ");
        int height = sc.nextInt();
        System.out.println("\nHere's your triangle!\n");
        for (int i = 0; i < height; i++){
            for (int j = 0; j <= i; j++){
                System.out.print(s);
            }
            System.out.println();
        }
    }

    public static void D6(){
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("How many D6's do you want to roll? ");
            int num = sc.nextInt();
            int sum = 0;
            System.out.print("You rolled: ");
            for (int i = 0; i < num; i++) {
                int d = (int) (Math.random() * 6 + 1);
                System.out.print(d + " ");
                sum += d;
            }
            System.out.print("\nTotal: " + sum + "\n\nAgain? [y,n] ");
        } while (!"n".equals(sc.next()));
    }

    public static void GuessingGame(){
        int tries = 0;
        Scanner sc = new Scanner(System.in);
        int num = (int) (Math.random() * 100 + 1);
        System.out.println("I've picked a random number between 1 and 100.  Try to guess it!");
        while (true) {
            System.out.print("What is your guess? ");
            int guess = sc.nextInt();
            tries++;
            if (guess == num) {
                System.out.println("You've guessed my number! Good job!  It only took you " + tries + " tries.");
                break;
            }
            System.out.println((guess > num) ? "Too high ..." : "Too low ...");
        }
    }
}
