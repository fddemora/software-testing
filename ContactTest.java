package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import mobile.Contact;

/** Notes
 * passing null as value throws a NullPointerException when checking field length
 * Passing in characters to phone field throws a IllegalArgumentException, similar to null
 * Null scenarios are checked in ContactTest
 **/

class ContactTest {

	@Test
	@DisplayName("id field length > 0")
	void testIdLength() {
		// Equivalence partitioning
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("testgregregergrgregegergergregrer","test","test",new Long("1110006666"),"test");
		} );
	}
	
	@Test
	@DisplayName("id field when null")
	void testIdNull() {
		Assertions.assertThrows(NullPointerException.class, () -> {
			new Contact(null,"test","test",new Long("1110006666"),"test");
		} );
	}

	@Test
	@DisplayName("firstName > 0")
	void testFirstNameLength() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("test","testgregregergrgregegergergregrer","test",new Long("1110006666"),"test");
		} );
	}
	
	@Test
	@DisplayName("firstName == null")
	void testFirstNameNull() {
		Assertions.assertThrows(NullPointerException.class, () -> {
			new Contact("test",null,"test",new Long("1110006666"),"test");
		} );
	}
	
	@Test
	@DisplayName("lastName > 0")
	void testLastNameLength() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("test","test","testgregregergrgregegergergregrer",new Long("1110006666"),"test");
		} );
	}
	
	@Test
	@DisplayName("lastName == null")
	void testLastNameNull() {
		Assertions.assertThrows(NullPointerException.class, () -> {
			new Contact("test","null",null,new Long("1110006666"),"test");
		} );
	}
	
	
	@Test
	@DisplayName("phone != 10")
	void testPhoneLength() {
		// Equivalence partitioning
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("test","test","test",new Long("1110002266663"),"test");
		} );
	}
	
	@Test
	@DisplayName("phone == null")
	void testPhoneNull() {
		Assertions.assertThrows(NullPointerException.class, () -> {
			new Contact("test","test","test",null,"test");
		} );
	}
	
	@Test
	@DisplayName("address > 30")
	void testAddressLength() {
		// Equivalence partitioning
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("test","test","test",new Long("1110006666"),"testtttttttttttttttttttttttttttttttttttttttttttttttt");
	});}
	
	@Test
	@DisplayName("address == null")
	void testAddressNull() {
		Assertions.assertThrows(NullPointerException.class, () -> {
			new Contact("test","test","test",new Long("1110006666"),null);
		} );
	}
	
	@Test
	void testValidAddress() { // Adding this test to expand test coverage, if value is valid.
		Contact contact = new Contact("test","test","test",new Long("1110006666"),"test");
		Assertions.assertTrue(contact.getAddress().equals("test"));
	}
}