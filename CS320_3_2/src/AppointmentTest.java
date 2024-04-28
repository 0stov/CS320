package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Module3Classes.Appointment;
import Module3Classes.Appointment;

class AppointmentTest {
	Date testDate = new Date(2025, 04, 05);
	@Test
	void testAppointment() {
		//testing the constructor.
		Appointment s1 = new Appointment("1234", 20250405,"Adventurous Adaptable Ambitious");
		assertTrue(s1.getAppointmentID().equals("1234"));
		assertTrue(s1.getDate().equals(testDate));
		assertTrue(s1.getDescription().equals("Adventurous Adaptable Ambitious"));

		
	}
	@Test
	void testSetAppointment() {
		//testing the 'settters'
		Appointment s2 = new Appointment("bones", 20250505, "Adventurous Adaptable Ambitious");		
		s2.setDate(20250405);
		s2.setDescription("Adventurous Adaptable Ambitious");

		
		assertTrue(s2.getAppointmentID().equals("bones"));
		assertTrue(s2.getDate().equals(testDate));
		assertTrue(s2.getDescription().equals("Adventurous Adaptable Ambitious"));

	}
	
	@Test
	void testPastAppointments() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {		
			new Appointment("bones" , 20230404, "Adventurous Adaptable Ambitious");
			

			new Appointment("1234", 20240405, "Adventurous Adaptable Ambitious" );


			});
	}
	@Test
	void testTooLong() {
		//we should throw an error if we have an input thats too long or before the appointment
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("1234sssssssssssssssss", 20250405, "Adventurous Adaptable Ambitious");
			new Appointment("bones", 20250405,  "characterscharacterscharacterscharacterscharacterss");
			});
	}
	@Test
	void testNullValues() {
		// we should throw an error if we have a null input.
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment(null , 20250405, "Adventurous Adaptable Ambitious");
			//because of the int in the constructor we cannot input null 
			new Appointment("1234", 20250405, null );


			});
	}

}
