package lesson_8.phoneBook;

public class phoneBook {
    Contacts[] contact = new Contacts[100];

    public phoneBook() {
    }

    public Contacts[] getContact() {
        return contact;
    }

    public void setContacts(Contacts[] contacts) {
        this.contact = contacts;
    }

    public void addContact(Contacts contacts) {
        for (int i = 0; i < contact.length; i++) {
            if (contact[i] == null) {
                contact[i] = contacts;
                break;
            }


        }
    }
}
