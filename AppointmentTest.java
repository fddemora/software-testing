/**
 * 
 */
package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Collections;
import java.util.Date;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import mobile.Appointment;

/**
 * @author fellipedemora_snhu
 *
 */
class AppointmentTest {
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void idNullTest() {
		assertThrows(NullPointerException.class, () -> {
			new Appointment(null, new Date(), "test");
		});
	}
	@Test
	void dateNullTest() {
		assertThrows(NullPointerException.class, () -> {
			new Appointment("test", null, "test");
		});
	}
	@Test
	void descriptionNullTest() {
		assertThrows(NullPointerException.class, () -> {
			new Appointment("test", new Date(), null);
		});
	}
	@Test // field length = 12
	void idLengthTest() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Appointment(String.join("",Collections.nCopies(3, "test")), new Date(), "test");
		});
	}
	@Test // field length = 52
	void descriptionLengthTest() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("test", new Date(), String.join("",Collections.nCopies(13, "test")));
		});
	}
	@Test // date is not from today
	void dateValueTest() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("test", new Date(123), "test");
		});
	}
	@Test
	void idGetterTest() {
		Appointment app = new Appointment("id-1", new Date(), "test");
		assertTrue(app.getId().equals("id-1"));
	}
	@Test 
	void dateGetterTest() {
		Appointment app = new Appointment("id-1", new Date(), "test");
		assertTrue(app.getDate().equals(new Date()));
		// I expected this test to fail since there are two separate Date objects created with a difference of at least 1 millisecond.
	}
	@Test
	void descriptionGetterTest() {
		Appointment app = new Appointment("id-1", new Date(), "test");
		assertTrue(app.getDescription().equals("test"));
	}
}
