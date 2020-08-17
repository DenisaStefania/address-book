package contacts;

import contact.data.ContactData;

import java.util.List;
import java.util.Objects;

public class Contact {
    private String name;
    private List<ContactData> data;

    public Contact(String name, List<ContactData> data) {
        this.name = name;
        this.data = data;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(name, contact.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public void displayInfo() {
        System.out.println("Contact name : " + name);
        for (ContactData contactData : data) {
            contactData.displayDetails();
        }
        System.out.print('\n');
    }
}
