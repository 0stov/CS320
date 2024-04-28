package Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Module3Classes.ContactService;

class ContactServiceTest {
//all the methods are voids. what can we test? Just use all the methods and see if there's unhandled exceptions?
//ConstactService doesn't return any information. does it?
	
	@Test
	void testContactService() {
		//adding a contact shouldn't case any exceptions.
		ContactService s1 = new ContactService();
		s1.addContact("bones", "Mitch", "Vickalson", "0987654321", "101 Dungdingus way City State");
		
		
	}
	@Test
	void testDuplicateID() {
		//we should throw errors if we try and add a contact with a duplicate ID
		ContactService s1 = new ContactService();
		s1.addContact("bones", "Mitch", "Vickalson", "0987654321", "101 Dungdingus way City State");
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {			
			s1.addContact("bones", "Danny", "Widy", "0981654321", "Just left of Petra");
			});
	}
	@Test 
	void updateViaContactService(){
		//making sure theres no exeptions when updating via contact service
		ContactService s1 = new ContactService();
		s1.addContact("bones", "Mitch", "Vickalson", "0987654321", "101 Dungdingus way City State");
		s1.setFirstName("bones","Mike");
		s1.setLastName("bones", "Michalson");
		s1.setNumber("bones", "1234567890");
		s1.setAddress("bones", "123 Fake St Nowheresville IA");
	}
	@Test
	void testInvalidSets(){
		//if we try and update contacts with strings that are too long we should throw an error
		ContactService s1 = new ContactService();
		s1.addContact("bones", "Mitch", "Vickalson", "0987654321", "101 Dungdingus way City State");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			s1.setFirstName("bones","Mikessssssssssssssssssssss");
			s1.setLastName("bones", "Michalsonsssssssssssssssssssss");
			s1.setNumber("bones", "1234567890ssssssssssssssssssssssss");
			s1.setAddress("bones", "123 Fake St Nowheresville IAsssssssssssssssssssssss");
		});

	}
	@Test
	void testDelete() {
		//we shouldn't throw an error deleting something thats there.
		//we should throw an error if we try and delete something thats no longer there.
		ContactService s1 = new ContactService();
		s1.addContact("bones1", "Mitch", "Vickalson", "0987654321", "101 Dungdingus way City State");
		s1.addContact("bones2", "Mitch", "Vickalson", "0987654321", "101 Dungdingus way City State");
		s1.addContact("bones3", "Mitch", "Vickalson", "0987654321", "101 Dungdingus way City State");
		s1.deleteContact("bones1");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			//if we try and delete something thats not there we should get an error
			s1.deleteContact("bones1");
		});
	}
//it was not required for ContactService to be able to getValues for Contact Objects, or return the contacts its saved.
}
