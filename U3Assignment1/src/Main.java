public class Main {
    public static void main(String[] args) {
    }

    public static String PPAP(String input){
        String lastWord = "";
        int lastIndex = input.lastIndexOf(" ")+1;
        if (lastIndex!=input.length()){
            lastWord = Character.toUpperCase(input.charAt(lastIndex))+input.substring(lastIndex+1);
        }
        return "Uh! "+lastWord+" "+input.substring(9, input.indexOf(","));
    }

    public static boolean palindrome(String input){
        if (input.length()<2)return true;
        int l = 0;
        int r = input.length()-1;
        while (l<r){
            if (Character.isLetter(input.charAt(l))){
                if (Character.isLetter(input.charAt(r))){
                    if (Character.toLowerCase(input.charAt(l))!=Character.toLowerCase(input.charAt(r)))return false;
                    else{r--;l++;}
                }else r--;
            }else l++;
        }return true;
    }

    public static String toBinary(int n) {
        String answer = "";
        while (n > 0) {
            answer = n%2+answer;
            n = n/2;
        }return answer;
    }

    public static String pigLatin(String input){
        String output = "";
        String[]words = input.split(" ");
        for (String word : words){
            if (word.length()<3)output=output+word+" ";
            else {
                output=output+word.substring(1)+word.substring(0, 1)+"ay ";
            }
        }
        return output.substring(0, output.length()-1);
    }
}
