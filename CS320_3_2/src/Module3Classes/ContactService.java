package Module3Classes;
import java.util.LinkedList;
/*
 * Written by Kyle Peterson
 * 
 * The contact service shall be able to add contacts with a unique ID.
The contact service shall be able to delete contacts per contact ID.
The contact service shall be able to update contact fields per contact ID. The following fields are updatable:
firstName
lastName
Number
Address
 */
public class ContactService {
	//A linked list can store the contacts
	LinkedList<Contact> contactList = new LinkedList<Contact>();
	
	
	//The contact service shall be able to add contacts with a unique ID.
	public void addContact(String contactID, String firstName, String lastName, String phone, String address) {
		
		//we need to check if the contactList contains a user with the same ID
		//iterate through the list checking against contactIDs
		for(int i=0; i < contactList.size();i++) {
			if(contactList.get(i).getContactID() == contactID) {
				//user has same contactID; cannot add. print rejection and abort addContact.
				throw new IllegalArgumentException("contactID in use");
			}
		}
		
		//if the code got here it didnt find a user with the same contactID and we can add it.
		contactList.push(new Contact( contactID,  firstName,  lastName,  phone,  address));
	}
	
	
	public void deleteContact(String contactID) {
		//we need to check if the contactList contains a user with the same ID
				//iterate through the list checking against contactIDs
				for(int i=0; i < contactList.size();i++) {
					if(contactList.get(i).getContactID() == contactID) {
						//parameter has same contactID. we found the one to delete.
						contactList.remove(i);
						return;
					}
				}
				//if the code got here it didn't find the contact to delete. print not found??
				throw new IllegalArgumentException("Contact not found");
	}
	
	public void setFirstName(String contactID, String firstName) {
		
		//firstname is valid. now we need to find the contact to update.
		//iterate through the list checking against contactIDs
				for(int i=0; i < contactList.size();i++) {
					if(contactList.get(i).getContactID() == contactID) {
						//the correct Contact has been found. now to update.
						contactList.get(i).setFirstName(firstName);
					}
				}
		
		
	}
	public void setLastName(String contactID, String lastName) {
		//lastName is valid. now we need to find the contact to update.
		//iterate through the list checking against contactIDs
				for(int i=0; i < contactList.size();i++) {
					if(contactList.get(i).getContactID() == contactID) {
						//the correct Contact has been found. now to update.
						contactList.get(i).setLastName(lastName);
					}
				}
	}
		
		
	//setPhone
	public void setNumber(String contactID, String phone) {
		//lastName is valid. now we need to find the contact to update.
		//iterate through the list checking against contactIDs
				for(int i=0; i < contactList.size();i++) {
					if(contactList.get(i).getContactID() == contactID) {
						//the correct Contact has been found. now to update.
						contactList.get(i).setPhone(phone);
					}
				}
	}
	//set address
	public void setAddress(String contactID, String address) {
		//lastName is valid. now we need to find the contact to update.
		//iterate through the list checking against contactIDs
				for(int i=0; i < contactList.size();i++) {
					if(contactList.get(i).getContactID() == contactID) {
						//the correct Contact has been found. now to update.
						contactList.get(i).setAddress(address);
					}
				}
	}
	

}
