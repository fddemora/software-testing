/**
 * 
 */
package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import mobile.Appointment;
import mobile.AppointmentService;

/**
 * @author fellipedemora_snhu
 *
 */
class AppointmentServiceTest {
	private AppointmentService service = new AppointmentService();
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		service.addAppointment(new Appointment("id1", new Date(), "test"));
	}

	@Test
	void addAppNullTest() {
		assertThrows(NullPointerException.class, () -> {
			service.addAppointment(null);
		});
	}
	
	@Test
	void deleteAppNullTest() {
		assertThrows(NullPointerException.class, () -> {
			service.deleteAppointment(null);
		});
	}
	
	@Test
	void addAppDuplicateTest() {
		assertThrows(IllegalArgumentException.class, () -> {
			service.addAppointment(new Appointment("id1", new Date(), "test"));			
		});
	}
	
	@Test
	void deleteAppNoIdTest() {
		assertThrows(IllegalArgumentException.class, () -> {
			service.deleteAppointment(new Appointment("id2", new Date(), "test"));			
		});
	}
	
	@Test 
	void deleteAppTest() {
		assertTrue(service.deleteAppointment(new Appointment("id1", new Date(), "test")));
	}
}
