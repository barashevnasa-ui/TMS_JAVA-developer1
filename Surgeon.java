//@author Aliaksandra_Baranava

public class Surgeon extends Doctor{
    public Surgeon(String name, String position){
        super(name, position);
    }

    @Override
    public void treatment() {
        System.out.println("Лечение хирурга.");
    }
}
