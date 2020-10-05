import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    }

    public static void secret(){
        Scanner sc = new Scanner(System.in);
        System.out.print("What's the password? ");
        if (sc.nextLine().equals("dragon")){
            System.out.println("Correct! My secret is: I am Batman.");
        }else System.out.println("Incorrect Password! My secret is still safe ...");
    }

    public static void gradeBot(){
        Scanner sc = new Scanner(System.in);
        System.out.print("What was your test out of? ");
        double outOf;
        double score;
        try {
            outOf = Double.parseDouble(sc.nextLine());
            System.out.print("What did you get? ");
            score = Double.parseDouble(sc.nextLine());
        } catch (NumberFormatException e){
            System.out.println("Silly human, that's not possible. Quit joking around.");
            return;
        }
        if (outOf != 0 && score >= 0 && outOf >= score){
            int percent = (int) (200*score/outOf+1)/2;
            System.out.print("You got "+percent+"%! That's a");
            if (percent>85){
                System.out.println("n A ... Average");
            }else if (percent>72){
                System.out.println(" B ... Below average");
            }else if (percent>66){
                System.out.println(" C+ ... Can't eat dinner+");
            }else if (percent>59){
                System.out.println(" C ... Can't eat dinner");
            }else if (percent>49){
                System.out.println(" C- ... Can't eat dinner-");
            }else {
                System.out.println(" F ... Find a new family");
            }
            System.out.println("jkjk. One test doesn't mean anything. Don't feel too good or too bad.");
        }else {
            System.out.println("Silly human, that's not possible. Quit joking around.");
        }
    }

    public static void magic8Ball(){
        String[] answers = {"It is certain.",
                "It is decidedly so.",
                "Without a doubt.",
                "Yes – definitely.",
                "You may rely on it.",
                "As I see it, yes.",
                "Most likely.",
                "Outlook good.",
                "Yes.",
                "Signs point to yes.",
                "Reply hazy, try again.",
                "Ask again later.",
                "Better not tell you now.",
                "Cannot predict now.",
                "Concentrate and ask again.",
                "Don't count on it.",
                "My reply is no.",
                "My sources say no.",
                "Outlook not so good.",
                "Very doubtful"};
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your question? ");
        sc.nextLine();
        System.out.println(answers[(int)(Math.random()*20)]);
    }
}
