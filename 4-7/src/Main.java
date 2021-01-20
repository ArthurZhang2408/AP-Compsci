import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        goldbachConjecture(7318);
    }

    public static int sieveOfEratosthenes(int target){
        if (target<3)return -1;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 2; i < target+1; i++){
            list.add(i);
        }
        while (list.size()>1) {
            for (int i = list.size()-1; i > -1; i--) {
                if (list.get(i)%list.get(0)==0)list.remove(i);
            }
        }return list.get(0);
    }

    public static void goldbachConjecture(int evenNum){
        int guess;
        int iteration=evenNum;
        while (true) {
            guess = sieveOfEratosthenes(iteration);
            if (guess<0||guess<evenNum-guess)return;
            if (evenNum-guess==sieveOfEratosthenes(evenNum-guess)){
                System.out.println(guess+" "+(evenNum-guess));
            }iteration=guess-1;
        }
    }
}
