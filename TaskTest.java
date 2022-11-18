/**
 * 
 */
package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Collections;
import org.junit.jupiter.api.Test;

import mobile.Task;

/**
 * @author fellipedemora_snhu
 *
 */
class TaskTest {
	
	@Test
	void testTaskIdNull() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Task(null, "test", "test");
		});
	}
	
	@Test
	void testTaskIdLength() {
		// length can't be greater than 10
		assertThrows(IllegalArgumentException.class, () -> {
			new Task("testtesttest", "test", "test"); // length = 12
		});
	}
	
	@Test
	void testTaskIdValue() {
		// test the id value matches
		assertTrue(new Task("id123", "test", "test").getId().equals("id123"));
	}
	
	@Test
	void testTaskNameLength() {
		// length can't be greater than 20
		assertThrows(IllegalArgumentException.class, () -> {
			new Task("test", "testtesttesttesttesttest", "test"); // length = 24
		});
	}
	
	@Test
	void testTaskNameNull() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Task("test", null, "test"); 
		});
	}
	
	@Test
	void testTaskNameValue() {
		// test the id value matches
		assertTrue(new Task("id123", "testName", "test").getName().equals("testName"));
	}
	
	@Test
	void testTaskDescriptionLength() {
		// description can't be greater than 50
		assertThrows(IllegalArgumentException.class, () -> {
			new Task("test", "test", String.join("", Collections.nCopies(13, "test"))); // description = 52
		});
	}
	
	@Test
	void testTaskDescriptionNull() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Task("test", "test", null); 
		});
	}
	
	@Test
	void testTaskDescriptionValue() {
		// test the description value matches
		assertTrue(new Task("id123", "testName", "testDescription").getDescription().equals("testDescription"));
	}

}
