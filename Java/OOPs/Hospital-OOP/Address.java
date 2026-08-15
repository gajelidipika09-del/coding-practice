package oops;

public class Address {

    private int houseNo;
    private String city;
    private String state;
    private int pincode;

    public int getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public void display() {
        System.out.println("House No : " + houseNo);
        System.out.println("City     : " + city);
        System.out.println("State    : " + state);
        System.out.println("Pincode  : " + pincode);
    }
}