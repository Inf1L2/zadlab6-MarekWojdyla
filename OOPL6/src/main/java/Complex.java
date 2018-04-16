
import static java.lang.Math.sqrt;
import java.util.Scanner;

public class Complex {
      public double a;
      public double bi;
        Scanner s = new Scanner(System.in);
        
        public Complex(double a , double bi)
        {
            this.a =a;
            this.bi= bi;
        }
    
    public static double modulLiczby(Complex z)
    {
         return Math.sqrt(Math.pow(z.a, 2) + Math.pow(z.bi, 2));
        
    }        
    public static Complex Sprzezenie(Complex z) {

        return new Complex(z.a, (z.bi) * (-1));

    }

    public static Complex SumaAlg(Complex c1, Complex c2) {

        return new Complex(c1.a + c2.a, c1.bi + c2.bi);

    }


    public static Complex RoznicaAlg(Complex c1, Complex c2) {

        return new Complex(c1.a - c2.a, c1.bi - c2.bi);

    }

    public static Complex IloczynAlg(Complex c1, Complex c2) {

        return new Complex((c1.a * c2.a) - (c1.bi * c2.bi), (c1.a * c2.bi) + (c1.bi * c2.a));

    }

    public static Complex IlorazAlg(Complex c1, Complex c2) {

        return new Complex((c1.a * c2.a + c1.bi * c2.bi) / (c2.a * c2.a + c2.bi * c2.bi), (c1.bi * c2.a - c1.a * c2.bi) / (c2.a * c2.a + c2.bi * c2.bi));

    }

    @Override

    public String toString() {

        return "(" + a + " + " + bi + "i)";

    }



    public static void main(String[] args) {

        Complex z1 = new Complex(7, 3);

        Complex z2 = new Complex(6, -4);

        Complex c1 = new Complex(5, 5);

        Complex c2 = new Complex(2, 2);



        System.out.println("Modul liczby " + z1 + " = " + modulLiczby(z1));

        System.out.println("Sprzezenie liczby " + z2 + " = " + Sprzezenie(z2));

        System.out.println("Suma:\t " + c1 + " + " + c2 + " = " + SumaAlg(c1, c2));

        System.out.println("Roznica:\t " + c1 + " + " + c2 + " = " + RoznicaAlg(c1, c2));

        System.out.println("Iloczyn:\t " + c1 + " + " + c2 + " = " + IloczynAlg(c1, c2));

        System.out.println("Iloraz:\t " + c1 + " + " + c2 + " = " + IlorazAlg(c1, c2));

    }

}
            
    

