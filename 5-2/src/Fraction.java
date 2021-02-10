public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(){
        numerator=1;
        denominator=1;
    }

    public Fraction(int numerator, int denominator){
        this.numerator=numerator;
        this.denominator=denominator;
        if (denominator==0){
            System.out.println("Error format, denominator is changed to 1");
            this.denominator=1;
        }
        reduce();
    }

    public Fraction(String fraction){
        try {
            numerator=Integer.parseInt(fraction.substring(0, fraction.indexOf('/')));
            denominator=Integer.parseInt(fraction.substring(fraction.indexOf('/')+1));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error format, fraction is set to default");
            numerator=1;
            denominator=1;
        }
        if (denominator==0){
            System.out.println("Error format, denominator is changed to 1");
            this.denominator=1;
        }
        reduce();
    }

    public Fraction(Fraction f){
        numerator=f.numerator;
        denominator=f.denominator;
    }

    public String toString(){return numerator+"/"+denominator;}
    public Double toDouble(){return numerator*1.0/denominator;}
    public int getNumerator(){return numerator;}
    public int getDenominator(){return denominator;}
    public void setNumerator(int numerator){this.numerator = numerator;reduce();}
    public void setDenominator(int denominator){if(denominator!=0)this.denominator = denominator;reduce();}
    private void reduce(){
        if (numerator==0) {
            denominator=1;
            return;
        }
        int gcf = gcf(numerator, denominator);
        numerator/=gcf;
        denominator/=gcf;
        if (denominator<0){
            numerator*=-1;denominator*=-1;
        }
    }
    private static int gcf(int a, int b){
        if (a==0||b==0)return 1;
        int x = Math.abs(a);
        int y = Math.abs(b);
        while (x!=y){
            if (x>y)x=x-y;
            else y=y-x;
        }
        return x;
    }
    private static int lcm(int a, int b){
        int cf = 1;
        while (gcf(a, b)>1){
            int gcf = gcf(a, b);
            a=a/gcf;
            b=b/gcf;
            cf*=gcf;
        }
        return a*b*cf;
    }

    public static Fraction multiply(Fraction a, Fraction b){
        return new Fraction(a.numerator*b.numerator, a.denominator*b.denominator);
    }

    public static Fraction divide(Fraction a, Fraction b){
        if (b.numerator==0){
            return new Fraction(0, 1);
        }
        return new Fraction(a.numerator*b.denominator, a.denominator*b.numerator);
    }

    public static Fraction add(Fraction a, Fraction b){
        int lcm = lcm(a.denominator, b.denominator);
        return new Fraction(lcm/a.denominator*a.numerator+lcm/b.denominator*b.numerator, lcm);
    }

    public static Fraction subtract(Fraction a, Fraction b){
        int lcm = lcm(a.denominator, b.denominator);
        return new Fraction(lcm/a.denominator*a.numerator-lcm/b.denominator*b.numerator, lcm);
    }
}
