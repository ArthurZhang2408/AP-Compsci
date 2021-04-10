import java.util.ArrayList;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Puzzle{
    //list of all words
    private ArrayList<String> words;
    //the word randomly selected
    private String word;
    //all the guesses that the play took
    private ArrayList<String> guesses;
    //a list to dynamically display the letters that are correctly guessed
    private String [] puzzle;

    public Puzzle(){
        words=new ArrayList<>();
        guesses=new ArrayList<>();
        try {
            Scanner scan = new Scanner(new File("words.txt"));
            while (scan.hasNext()){
                String temp = scan.next();
                //filtrating out the capitalized words
                if (Character.isLowerCase(temp.charAt(0))) words.add(temp);
            }
            scan.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //randomly selecting the word
        word = words.get((int)(Math.random()*words.size())).toUpperCase();
        //starting with _'s
        puzzle=new String[word.length()];
        Arrays.fill(puzzle, "_");
    }

    public void show() {
        System.out.print("Puzzle: ");
        //displaying the player's progress of guessing
        for (int i = 0; i < word.length(); i++){
            System.out.print(puzzle[i]+" ");
        }
        //displaying the guesses taken
        System.out.print("\n\nGuesses: ");
        //only guesses before the last one are followed by a comma
        for (int i = 0; i < guesses.size()-1; i++){
            System.out.print(guesses.get(i)+", ");
        }
        //last guess
        if (guesses.size()>0)System.out.print(guesses.get(guesses.size()-1));
    }

    public boolean isUnsolved() {
        //check if there are undetermined letters
        for (int i = 0; i < puzzle.length; i++){
            if (puzzle[i].equals("_"))return true;
        }return false;
    }

    public boolean makeGuess(String guess) {
        //case insensitivity
        guess=guess.toUpperCase();
        //if the input has a length of more than one, or the input is not a letter (determined by whether changing the case affects the string), return
        if (guess.length()>1||guess.equals(guess.toLowerCase())){
            System.out.println("Invalid Input");
            return false;
        }
        //check if the guess is already taken
        if (!guesses.contains(guess))guesses.add(guess);
        //if so, return true to keep the hangman from dying some more since the wrong guess has already been punished
        else return true;
        //check if the guess is correct
        for (int i = 0; i < word.length(); i++){
            if (word.charAt(i)==guess.charAt(0)){
                //if so, check if there are more same letters
                for (int j = i; j < word.length(); j++){
                    //if so, reveal it in the progress display
                    if (word.charAt(j)==guess.charAt(0)){
                        puzzle[j]=guess;
                    }
                }
                return true;
            }
        }return false;
    }

    public String getWord() {
        return word;
    }
}