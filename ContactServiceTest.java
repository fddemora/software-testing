package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import mobile.Contact;
import mobile.ContactService;

public class ContactServiceTest {
	
	// needed to create a global variable to help reference the same object. 
	private ContactService service = new ContactService();
	

	@BeforeEach
	void setup() {
		Contact contact = new Contact("1", "fellipe", "demoraes", new Long("8573638211"), "malden ma");
		Contact contact2 = new Contact("2", "fellipe2", "demoraes2", new Long("8573638211"), "malden ma");
		
		service.addContact(contact);
		service.addContact(contact2);
	}
	
	@Test
	@DisplayName("creating contact duplicate(ID)")
	void testDuplicate() {
		Contact contact = new Contact("1", "fellipe2", "demoraes2", new Long("8573638211"), "malden ma");

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			service.addContact(contact);
		} );
	}

	@Test
	@DisplayName("test delete if id isn't present")
	void testdeleteContact() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			service.deleteContact("0");
		});
	}
	
	@Test
	@DisplayName("test update if contact exists")
	void testUpdateContact() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			service.updateContact(new Contact("0","fellipe2", "demoraes2", new Long("8573638211"), "malden ma"));
		});
	}
}