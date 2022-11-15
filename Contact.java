/**
 * 
 */
package mobile;

/**
 * @author fellipedemora_snhu
 *
 */
public class Contact {

	private String id, firstName, lastName, phone, address;
	/**
	 * 
	 */
	public Contact(String id, String firstName, String lastName, Long phone, String address) {
		// DONE Auto-generated constructor stub
		
		
		// check id length is not greater than 10 and not null
		if(id.length() > 10) throw new IllegalArgumentException("Invalid id");
	//	if(id == null) throw new NullPointerException("Id: Invalid null value");
		this.id = id;
		
		// check firstName length is not greater than 10 and not null
		if(firstName.length() > 10) throw new IllegalArgumentException("Invalid first name");
	//	if(firstName == null) throw new NullPointerException("firstName: Invalid null value");
		this.firstName = firstName;
			
		// check lastName length is not greater than 10 and not null
		if(lastName.length() > 10) throw new IllegalArgumentException("Invalid last name");
	//	if(lastName == null) throw new NullPointerException("lastName: Invalid null value");
		this.lastName = lastName;
		
		// check phone length is not equal to 10 and not null
		// exception is thrown if non integer values are present
		if(Long.toString(phone).length() != 10) throw new IllegalArgumentException("Invalid phone format. 10 digits only.");
	//	if(Long.toString(phone) == null) throw new NullPointerException("phone: Invalid null value");	
		this.phone = Long.toString(phone);

		if(address.length() > 30) throw new IllegalArgumentException("Invalid address. Needs to be less than 30 characters");
	
		
		this.address = address;
	}

	public String getId() {
		return this.id;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public String getPhone() {
		return this.phone;
	}
	
	public String getAddress() {
		return this.address;
	}
}
