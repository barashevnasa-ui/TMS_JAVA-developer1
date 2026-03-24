//@author Aliaksandra_Baranava

public class Rectangle extends Figures implements Cloneable{
    private Double a;
    private Double b;

    public Rectangle(Double a, Double b){
        this.a = a;
        this.b = b;
    }

    public Rectangle(Rectangle rectangle){
        this(rectangle.getA(), rectangle.getB());
    }

    public void setA(Double a) {this.a = a;}
    public void setB(Double b) {this.b = b;}
    public Double getA(){return a;}
    public Double getB(){return b;}

    public Double calculateArea(){
        double area = a*b;
        return area;
    }

    public Double calculatePerimeter(){
        double perimeter = 2*(a + b);
        return perimeter;
    }

    public Rectangle clone() {
        return new Rectangle(this); // используем ваш копирующий конструктор
    }
}
