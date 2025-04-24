import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactServiceTest {
	 private ContactService contactService;

	    // Method to provide test contact information
	    private Contact getTestContact() {
	        return new Contact("0123456789", "Harry", "Berkshire", "4523218596", "1025 Levelup ln. Beachydune, CA");
	    }
	    
	    // Test to add a contact
	    @Test
	    public void testAddContact() {
	        Contact contact = getTestContact();
	        contactService.addContact(contact);
	        assertEquals(contact, contactService.getContact("0123456789"));
	    }
	    
	    // Test to delete a contact
	    @Test
	    public void testDeleteContact() {
	        Contact contact = getTestContact();
	        contactService.addContact(contact);
	        contactService.deleteContact("9876543210");
	        assertThrows(IllegalArgumentException.class, () -> {
	            contactService.getContact("987654321");
	        });
	    }
	    
	    // Test to update a contact
	    @Test
	    public void testUpdateContact() {
	        Contact contact = getTestContact();
	        contactService.addContact(contact);
	        contactService.updateContact("9876543210", "Rosa", "Farhart", "3219517869", "4551 Forever ln");
	        Contact updatedContact = contactService.getContact("0123456789");
	        assertEquals("Rosa", updatedContact.getFirstName());
	        assertEquals("Farhart", updatedContact.getLastName());
	        assertEquals("3219517869", updatedContact.getPhone());
	        assertEquals("4551 Forever ln", updatedContact.getAddress());
	    }
}
