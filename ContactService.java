import java.util.HashMap;
import java.util.Map;
public class ContactService {
	
	 // A map to store contacts using contact ID as the key
    private Map<String, Contact> contactids;

    // Constructor to initialize the contact map
    public ContactService() {
        contactids = new HashMap<>();
    }

    // Method to add a new contact
    public void addContact(Contact contact) {
        // Check if contact ID already exists
        if (contactids.containsKey(contact.getContactID())) {
            throw new IllegalArgumentException("Contact ID found");
        }
        // Add contact to the 
        contactids.put(contact.getContactID(), contact);
    }
    
    // Method to delete a contact by ID
    public void deleteContact(String contactID) {
        // Check if contact ID exists
        if (!contactids.containsKey(contactID)) {
            throw new IllegalArgumentException("Contact ID not found");
        }
        // Remove contact from the map
        contactids.remove(contactID);
    }

    // Method to update contact details
    public void updateContact(String contactID, String firstName, String lastName, String phone, String address) {
        // Check if contact ID exists
        if (!contactids.containsKey(contactID)) {
            throw new IllegalArgumentException("Contact ID does not exist");
        }
        
        // Get the contact and update details
        Contact contact = contactids.get(contactID);
        contact.setFirstName(firstName);
        contact.setLastName(lastName);
        contact.setPhone(phone);
        contact.setAddress(address);
    }

    // Method to get a contact by ID
    public Contact getContact(String contactID) {
        // Check if contact ID exists
        if (!contactids.containsKey(contactID)) {
            throw new IllegalArgumentException("Contact ID not found");
        }
        // Return the contact
        return contactids.get(contactID);
    }
}