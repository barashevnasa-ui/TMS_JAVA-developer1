//@author Aliaksandra_Baranava
import java.lang.reflect.Field;

public class MainHM8 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
//Задача 1:
//Создать программу для имитации работы клиники. Пусть в клинике будет три врача:
//хирург, терапевт и дантист. Каждый врач имеет метод «лечить», но каждый врач лечит
//по-своему. Так же предусмотреть класс «Пациент» с полем «План лечения» и полем
//«Доктор». Создать объект класса «Пациент» и добавить пациенту план лечения. У
//терапевта создать метод, который будет назначать врача пациенту согласно плану
//лечения:
//Если план лечения имеет код 1 – назначить хирурга и выполнить метод лечить.
//Если план лечения имеет код 2 – назначить дантиста и выполнить метод лечить.
//Если план лечения имеет любой другой код – назначить терапевта и выполнить метод
//лечить.
        System.out.println("Задача 1.");
        Therapist doctor = new Therapist("Самуйлик Лизавета", "терапевт");
        TreatmentPlan treatmentPlan1 = new TreatmentPlan(1);
        TreatmentPlan treatmentPlan2 = new TreatmentPlan(2);
        TreatmentPlan treatmentPlan3 = new TreatmentPlan(3);

        Patient patient1 = new Patient("Рудецкая Анна", doctor, treatmentPlan1);
        doctor.prescribeTreatment(patient1, patient1.getTreatmentPlan());
        patient1.displayInfo();
        Patient patient2 = new Patient("Асташкевич Анна", doctor, treatmentPlan2);
        doctor.prescribeTreatment(patient2, patient2.getTreatmentPlan());
        patient2.displayInfo();
        Patient patient3 = new Patient("Ахременко Арина", doctor, treatmentPlan3);
        doctor.prescribeTreatment(patient3, patient3.getTreatmentPlan());
        patient3.displayInfo();
        Patient patient4 = new Patient("Кот Ярослав", doctor, treatmentPlan1);
        doctor.prescribeTreatment(patient4, patient4.getTreatmentPlan());
        patient4.displayInfo();

//Задача *:
// Создать класс Apple и добавить в него поле color с модификатором доступа private и
//инициализировать его. В методе main другого класса создать объект Apple, и не
//используя сеттеры изменить значение поля color.
        System.out.println("Задача *.");
        Apple apple = new Apple();
        Field field = Apple.class.getDeclaredField("color");
        field.setAccessible(true);
        field.set(apple, "green");
        String value = (String) field.get(apple);
        System.out.println(value);
    }
}