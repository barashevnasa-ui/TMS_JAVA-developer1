//@author Aliaksandra_Baranava

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainHM7 {
    public static void main(String[] args) {
//Задача 1:
//Создать классы "Директор", "Рабочий", "Бухгалтер". Реализовать интерфейс с методом,
//который печатает название должности и имплементировать этот метод в созданные
//классы.
        System.out.println("Задача 1.");
        Accountant worker1 = new Accountant("Кирилл Чудомирович");
        Worker worker2 = new Worker("Анастасия Фёдоровна");
        Director worker3 = new Director("Илья Никитич");
        worker1.printPosition();
        worker2.printPosition();
        worker3.printPosition();

//Задача 2:
//Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг. Реализовать
//функцию подсчета площади для каждого типа фигуры и подсчет периметра(используя
//абстрактный класс/методы). Создать массив из 5 разных фигур. Вывести на экран сумму
//периметра всех фигур в массиве.
        System.out.println("Задача 2.");
        Figures[] figuresArray = {
                new Rectangle(2d, 3d),
                new Circle(7d),
                new Triangle(3d, 4d, 5d),
                new Rectangle(4.7d, 5.1d),
                new Triangle(7.8d, 1d, 6d)
        };
        Double sum = 0d;
        for(Figures figures : figuresArray){
            sum += figures.calculatePerimeter();
        }
        System.out.println("Сумма периметров: " + sum);

//Задача *:
//Самостоятельно изучить и показать пример работы интерфейса-маркера Cloneable.
        System.out.println("Задача *.");
        Rectangle rectangle1 = new Rectangle(12d, 2d);
        Rectangle rectangle2 = (Rectangle) rectangle1.clone();
        rectangle2.setA(10d);
        System.out.println("Периметр прямоугольника 1: "+rectangle1.calculatePerimeter()+", периметр прямоугольника 2: "+rectangle2.calculatePerimeter());
    }
}