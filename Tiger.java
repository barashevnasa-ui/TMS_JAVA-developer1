//@author Aliaksandra_Baranava

public class Tiger extends Animal{
    @Override
    public void voice() {
        System.out.println("Тигр рычит.");
    }

    @Override
    public void eat(String food) {
        if(food.equalsIgnoreCase(FoodOptions.MEAT) || food.equalsIgnoreCase(FoodOptions.FISH)){
            System.out.println(food + " нравится тигру.");
        } else if(food.equalsIgnoreCase(FoodOptions.GRASS) ||
                 food.equalsIgnoreCase(FoodOptions.CARROT) ||
                 food.equalsIgnoreCase(FoodOptions.CEREAL) ||
                 food.equalsIgnoreCase(FoodOptions.SWEET)){
            System.out.println("Тигр такое не любит есть.");
        } else {
            System.out.println("Такой опции нет.");
        }
    }
}
