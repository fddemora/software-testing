/**
 * 
 */
package mobile;

import java.util.Date;

/**
 * @author fellipedemora_snhu
 *
 */
public class Appointment {
	private String id, description;
	private Date date;
	/**
	 * 1.Check for null values explicitly in order to throw helpful exceptions
	 * 2.Check field lengths
	 * 3.Date can't be from the past
	 */
	public Appointment(String id, Date date, String description) {
		// DONE Auto-generated constructor stub
		if(id == null) throw new NullPointerException("id value is null");
		if(id.length() > 10) throw new IllegalArgumentException("id length is greater than 10");
		
		if(date == null) throw new NullPointerException("date value is null");
		if(date.before(new Date())) throw new IllegalArgumentException("date value is from the past");
		
		if(description == null) throw new NullPointerException("description value is null");
		if(description.length() > 50) throw new IllegalArgumentException("description length is greater than 50");
		
		this.id = id;
		this.date = date;
		this.description = description;
	}
	
	public String getId() {
		return this.id;
	}
	
	public Date getDate() {
		return this.date;
	}
	
	public String getDescription() {
		return this.description;
	}
}
