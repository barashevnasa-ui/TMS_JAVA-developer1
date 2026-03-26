//@author Aliaksandra_Baranava

public class Dentist extends Doctor{
    public Dentist(String name, String position){
        super(name, position);
    }

    @Override
    public void treatment() {
        System.out.println("Лечение дантиста.");
    }
}
