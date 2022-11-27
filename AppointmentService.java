/**
 * 
 */
package mobile;

import java.util.HashMap;

/**
 * @author fellipedemora_snhu
 *
 */
public class AppointmentService {
	private HashMap<String, Appointment> list = new HashMap<>();

	// Check for null and duplicate id. HashMap put method updates the object if calling the id.
	public void addAppointment(Appointment app) {
		if(app == null) throw new NullPointerException("appointment is null");
		if(list.containsKey(app.getId())) throw new IllegalArgumentException("id: " + app.getId() + " already exists");
		list.put(app.getId(), app);
	}
	
	// Check if appointment is null and id exists
	public void deleteAppointment(Appointment app) {
		if(app == null) throw new NullPointerException("appointment is null");
		if(!list.containsKey(app.getId())) throw new IllegalArgumentException("id: " + app.getId() + " doesn't exist");
		list.remove(app.getId());
	}
}
