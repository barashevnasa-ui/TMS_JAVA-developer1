//@author Aliaksandra_Baranava

public class Rabbit extends Animal{
    @Override
    public void voice() {
        System.out.println("Кролик мурлычет.");
    }

    @Override
    public void eat(String food) {
        if(food.equalsIgnoreCase(FoodOptions.CARROT) ||
           food.equalsIgnoreCase(FoodOptions.CEREAL) ||
           food.equalsIgnoreCase(FoodOptions.GRASS)){
            System.out.println(food + " нравится кролику.");
        } else if(food.equalsIgnoreCase(FoodOptions.SWEET) ||
                  food.equalsIgnoreCase(FoodOptions.FISH) ||
                  food.equalsIgnoreCase(FoodOptions.MEAT)){
            System.out.println("Кролик такое не любит есть.");
        } else{
            System.out.println("Такой опции нет.");
        }
    }
}
