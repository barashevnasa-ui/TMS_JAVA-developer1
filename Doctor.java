//@author Aliaksandra_Baranava

public abstract class Doctor {
    String name;
    String position;

    public Doctor(String name, String position){
        this.name = name;
        this.position = position;
    }

    public void setName(String name){this.name = name;}
    public String getName() {return name;}
    public String getPosition() {return position;}
    public void setPosition(String position) {this.position = position;}

    public abstract void treatment();
}
