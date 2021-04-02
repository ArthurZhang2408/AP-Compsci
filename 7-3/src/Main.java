public class Main {
    public static void main(String[] args){}

    public static int gcd(int a, int b){
        if (a==b)return a;
        if (a>b)return gcd(a-b, b);
        return gcd(b-a, a);
    }

    public static void printStars(int n){
        for (int i = 0; i < n; i++){
            System.out.print("*");
        }
        System.out.println();
    }

    public static void triangle(int n){
        if (n==0)return;
        printStars(n);
        triangle(n-1);
    }

    public static void reverseTriangle(int n){
        if (n==0)return;
        reverseTriangle(n-1);
        printStars(n);
    }

    public static String reverse(String word){
        if (word.length()<=1)return word;
        return reverse(word.substring(1))+word.charAt(0);
    }

    public static boolean isPalindrome(String word){
        if (word.length()==0||word.length()==1)return true;
        if (word.charAt(0)!=word.charAt(word.length()-1))return false;
        return isPalindrome(word.substring(1, word.length()-1));
    }
}