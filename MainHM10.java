//@author Aliaksandra_Baranava

import java.util.Scanner;
import java.lang.String;

public class MainHM10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/*        Задача 1:
        Создать класс для описания пользователя системы. Переопределить в классе методы
        toString,hashcode и equals. Создать несколько экземпляров класса с одним и тем же
        значением полей и сравнить с помощью метода equals.*/
        System.out.println("Задача 1.");
        Region region1 = new Region("Belarus", "russian", 3);
        Region region2 = new Region("Canada", "english", -4);
        SystemUser user1 = new SystemUser(1, "1234", "Case", "375293337778", region1);
        SystemUser user2 = new SystemUser(2, "1234", "Case", "375293337778", region1);
        if(user1.equals(user2)){
            System.out.println("Это два идентичных аккаунта.");
        } else System.out.println("Это два разных аккаунта.");

/*        Задача *:
        Создать программу для реализации поверхностного и глубокого клонирования объекта
        класса User. Пусть на вход программе будет передаваться тип операции клонирования
        (поверхностное клонирование или глубокое), а также id юзера для клонирования.*/
        System.out.println("Задача *.");
        SystemUser [] usersArray = {
                new SystemUser(3, "12345", "Isaak","375293336000", region1),
                new SystemUser(4, "56789", "User_1507", "pochta@mail.ru", region1),
                new SystemUser(5, "1000_1001", "H_i", "375443331116", region2),
                new SystemUser(6, "BadPassword01", "BadGuy01", "bad_mail@gmail.com", region2),
                new SystemUser(7, "375293336666", "GrannyAnna", "37529333666", region2)
        };
        System.out.println("ID для клонирования: ");
        Integer requiredID = sc.nextInt();
        sc.nextLine();
        System.out.println("Тип клонирования: ");
        String option = sc.nextLine();

        for(SystemUser user: usersArray){
            if(requiredID.equals(user.getID())){
                try {
                    SystemUser usersClone = user.clone(option);
                    System.out.println("Новый пользователь: ");
                    System.out.println(usersClone.toString());
                } catch (CloneNotSupportedException e) {
                    System.out.println("Ошибка клонирования.");
                }
            }
        }
    }
}