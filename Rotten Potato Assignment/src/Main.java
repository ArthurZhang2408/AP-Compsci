public class Main {

    public static void main(String[] args) {

        int[][] ratings = { {4,6,2,5},
                {7,9,4,8},
                {6,9,3,7} };

        System.out.println("Movie zero's average rating: " + movieAvgRating(ratings, 0));
        System.out.println("Movie one's average rating: " + movieAvgRating(ratings, 1));
        System.out.println("Reviewer zero's average rating: " + reviewerAvgRating(ratings, 0));
        System.out.println("Reviewer one's average rating: " + reviewerAvgRating(ratings, 1));
        System.out.println("Average rating for all movies in 2018: " + avgRating2018(ratings));
        System.out.println("Hardest reviewer is #" + hardestReviewer2018(ratings));
        System.out.println("Worst movie is #" + worstMovie2018(ratings));
    }

    //Question 1
    public static int movieAvgRating(int[][] ratings, int movie) {
        int sum = 0;
        for (int i = 0; i < ratings.length; i++){
            sum+=ratings[i][movie];
        }return sum/ratings.length;
    }

    //Question 2
    public static int reviewerAvgRating(int[][] ratings,int reviewer) {
        int sum = 0;
        for (int i = 0; i < ratings[reviewer].length; i++){
            sum+=ratings[reviewer][i];
        }return sum/ratings[reviewer].length;
    }

    //Question 3
    public static int avgRating2018(int[][] ratings) {
        int sum = 0;
        for (int i = 0; i < ratings.length; i++){
            for (int j = 0; j < ratings[0].length; j++){
                sum+=ratings[i][j];
            }
        }return sum/ratings.length/ratings[0].length;
    }

    //Question 4
    public static int hardestReviewer2018(int[][] ratings) {
        if (ratings.length<2)return 0;
        int index = 0;
        int lowest = reviewerAvgRating(ratings, 0);
        for (int i = 1; i < ratings.length; i++){
            if (reviewerAvgRating(ratings, i)<lowest) {
                lowest = reviewerAvgRating(ratings, i);index = i;
            }
        }return index;
    }

    //question 5
    public static int worstMovie2018(int[][] ratings) {
        if (ratings[0].length<2)return 0;
        int index = 0;
        int lowest = movieAvgRating(ratings, 0);
        for (int i = 1; i < ratings[0].length; i++){
            if (movieAvgRating(ratings, i)<lowest) {
                lowest = movieAvgRating(ratings, i);index = i;
            }
        }return index;
    } 
}