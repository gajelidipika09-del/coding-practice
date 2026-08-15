package oops;

public class Hospital {

    private String hospitalName;

    // HAS-A relationship
    private Patient patient;
    private Doctor doctor;

    // Constructor
    public Hospital(String hospitalName, Patient patient, Doctor doctor) {
        this.hospitalName = hospitalName;
        this.patient = patient;
        this.doctor = doctor;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public Patient getPatient() {
        return patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void admitPatient() {
        System.out.println("Patient " + patient.getName()
                + " admitted successfully.");
    }

    public void dischargePatient() {
        System.out.println("Patient " + patient.getName()
                + " discharged successfully.");
    }

    public void displayDetails() {

        System.out.println("\n===== HOSPITAL DETAILS =====");
        System.out.println("Hospital : " + hospitalName);

        System.out.println("\n----- Patient Details -----");
        patient.display();

        System.out.println("\n----- Patient Address -----");
        patient.getAddress().display();

        System.out.println("\n----- Doctor Details -----");
        doctor.display();
    }

    public static void main(String[] args) {

        // Creating Patient using constructor
        Patient p1 = new Patient(
                "Dipika",
                21,
                "Female",
                54,
                "Fever"
        );

        // Creating Doctor using constructor
        Doctor d1 = new Doctor(
                "Karthik",
                43,
                "Male",
                21,
                "Neurosurgeon"
        );

        // Setting Patient's Address
        p1.getAddress().setHouseNo(39);
        p1.getAddress().setCity("Solapur");
        p1.getAddress().setState("Maharashtra");
        p1.getAddress().setPincode(413002);

        // Creating Hospital
        Hospital h1 = new Hospital(
                "Civil Hospital",
                p1,
                d1
        );

        h1.admitPatient();

        h1.displayDetails();

        // Runtime Polymorphism
        System.out.println("\n===== RUNTIME POLYMORPHISM =====");

        Person person1 = p1;
        Person person2 = d1;

        person1.display();
        System.out.println("--------------------");
        person2.display();

        h1.dischargePatient();
    }
}