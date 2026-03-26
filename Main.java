//@author Aliaksandra_Baranava

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Задача 1:
        //Создать класс CreditCard c полями номер счета, текущая сумма на счету. Добавьте
        //метод, который позволяет начислять сумму на кредитную карточку. Добавьте метод,
        //который позволяет снимать с карточки некоторую сумму. Добавьте метод, который
        //выводит текущую информацию о карточке. Напишите программу, которая создает три
        //объекта класса CreditCard у которых заданы номер счета и начальная сумма.
        //Тестовый сценарий для проверки: Положите деньги на первые две карточки и снимите с
        //третьей. Выведите на экран текущее состояние всех трех карточек.
        System.out.println("Задание 1.");
        CreditCard Card1 = new CreditCard(1234567890l,12.8d);
        Card1.displayInfo();
        double summ1;
        do {
            System.out.println("Введите сумму, которую хотите положить на счёт 1: ");
            summ1 = sc.nextDouble();
            if(summ1 < 0){
                System.out.println("Сумма должна быть положительной!");
            }
        } while(summ1 < 0);
        Card1.addMoney(summ1);
        Card1.displayInfo();

        CreditCard Card2 = new CreditCard(987654321l, 70d);
        Card2.displayInfo();
        double summ2;
        do {
            System.out.println("Введите сумму, которую хотите положить на счёт 2: ");
            summ2 = sc.nextDouble();
            if(summ2 < 0){
                System.out.println("Сумма должна быть положительной!");
            }
        } while(summ2 < 0);
        Card2.addMoney(summ2);
        Card2.displayInfo();

        CreditCard Card3 = new CreditCard(135792468l, 8.95d);
        Card3.displayInfo();
        double summ3;
        do {
            System.out.println("Введите сумму, которую хотите снять со счёта 3: ");
            summ3 = sc.nextDouble();
            if(summ3 < 0){
                System.out.println("Сумма должна быть положительной!");
            }
        } while(summ3 < 0);
        Card3.subtractMoney(summ3);
        Card3.displayInfo();

        //Задача *:
        //Создать класс, описывающий банкомат. Набор купюр, находящихся в банкомате, должен
        //задаваться тремя свойствами: количеством купюр номиналом 20, 50 и 100. Сделать
        //метод для добавления денег в банкомат. Сделать функцию, снимающую деньги, которая
        //принимает сумму денег, а возвращает булевое значение - успешность выполнения
        //операции. При снятии денег, функция должна распечатывать каким количеством купюр
        //какого номинала выдаётся сумма. Создать конструктор с тремя параметрами -
        //количеством купюр каждого номинала.
        System.out.println("Задание *.");
        ATM Atm  = new ATM(100, 100, 100);
        Atm.displayInfo();
        Atm.putMoney(10, 10, 0);
        Atm.displayInfo();
        System.out.println("Введите сумму, которую хотите снять: ");
        int takeMoneyAmount = sc.nextInt();
        Atm.withdrawMoney(takeMoneyAmount);
        Atm.displayInfo();
    }
}