/**
 * 
 */
package mobile;

/**
 * @author fellipedemora_snhu
 *
 */
public class Task {
	private String id, name, description;
	/**
	 * 
	 */
	public Task(String id, String name, String description) {
		// DONE Auto-generated constructor stub
		
		//test id value not null, length
		if(id == null) throw new IllegalArgumentException("invalid id value: " + id);
		if(id.length() > 10) throw new IllegalArgumentException("invalid id length: " + id.length());
		
		// name value not greater than 20, not null
		if(name == null) throw new IllegalArgumentException("invalid name value: " + name);
		if(name.length() > 20) throw new IllegalArgumentException("invalid name length: " + name.length());
		
		// description value can't be greater than 50, not null
		if(description == null) throw new IllegalArgumentException("invalid description value: " + description);
		if(description.length() > 50) throw new IllegalArgumentException("invalid description length: " + description.length());		
		
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
	public String getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getDescription() {
		return this.description;
	}
}
