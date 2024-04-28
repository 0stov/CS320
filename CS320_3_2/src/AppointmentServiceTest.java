package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Module3Classes.AppointmentService;

class AppointmentServiceTest {

	@Test
	void testAppointmentService() {
		//adding a Appointment shouldn't case any exceptions.
		AppointmentService s1 = new AppointmentService();
		s1.addAppointment("bones", 20250405, "Adventurous Adaptable Ambitious");
		
		
	}
	@Test
	void testDuplicateID() {
		//we should throw errors if we try and add a Appointment with a duplicate ID
		AppointmentService s1 = new AppointmentService();
		s1.addAppointment("bones", 20250405, "Adventurous Adaptable Ambitious");
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {			
			s1.addAppointment("bones", 20250405, "Just Sad");
			});
	}

	@Test
	void testDelete() {
		//we shouldn't throw an error deleting something thats there.
		//we should throw an error if we try and delete something thats no longer there.
		AppointmentService s1 = new AppointmentService();
		s1.addAppointment("bones1", 20250405, "Adventurous Adaptable Ambitious");
		s1.addAppointment("bones2", 20250405, "Adventurous Adaptable Ambitious");
		s1.addAppointment("bones3", 20250405, "Adventurous Adaptable Ambitious");
		s1.deleteAppointment("bones1");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			//if we try and delete something thats not there we should get an error
			s1.deleteAppointment("bones1");
		});
	}

}
