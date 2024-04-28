package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Module3Classes.Contact;

class ContactTest {

	@Test
	void testContact() {
		//testing the constructor.
		Contact s1 = new Contact("1234", "Mike", "Michalson", "1234567890", "123 Fake St Nowheresville IA");
		assertTrue(s1.getContactID().equals("1234"));
		assertTrue(s1.getFirstName().equals("Mike"));
		assertTrue(s1.getLastName().equals("Michalson"));
		assertTrue(s1.getPhone().equals("1234567890"));
		assertTrue(s1.getAddress().equals("123 Fake St Nowheresville IA"));
		
		
		
	}
	@Test
	void testSetContact() {
		//testing the 'settters'
		Contact s2 = new Contact("bones", "Mitch", "Vickalson", "0987654321", "101 Dungdingus way City State");
		
		s2.setFirstName("Mike");
		s2.setLastName("Michalson");
		s2.setPhone("1234567890");
		s2.setAddress("123 Fake St Nowheresville IA");
		
		assertTrue(s2.getContactID().equals("bones"));
		assertTrue(s2.getFirstName().equals("Mike"));
		assertTrue(s2.getLastName().equals("Michalson"));
		assertTrue(s2.getPhone().equals("1234567890"));
		assertTrue(s2.getAddress().equals("123 Fake St Nowheresville IA"));
	}
	@Test
	void testTooLong() {
		//we should throw an error if we have an input thats too long.
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234sssssssssssssssss", "Mike", "Michalson", "1234567890", "123 Fake St Nowheresville IA");
			new Contact("bones", "Mitchsssssssssssssssssssssssss", "Vickalson", "0987654321", "101 Dungdingus way City State");
			new Contact("bones", "Mitch", "Vickalsonsssssssssssssssssssssssss", "0987654321", "101 Dungdingus way City State");
			new Contact("bones", "Mitch", "Vickalson", "0987654321sssssssssssssssssssssssss", "101 Dungdingus way City State");
			new Contact("bones", "Mitch", "Vickalson", "0987654321", "101 Dungdingus way City Statesssssssssssssssssssssssss");
			});
	}
	@Test
	void testNullValues() {
		// we should throw an error if we have a null input.
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null , "Mike", "Michalson", "1234567890", "123 Fake St Nowheresville IA");
			new Contact("1234", null, "Michalson", "1234567890", "123 Fake St Nowheresville IA");
			new Contact("1234", "Mike", null, "1234567890", "123 Fake St Nowheresville IA");
			new Contact("1234", "Mike", "Michalson", null, "123 Fake St Nowheresville IA");
			new Contact("1234", "Mike", "Michalson", "1234567890", null);

			});
	}
}
	
	

