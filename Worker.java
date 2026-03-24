//@author Aliaksandra_Baranava

public class Worker implements PrintPosition {
    private String name;

    public Worker(String name) {this.name = name;}

    public void setName(String name) {this.name = name;}
    public String getName() {return name;}

    public void printPosition(){
        System.out.println(name + ", должность: работник.");
    }
}
