package address.book;

import contacts.Contact;

import java.util.List;

public class AddressBook implements IAddressBook {
    private List<Contact> contacts;

    public AddressBook(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void add(Contact contact) {
        if(!contacts.contains(contact)) {
            contacts.add(contact);
        }
    }

    public boolean delete(Contact contact) {
        if(contacts.contains(contact)) {
            contacts.remove(contact);
            return true;
        } else {
            return false;
        }
    }

    public Contact find(final String contactName) {
        for (Contact c : contacts) {
            if (c.getName().equalsIgnoreCase(contactName)) {
                return c;
            }
        }
        return null;
    }
}
