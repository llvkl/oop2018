package week2.task2;

public class Fraction {

    // TODO: khai báo các thuộc tính
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
        this.numerator=numerator;
        this.denominator=denominator;
    }

    public Fraction add(Fraction other) {
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction add = new Fraction(this.numerator*other.denominator+other.numerator+this.denominator,this.denominator*other.denominator);
        return add;
    }

    public Fraction subtract(Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction subtract = new Fraction(this.numerator*other.denominator-other.numerator+this.denominator,this.denominator*other.denominator);
        return subtract;
    }

    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction multiply = new Fraction(this.numerator*other.numerator,this.denominator*other.denominator);
        return multiply;
    }

    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction divide = new Fraction(this.numerator*other.denominator, this.denominator*other.numerator);
        return divide;
    }


//    public boolean equals(Fraction other){
//        return (this.numerator == other.numerator && this.denominator == other.denominator);
//  }
    public void out(){
        System.out.println(this.numerator + "/" +this.denominator);
    }

    public static void main(String[] args){
        Fraction a = new Fraction(11, 22);
        Fraction b = new Fraction(33, 44);
        a.add(b).out();
        a.subtract(b).out();
        a.multiply(b).out();
        a.divide(b).out();
    }


}
