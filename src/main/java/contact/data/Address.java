package contact.data;

public class Address implements ContactData {
    private String country;
    private String region;
    private String city;
    private String street;
    private int streetNumber;

    public Address(String country, String region, String city, String street, int streetNumber) {
        this.country = country;
        this.region = region;
        this.city = city;
        this.street = street;
        this.streetNumber = streetNumber;
    }

    public void displayDetails() {
        System.out.println(country + ", jud. " + region + ", " + city + ", str. " + street + ", nr. " + streetNumber);
    }
}
