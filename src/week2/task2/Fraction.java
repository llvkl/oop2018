package week2.task2;

public class Fraction {

    // TODO: khai báo các thuộc tính
    private int numerator;
    private int denominator;
    public Fraction(int numerator, int denominator) {

        this.numerator=numerator;
        this.denominator=denominator;
    }

    public Fraction add(Fraction other) {
        Fraction add = new Fraction(this.numerator*other.denominator + other.numerator*this.denominator, this.denominator*other.denominator);
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        return add;
    }

    public Fraction subtract(Fraction other) {
        Fraction subtract = new Fraction(this.numerator*other.denominator - other.numerator*this.denominator, this.denominator*other.denominator);
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        return subtract;
    }

    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction multiply = new Fraction(this.numerator*other.numerator, this.denominator*other.denominator);
        toigian();
        return multiply;
    }

    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction divine = new Fraction(this.numerator*other.denominator, this.denominator*other.numerator);
        return divine;
    }
    public Fraction toigian(){
        Fraction a = new Fraction(this.numerator, this.denominator);
        if(this.numerator == 0){
            a.numerator = 0;
            a.denominator = 1;
        }
        else if(this.numerator >= this.denominator){
            for(int i=this.denominator; i>1; i--){
                if(this.denominator % i == 0){
                    a.numerator = this.numerator / i;
                    a.denominator = this.denominator / i;
                    break;
                }
            }
        }
        else{
            for(int i=this.numerator; i>1; i--){
                if(this.numerator % i == 0 && this.denominator % i == 0){
                    a.numerator = this.numerator / i;
                    a.denominator = this.denominator / i;
                    break;
                }
            }
        }
        return a;
    }

    public boolean equals(Fraction a){
        return (this.toigian().numerator == a.toigian().numerator && this.toigian().denominator == a.toigian().denominator);
    }
    public void println(){
        System.out.println(this.numerator + "/" + this.denominator);
    }
    public static void main (String[] args){
        Fraction a = new Fraction(10,20);
        Fraction b = new Fraction(11,12);
        System.out.println("a+b");
        a.add(b).println();
        System.out.println("a-b");
        a.multiply(b).toigian().println();
        System.out.println("a*b");
        a.subtract(b).toigian().println();
        System.out.println("a/b");
        a.divide(b).println();
        System.out.println(a.equals(b));
    }


}
