import java.util.Scanner;
/*
* Question 1:
*   a. 0
*   b. 2.0
*   c. 0.25
*   d. Syntax Error
*   e. 0.0
*
* Question 2:
*   double y = 1.0 / 3; || double y = 1 / 3.0;
*
* Question 3:
*   a. 4
*   b. 0.0
*   c. Syntax Error
*   d. 2
*   e. 5
*
* Question 4: |
*            \/
* */

public class Main {
    public static void main(String[] args) {
        AreaToRadius();
        DistFormula();
        MortgageCalculator();
        D6();
    }

    public static void AreaToRadius(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the area of the circle: ");
        System.out.println("The radius is "+Math.sqrt(sc.nextDouble()/Math.PI));
    }

    public static void DistFormula(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the x coordinate of the first point: ");
        double x1 = sc.nextDouble()*1.0;
        System.out.print("Enter the y coordinate of the first point: ");
        double y1 = sc.nextDouble()*1.0;
        System.out.print("Enter the x coordinate of the second point: ");
        double x2 = sc.nextDouble()*1.0;
        System.out.print("Enter the y coordinate of the second point: ");
        double y2 = sc.nextDouble()*1.0;
        System.out.println("The distance between ("+x1+", "+y1+") and ("+x2+", "+y2+") is "+(Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1))));
    }

    public static void MortgageCalculator(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principle: $");
        double p = sc.nextDouble()*1.0;
        System.out.print("Enter the rate: ");
        double r = sc.nextDouble()*1.0;
        System.out.print("Enter the number of years:");
        double n = sc.nextDouble()*1.0;
        System.out.println("The amount in account is $"+p*Math.pow(1+r, n));
    }

    public static void D6(){
        for (int i = 0; i < 10; i ++){
            System.out.print("Dice"+(i+1)+": ");
            System.out.println((int)(Math.random()*6+1));
        }
    }
}
