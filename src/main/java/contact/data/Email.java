package contact.data;

public class Email implements ContactData {
    private String emailAddress;

    public Email(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void displayDetails() {
        System.out.println("Email address : " + emailAddress);
    }
}
