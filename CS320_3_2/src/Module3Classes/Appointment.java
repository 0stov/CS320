package Module3Classes;


import java.util.Date;

/*
 * The appointment object shall have a required unique appointment ID string that cannot be longer than 10 characters. The appointment ID shall not be null and shall not be updatable.
 * 
 * The appointment object shall have a required appointment Date field. The appointment Date field cannot be in the past. The appointment Date field shall not be null.
 *   Note: Use java.util.Date for the appointmentDate field and use before(new Date()) to check if the date is in the past.
 * 
 * The appointment object shall have a required description String field that cannot be longer than 50 characters. The description field shall not be null.
 * 
 * 
 * The only constructor that isn't depreciated is the Date(long) where you have to input the # of milliseconds since the 1st century. Seem impractical so I'll be using a depreciated constructor. Dately Date(year, month, date)
 * as that seems reasonable and easier to follow along with (and grade).
 * I realized after coding this that I could just have a Date object in the constructor. Not sure if thats what I was supposed to do?
 */
public class Appointment {
	private String appointmentID;// <= 10
	private Date appointmentDate;//   <= 20
	private String description;// <= 50
	
	//Constructor
	public Appointment(String appointmentID, int input_appointmentDate, String description){
		
		//input_appintmentDate shall be an int that can be turned into a date. ie. 20240405		
		//the following 4 lines break the input string into year, month, and date using.. Math!
		int year  = input_appointmentDate / 10000;
		int month = (input_appointmentDate -  year * 10000) / 100;
		int date = input_appointmentDate - year * 10000 - month * 100;
		Date appointmentDate = new Date(year, month, date);
		
		//required unique contact ID string that cannot be longer than 10 characters. The contact ID shall not be null
	if(appointmentID == null || appointmentID.length() > 10) {
		throw new IllegalArgumentException("Invalid appointmentID");
	}
	//required appointmentDate should not be in the past. The appointmentDate field shall not be null.
	if(appointmentDate == null || appointmentDate.before(new Date())) {
		throw new IllegalArgumentException("Invalid appointmentDate");
	}
	//required description String field that cannot be longer than 50 characters. The description field shall not be null.
	if(description == null || description.length() > 50) {
		throw new IllegalArgumentException("Invalid description");
	}
	
		//if we made it here, all the inputs are valid and we just need to assign them.
     this.appointmentID = appointmentID;
     this.appointmentDate = appointmentDate;
     this.description = description;
 }
	
	//****** Getters and Setters *****//
		//appointmentID
		public String getAppointmentID() {
			return appointmentID;
		}
		//appointmentID cannot be changed so no 'setter'
		
		//appointmentDate
		public Date getDate(){
			return appointmentDate;
		}
		//Throw an error if the appointmentDate is too long
		public void setDate(int input_appointmentDate) {
			
			//input_appintmentDate shall be an int that can be turned into a date. ie. 20240405		
			int year  = input_appointmentDate / 10000;
			int month = (input_appointmentDate -  year * 10000) / 100;
			int date = input_appointmentDate - year * 10000 - month * 100;
			Date appointmentDate = new Date(year, month, date);
			
			if(appointmentDate == null || appointmentDate.before(new Date())) {
				throw new IllegalArgumentException("Invalid appointmentDate");
			}
			this.appointmentDate = appointmentDate;
		}
		//description
		public String getDescription(){
			return description;
		}
		//Throw an error if the desc is too long
		public void setDescription(String description) {
			if(description == null || description.length() > 50) {
				throw new IllegalArgumentException("Invalid Description");
			}
			this.description = description;
		}
}
