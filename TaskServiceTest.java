/**
 * 
 */
package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import mobile.Task;
import mobile.TaskService;

/**
 * @author fellipedemora_snhu
 *
 */
class TaskServiceTest {
	private TaskService service = new TaskService();


	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		
		Task task = new Task("1", "homework", "algebra 1-50");
		Task task2 = new Task("2", "clean room", "remove dust");
		
		service.addTask(task);
		service.addTask(task2);
	}


	@Test
	void testAddTaskWhenNull() {
		assertThrows(NullPointerException.class,() -> {
			service.addTask(null);
		});
	}
	@Test
	void testDeleteTaskWhenNull() {
		assertThrows(NullPointerException.class,() -> {
			service.deleteTask(null);
		});
	}
	@Test
	void testUpdateTaskWhenNull() {
		assertThrows(NullPointerException.class,() -> {
			service.updateTask(null);
		});
	}
	@Test
	void testAddTaskWhenDuplicateId() {
		assertThrows(IllegalArgumentException.class, () -> {
			service.addTask(new Task("1", "test", "test"));
		});
	}
	@Test
	void testDeleteTaskWhenIdNotExist() {
		assertThrows(IllegalArgumentException.class, () -> {
			service.deleteTask(new Task("test", "test", "test"));
		});
	}
	@Test
	void testUpdateTaskWhenIdNotExist() {
		assertThrows(IllegalArgumentException.class, () -> {
			service.updateTask(new Task("test", "test", "test"));
		});
	}
}
