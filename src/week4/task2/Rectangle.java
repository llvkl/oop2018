package week4.task2;

public class Rectangle extends Shape {
    private double widht = 1.0;
    private double length = 1.0;
    public void setWidht(double widht) {
        this.widht = widht;
    }

    public double getWidht() {
        return widht;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void Rectangle(double widht, double length){
        this.widht=widht;
        this.length=length;
    }
    public void Rectangle(double widht,double length,String color, boolean filled){
        this.widht=widht;
        this.length=length;
        this.setColor((color));
        this.setFilled(filled);
    }
    public double getArea(){
        return (widht*length);
    }
    public double getPerimeter(){
        return (widht+length)*2;
    }
    public String toString(){
        return (getWidht()+"\n"+getLength());
    }
}
