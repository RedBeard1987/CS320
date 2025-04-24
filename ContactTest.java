import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactTest {

	@Test
	void testContact() {
		Contact contact = new Contact("Java 101", "12345", "abc123", "abc456", "123abc");
		assertTrue(contact.getContactID().equals("Java 101"));
		assertTrue(contact.getFirstName().equals("12345"));
		assertTrue(contact.getLastName().equals("abc123"));
		assertTrue(contact.getPhone().equals("abc456"));
		assertTrue(contact.getAddress().equals("123abc"));
	}
	//Testing to verify not longer than set number
	@Test
	void testContactToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact ("Java 101111", "12345678901", "abc12378901", "abc45678901", "123abc7890123456789012345678901");
		});	
		}
	//Testing to verify Not NULL
	@Test
	void testContactIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact (null,null,null,null,null);
		}); 
		}
	}

