/**
 * 
 */
package mobile;

import java.util.HashMap;

/**
 * @author fellipedemora_snhu
 *
 */
public class TaskService {
	private HashMap<String, Task> taskList = new HashMap<>();
	/**
	 * 
	 */
	public void addTask(Task task) {
		//check if exists
		hasKey(false, task, "addTask fail: task already exists.");
		taskList.put(task.getId(), task);
	}
	
	public void deleteTask(Task task) {
		hasKey(true, task, "deleteTask fail: task doesn't exist.");
		taskList.remove(task.getId());
	}
	
	public void updateTask(Task task) {
		hasKey(true, task, "updateTask fail: task doesn't exist.");
		taskList.put(task.getId(), task);
	}

	// if flag is false, we are checking that the task doesn't exist before operation
	// true flag means check that task exists before operation
	private void hasKey(Boolean flag, Task task, String msg) {
		if(!flag && taskList.containsKey(task.getId())) throw new IllegalArgumentException(msg);
		if(flag && !taskList.containsKey(task.getId())) throw new IllegalArgumentException(msg);
	}
}
