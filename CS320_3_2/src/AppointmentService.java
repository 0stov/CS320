package Module3Classes;

import java.util.LinkedList;

/*
 * The appointment service shall be able to add appointments with a unique appointment ID.
 * The appointment service shall be able to delete appointments per appointment ID.

 */
public class AppointmentService {
	//A linked list can store the Appointments and it worked last time
		LinkedList<Appointment> AppointmentList = new LinkedList<Appointment>();
		
		
		//The Appointment service shall be able to add Appointments with a unique ID.
		public void addAppointment(String AppointmentID, int date, String description) {
			
			//we need to check if the AppointmentList contains a user with the same ID
			//iterate through the list checking against AppointmentIDs
			for(int i=0; i < AppointmentList.size();i++) {
				if(AppointmentList.get(i).getAppointmentID() == AppointmentID) {
					//user has same AppointmentID; cannot add. print rejection and abort addAppointment.
					throw new IllegalArgumentException("AppointmentID in use");
				}
			}
			
			//if the code got here it didn't find a user with the same AppointmentID and we can add it.
			AppointmentList.push(new Appointment( AppointmentID,  date,  description));
			}
		
		
		public void deleteAppointment(String AppointmentID) {
			//we need to check if the AppointmentList contains a user with the same ID
					//iterate through the list checking against AppointmentIDs
					for(int i=0; i < AppointmentList.size();i++) {
						if(AppointmentList.get(i).getAppointmentID() == AppointmentID) {
							//parameter has same AppointmentID. we found the one to delete.
							AppointmentList.remove(i);
							return;
						}
					}
					//if the code got here it didn't find the Appointment to delete.
					throw new IllegalArgumentException("Appointment not found");
			}			

}
