//@author Aliaksandra_Baranava

public class Patient {
    private String name;
    private Doctor doctor;
    private TreatmentPlan treatmentPlan;

    public Patient(String name, Doctor doctor, TreatmentPlan  treatmentPlan){
        this.name = name;
        this.doctor = doctor;
        this.treatmentPlan = treatmentPlan;
    }

    public void setDoctor(Doctor doctor) {this.doctor = doctor;}
    public void setName(String name) {this.name = name;}
    public void setTreatmentPlan(TreatmentPlan treatmentPlan) {this.treatmentPlan = treatmentPlan;}

    public Doctor getDoctor() {return doctor;}
    public String getName() {return name;}
    public TreatmentPlan getTreatmentPlan() {return treatmentPlan;}

    public void displayInfo(){
        System.out.println("ФИО пациента: " + name);
        System.out.println("Врач: " + doctor.position + ", " + doctor.name);
    }
}
