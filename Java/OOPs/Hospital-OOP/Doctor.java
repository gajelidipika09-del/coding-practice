package oops;

public class Doctor extends Person {

    private int doctorId;
    private String specialization;

    // Constructor
    public Doctor(String name, int age, String gender, int doctorId, String specialization) {

        super(name, age, gender);
        this.doctorId = doctorId;
        this.specialization = specialization;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    // Method overriding
    @Override
    public void display() {

        super.display();

        System.out.println("Doctor ID      : " + doctorId);
        System.out.println("Specialization : " + specialization);
    }
}