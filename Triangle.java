//@author Aliaksandra_Baranava

public class Triangle extends Figures{
    private Double a;
    private Double b;
    private Double c;

    public Triangle(Double a, Double b, Double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(Double a) {this.a = a;}
    public void setB(Double b) {this.b = b;}
    public void setC(Double c) {this.c = c;}
    public double getA(){return a;}
    public double getB(){return b;}
    public double getC(){return c;}

    public Double calculateArea(){
        Double p = (a + b + c)/2;
        Double area = Math.sqrt(p*(p - a)*(p - b)*(p - c));
        return area;
    }

    public Double calculatePerimeter(){
        double perimeter = a + b + c;
        return perimeter;
    }
}
