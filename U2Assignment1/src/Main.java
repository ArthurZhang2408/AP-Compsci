import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Main {
    public static void main(String[] args) {
    }

    public static int multiplesOf3And5(int limit){
        int sum = 0;
        for (int i = 3; i<limit; i+=3)sum+=i;
        for (int i = 5; i<limit; i+=5)if(i%3!=0)sum+=i;
        return sum;
    }

    public static int evensOfFibonacci(int limit){
        if (limit<2)return 0;
        if (limit<3)return 2;
        int sum = 2;
        int fNum = 1;
        int sNum = 2;
        while (true){
            sNum = fNum+sNum;
            if (sNum>limit)break;
            fNum = sNum-fNum;
            sum = (sNum%2==0)?sum+sNum:sum;
        }
        return sum;
    }

    public static int difference(int limit){
        int sum = 0;
        for (int i = 1; i<=limit; i++){
            sum+=i;
        }
        int squares = 0;
        for (int i = 1; i<=limit; i++){
            squares+=i*i;
        }
        return sum*sum-squares;
    }

    public static int triplets(int sum){
        for (int a = 1; a<sum-1; a++){
            for (int b = 1; b<sum-a; b++){
                if (a*a+b*b==(sum-a-b)*(sum-a-b))return a*b*(sum-a-b);
            }
        }return -1;
    }

    @Test
    public void multiplesOf3And5Test(){
        assertEquals(multiplesOf3And5(10), 23);
        assertEquals(multiplesOf3And5(1000), 233168);
    }

    @Test
    public void evensOfFibonacciTest(){
        assertEquals(evensOfFibonacci(-1), 0);
        assertEquals(evensOfFibonacci(90), 44);
        assertEquals(evensOfFibonacci(4000000), 4613732);
    }

    @Test
    public void differenceTest(){
        assertEquals(difference(10), 2640);
        assertEquals(difference(100), 25164150);
    }

    @Test
    public void tripletTest(){
        assertEquals(triplets(12), 60);
        assertEquals(triplets(1000), 31875000);
    }
}
