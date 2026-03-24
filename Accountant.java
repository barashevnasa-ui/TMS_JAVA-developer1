//@author Aliaksandra_Baranava

public class Accountant implements PrintPosition {
    private String name;

    public Accountant(String name) {this.name = name;}

    public void setName(String name) {this.name = name;}
    public String getName() {return name;}

    public void printPosition() {
        System.out.println(name + ", должность: бухгалтер.");
    }
}
