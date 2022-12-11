package mobile;
import java.util.HashMap;

public class ContactService {
	private HashMap<String,Contact> contactMap = new HashMap<String, Contact>();
	
	public void addContact(Contact contact) {
		// check for duplicate keys
		if(contactMap.containsKey(contact.getId())){
			throw new IllegalArgumentException("Duplicate id found");
		}
		contactMap.put(contact.getId(), contact);
	}
	
	public Boolean deleteContact(String key) {
		
		if(!contactMap.containsKey(key)) 
			throw new IllegalArgumentException("contact doesn't exist");
		
		contactMap.remove(key);
		return true;
	}
	
	public Boolean updateContact(Contact contact) {
		if(!contactMap.containsKey(contact.getId())) 
			throw new IllegalArgumentException("contact doesn't exist");
		contactMap.put(contact.getId(), contact);
		return true;
	}
	
	// possible to use in the functions
//	private void hasContact(Contact contact, String msg) {
//		if(contactMap.containsKey(contact.getId())){
//			throw new IllegalArgumentException(msg);
//		}
//	}
}
