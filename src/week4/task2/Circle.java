package week4.task2;

public class Circle extends Shape{
    private double radius = 1.0;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void Circle(){};
    public void Circle(double radius){
        this.radius=radius;
    }
    public void Circle(double radius, String color, boolean filled){
        this.radius=radius;
        this.setColor(color);
        this.setColor(filled);
    }
    public double getArea(){};
    public double getPerimeter(){};
    String toString(){
        System.out.println(radius);
    }
}
