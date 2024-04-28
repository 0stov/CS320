package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import Module3Classes.Task;

class TaskTest {

	@Test
	void testTask() {
		//testing the constructor.
		Task s1 = new Task("1234", "Mike","Adventurous Adaptable Ambitious");
		assertTrue(s1.getTaskID().equals("1234"));
		assertTrue(s1.getName().equals("Mike"));
		assertTrue(s1.getDescription().equals("Adventurous Adaptable Ambitious"));

		
		
		
	}
	@Test
	void testSetTask() {
		//testing the 'settters'
		Task s2 = new Task("bones", "Mitch", "Adventurous Adaptable Ambitious");		
		s2.setName("Mike");
		s2.setDescription("Adventurous Adaptable Ambitious");

		
		assertTrue(s2.getTaskID().equals("bones"));
		assertTrue(s2.getName().equals("Mike"));
		assertTrue(s2.getDescription().equals("Adventurous Adaptable Ambitious"));

	}
	@Test
	void testTooLong() {
		//we should throw an error if we have an input thats too long.
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("1234sssssssssssssssss", "Mike", "Adventurous Adaptable Ambitious");
			new Task("bones", "characterscharacterss",  "Adventurous Adaptable Ambitious");
			new Task("bones", "Mitch",  "characterscharacterscharacterscharacterscharacterss");
			});
	}
	@Test
	void testNullValues() {
		// we should throw an error if we have a null input.
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task(null , "Mike", "Adventurous Adaptable Ambitious");
			new Task("1234", null, "Adventurous Adaptable Ambitious" );
			new Task("1234", "Mike", null );


			});
	}

}
