// Program: Address.java, a small class dedicated towards storing user address information
// By: Cameron Beanland
// Date: Oct. 8th, 2024

public class Address {
    private String street;
    private String city;
    private String state;
    private String zip;

    // Constructor accepting all private info regarding user address
    public Address(String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    
    /* ----- GETTERS ----- */
    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }


    /* ----- SETTERS ----- */
    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }


    // Classic return string method
    @Override
    public String toString() {
        return String.format("Street: %s, City: %s, State: %s, ZIP Code: %s", street, city, state, zip);
    }
    
    
}