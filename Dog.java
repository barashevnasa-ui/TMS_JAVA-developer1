//@author Aliaksandra_Baranava

public class Dog extends Animal{
    private static Dog INSTANCE;

    private Dog(){}

    //возвращает созданный объект
    public static Dog getInstance() {
        if (INSTANCE == null) {
            //синхронизация для потокобезопасности
            synchronized (Dog.class) {
                //ленивая инициализация (объект создаётся, если нужно, а не сразу при запуске)
                if (INSTANCE == null) {
                    INSTANCE = new Dog();
                }
            }
        }
        return INSTANCE;
    }

    @Override
    public void voice() {
        System.out.println("Собака гавкает.");
    }

    @Override
    public void eat(String food) {
        if(food.equalsIgnoreCase(FoodOptions.CARROT) ||
           food.equalsIgnoreCase(FoodOptions.CEREAL) ||
           food.equalsIgnoreCase(FoodOptions.MEAT) ||
           food.equalsIgnoreCase(FoodOptions.FISH)){
            System.out.println(food + " нравится собаке.");
        } else if(food.equalsIgnoreCase(FoodOptions.GRASS) || food.equalsIgnoreCase(FoodOptions.SWEET)){
            System.out.println("Собака такое не любит есть.");
        } else{
            System.out.println("Такой опции нет.");
        }
    }
}
