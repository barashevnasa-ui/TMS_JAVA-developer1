//@author Aliaksandra_Baranava

import java.util.Scanner;

public class MainHM9 {
    public static void main(String[] args) {
        /*Задача 1:
        Создать логически верную иерархию следующих классов: Animal, Dog, Tiger, Rabbit.
        Переопределить методы voice(), eat(String food) чтобы они выводили верную
        информацию. Метод eat может принимать “Meat”, “Grass” и другие строки.
        Например, если мы создадим объект класса Rabbit, вызовем метод eat() и передадим
        туда “Grass” он должен написать в консоли что любит есть травку. Если передадим “Meat”
        или другую строку то он будет недоволен.*/

         /*Задача *:
        Написать такой конструктор, который запретит создание объекта класса Dog в других
        классах; Найти способ вызывать методы voice(), eat() класса Dog, который позволит
        обойти ограничение, наложенное конструктором выше. Объяснить, как работают оба
        способа.*/

        System.out.println("Задача 1, задача *.");
        Dog dog = Dog.getInstance();
        Rabbit rabbit = new Rabbit();
        Tiger tiger = new Tiger();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите еду для собаки: ");
        String dogFood = sc.nextLine();
        dog.eat(dogFood);
        System.out.println("Введите еду для кролика: ");
        String rabbitFood = sc.nextLine();
        rabbit.eat(rabbitFood);
        System.out.println("Введите еду для тигра: ");
        String tigerFood = sc.nextLine();
        tiger.eat(tigerFood);
        dog.voice();
    }
}