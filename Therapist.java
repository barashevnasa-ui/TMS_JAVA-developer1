//@author Aliaksandra_Baranava
import java.util.Scanner;

public class Therapist extends Doctor{
    public Therapist(String name, String position){
        super(name, position);
    }

    @Override
    public void treatment() {
        System.out.println("Лечение терапевта.");
    }

    public void prescribeTreatment(Patient patient, TreatmentPlan iCode){
        Scanner sc = new Scanner(System.in);
        if(iCode.getiCode() == 1){
            System.out.println("Введите имя хирурга: ");
            String surgeonName = sc.nextLine();
            Surgeon surgeon = new Surgeon(surgeonName, "хирург");
            patient.setDoctor(surgeon);
            surgeon.treatment();
        } else if(iCode.getiCode() == 2){
            System.out.println("Введите имя дантиста: ");
            String dentistName = sc.nextLine();
            Dentist dentist = new Dentist(dentistName, "дантист");
            patient.setDoctor(dentist);
            dentist.treatment();
        } else{
            System.out.println("Введите имя терапевта: ");
            String therapistName = sc.nextLine();
            Therapist therapist = new Therapist(therapistName, "терапевт");
            patient.setDoctor(therapist);
            therapist.treatment();
        }
    }
}
