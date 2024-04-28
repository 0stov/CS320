package Module3Classes;

/*
 * Written by Kyle Peterson
 * 
 * 
 * The contact object shall have a required unique contact ID string that cannot be longer than 10 characters. The contact ID shall not be null and shall not be updatable.
The contact object shall have a required firstName String field that cannot be longer than 10 characters. The firstName field shall not be null.
The contact object shall have a required lastName String field that cannot be longer than 10 characters. The lastName field shall not be null.
The contact object shall have a required phone String field that must be exactly 10 digits. The phone field shall not be null.
The contact object shall have a required address field that must be no longer than 30 characters. The address field shall not be null.
 */
public class Contact {
	
	private String contactID;// <= 10
	private String firstName;// <= 10
	private String lastName;// <=10 
	private String phone;// == 10
	private String address;// <= 30
	
	
	//testing
//	public Contact() {
//		contactID = "DEFAULTID";
//		firstName = "FIRSTNAME";
//		lastName = "LASTNAME";
//		phone = "5555555555";
//		address = "123 FAKE ST NOWHERESVILLE IA";
//	}
	
	public Contact(String contactID, String firstName, String lastName, String phone, String address){
	
		//required unique contact ID string that cannot be longer than 10 characters. The contact ID shall not be null
	if(contactID == null || contactID.length() > 10) {
		throw new IllegalArgumentException("Invalid contactID");
	}
	//required firstName String field that cannot be longer than 10 characters. The firstName field shall not be null.
	if(firstName == null || firstName.length() > 10) {
		throw new IllegalArgumentException("Invalid firstName");
	}
	//required lastName String field that cannot be longer than 10 characters. The lastName field shall not be null.
	if(lastName == null || lastName.length() > 10) {
		throw new IllegalArgumentException("Invalid lastName");
	}
	//required phone String field that must be exactly 10 digits. The phone field shall not be null.
	if (phone == null || phone.length() != 10) {
		throw new IllegalArgumentException("Invalid phone");
	}
	//required address field that must be no longer than 30 characters. The address field shall not be null.
	if(address == null || address.length() > 30) {
		throw new IllegalArgumentException("Invalid address");
	}
	
	
		//if we made it here, all the inputs are valid and we just need ot assign them.
     this.contactID = contactID;
     this.firstName = firstName;
     this.lastName = lastName;
     this.phone = phone;
     this.address = address;
 }
	
	//****** Getters and Setters *****//
	//CONTACTID
	public String getContactID() {
		return contactID;
	}
	//ContactID cannot be changed so no 'setter'
	
	//FIRSTNAME
	public String getFirstName(){
		return firstName;
	}
	//Throw an error if the name is too long
	public void setFirstName(String firstName) {
		if(firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid firstName");
		}
		this.firstName = firstName;
	}
	//LAST NAME
	public String getLastName(){
		return lastName;
	}
	//Throw an error if the name is too long
	public void setLastName(String lastName) {
		if(lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid lastName");
		}
		this.lastName = lastName;
	}
	//phone
	public String getPhone(){
		return phone;
	}
	//Throw an error if the name not 10 chars
	public void setPhone(String phone) {
		//required phone String field that must be exactly 10 digits. The phone field shall not be null.
		if (phone == null || phone.length() != 10) {
			throw new IllegalArgumentException("Invalid phone");
		}
		this.phone = phone;
	}
	//address
	public String getAddress(){
		return address;
	}
	//throw an error if the address len is greater than 30
	public void setAddress(String address) {
		if(address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid address");
		}
		this.address = address;
	}
	


}
