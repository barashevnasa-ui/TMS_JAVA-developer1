//@author Aliaksandra_Baranava

public class Circle extends Figures{
    private Double radius;

    public Circle(Double radius){ this.radius = radius; }

    public void setB(Double radius) {this.radius = radius;}
    public Double getRadius() { return radius; }

    public Double calculateArea(){
        double area = 3.14*Math.pow(radius, 2);
        return area;
    }

    public Double calculatePerimeter(){
        double perimeter = 2*3.14*radius;
        return perimeter;
    }
}
