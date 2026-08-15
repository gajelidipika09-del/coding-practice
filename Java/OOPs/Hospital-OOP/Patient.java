package oops;

public class Patient extends Person {

    // HAS-A relationship
    private Address address = new Address();

    private int patientId;
    private String symptoms;

    // Constructor
    public Patient(String name, int age, String gender,
                   int patientId, String symptoms) {

        // Calling Person constructor
        super(name, age, gender);

        this.patientId = patientId;
        this.symptoms = symptoms;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public Address getAddress() {
        return address;
    }

    // Method overriding
    @Override
    public void display() {

        // Call Person's display()
        super.display();

        System.out.println("Patient ID : " + patientId);
        System.out.println("Symptoms   : " + symptoms);
    }
}