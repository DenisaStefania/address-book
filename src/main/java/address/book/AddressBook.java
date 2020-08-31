package address.book;

import contacts.Contact;

public interface AddressBook {
    void add(Contact contact);

    boolean delete(Contact contact);

    Contact find(String contactName);
}
