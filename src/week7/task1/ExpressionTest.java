package week7.task1;

public class ExpressionTest {
    public static void main(String arg[]){
        Numeral a = new Numeral(2);
        Numeral b = new Numeral(3);
        Numeral c = new Numeral(-1);
        Numeral d = new Numeral(10);
        Numeral e = new Numeral(0);
        Square a1 = new Square(d);
        Addition a2 = new Addition(a1,c);
        Addition a3 = new Addition(a2, new Addition(b,b));

        Subtraction a4 = new Subtraction(d,a);
        Multiplication a5 = new Multiplication(a,b);
        Division a6 = new Division(d,a);
        Division a7 = new Division(d,e);
        System.out.println(a5.right.evaluate());
        System.out.println(new Square(a3).evaluate());
        System.out.println(a4.evaluate());
        System.out.println(a5.evaluate());
        System.out.println(a6.evaluate());
        try{
            System.out.println(a7.evaluate());
        }
        catch (ArithmeticException e1){
            System.out.println("loi chia cho 0");
        }
    }
}
