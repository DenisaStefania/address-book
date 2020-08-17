package contact.data;

public class Phone implements ContactData {
    private String phoneNumber;

    public Phone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void displayDetails() {
        System.out.println("Phone number : " + phoneNumber);
    }
}
