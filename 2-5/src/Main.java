import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    }

    /*
    * Question1:
    * Old MacDonald had a farm, EE-I-EE-I-O,
    * And on that farm he had a cow, EE-I-EE-I-O,
    * With a moo moo here and a moo moo there
    * Here a moo, there a moo, everywhere a moo moo
    * Old MacDonald had a farm, EE-I-EE-I-O.
    *
    * Old MacDonald had a farm, EE-I-EE-I-O,
    * And on that farm he had a dog, EE-I-EE-I-O,
    * With a woof woof here and a woof woof there
    * Here a woof, there a woof, everywhere a woof woof
    * Old MacDonald had a farm, EE-I-EE-I-O.
    *
    * Question2:
    * verse("duck", "quacks");
    *
    * Question3:
    * No, I wug.
    * You wugga wug.
    * I wug.
    *
    * Question4:
    * Ping
    * Baffle
    * Zoop
    * main
    *
    * Question5:
    * stackoverflow
    *
    * Question6:|
    *          \/
    * */
    public static void displayBox(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("$");
            }
            System.out.println();
        }
    }


    public static void D6(){
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("How many D6's do you want to roll? ");
            int num = sc.nextInt();
            System.out.print("How many sides do these dice have? ");
            int sides = sc.nextInt();
            int sum = 0;
            System.out.print("You rolled: ");
            for (int i = 0; i < num; i++) {
                int d = roll(sides);
                System.out.print(d + " ");
                sum += d;
            }
            System.out.print("\nTotal: " + sum + "\n\nAgain? [y,n] ");
        } while (!"n".equals(sc.next()));
    }

    private static int roll(int sides){
        return (int) (Math.random() * sides + 1);
    }
}
