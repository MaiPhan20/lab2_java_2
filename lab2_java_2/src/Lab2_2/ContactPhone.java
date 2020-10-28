package Lab2_2;

import java.util.ArrayList;

public class ContactPhone {
    private String Phone;
    private ArrayList<Contacts> Contacts;

    public ContactPhone(String myNumber) {
        this.Phone = myNumber;
        this.Contacts = new ArrayList<Contacts>();
    }


    public boolean addNewContact(Contacts contact) {


        if(findContact(contact.getName()) >= 0) {
            System.out.println("Contact is already on file");
        }

        Contacts.add(contact);
        return true;
    }
    public boolean updateContact(Contacts oldContact , Contacts newContact) {
        int foundPosition = findContact(oldContact);
        if(foundPosition < 0) {
            System.out.println(oldContact.getName() + " , was not found");
            return false;
        }

        this.Contacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
        return true;
    }

    public boolean removeContact(Contacts contact) {
        int foundPosition = findContact(contact);
        if(foundPosition < 0) {
            System.out.println(contact.getName() + " , was not found");
            return false;
        }
        this.Contacts.remove(foundPosition);
        System.out.println(contact.getName() + " was deleted");
        return true;
    }


    private int findContact(Contacts contact) {
        return this.Contacts.indexOf(contact);
    }

    private int findContact(String contactName) {
        for(int i =0; i < Contacts.size(); i++) {
            Contacts contacts = this.Contacts.get(i);
            if(contacts.getName().equals(contactName)) {
                return i;
            }
        }
        return 0;
    }

    public String queryContact(Contacts contact) {
        if(findContact(contact) >= 0) {
            return contact.getName();
        }
        return null;
    }

    public Contacts queryContact(String name) {
        int position = findContact(name);
        if(position >=0) {
            return this.Contacts.get(position);
        }
        return null;
    }


    public void printContacts() {
        System.out.println("Contact list");
        for(int i = 0; i < this.Contacts.size(); i++) {
            System.out.println((i+1) + " ." +
                    this.Contacts.get(i).getName() +
                    " -> " + this.Contacts.get(i).getPhoneNumber());
        }
    }

}

