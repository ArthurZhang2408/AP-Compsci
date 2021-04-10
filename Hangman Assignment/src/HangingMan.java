public class HangingMan {

    private int numWrongGuesses;
    String[] HangmanImage = {"+----+\n"+
            "|\n"+
            "|\n"+
            "|\n"+
            "/\\\n",

            "+----+\n"+
                    "|    O\n"+
                    "|\n"+
                    "|\n"+
                    "/\\\n",

            "+----+\n"+
                    "|    O\n"+
                    "|    +\n"+
                    "|\n"+
                    "/\\\n",

            "+----+\n"+
                    "|    O\n"+
                    "|    +-\n"+
                    "|\n"+
                    "/\\\n",


            "+----+\n"+
                    "|    O\n"+
                    "|   -+-\n"+
                    "|\n"+
                    "/\\\n",


            "+----+\n"+
                    "|    O\n"+
                    "|   -+-\n"+
                    "|   / \n"+
                    "/\\\n",


            "+----+\n"+
                    "|    O\n"+
                    "|   -+-\n"+
                    "|   / \\\n"+
                    "/\\\n",
    };

    public HangingMan(){numWrongGuesses=0;}

    //check if the hangman is at its last phase
    public boolean isntDead(){
        return numWrongGuesses!=HangmanImage.length;
    }
    
    public void show(){
        System.out.println(HangmanImage[numWrongGuesses]);
    }

    public void dieSomeMore() {
        numWrongGuesses++;
    }
}