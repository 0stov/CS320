package Module3Classes;

public class Task {
	private String taskID;// <= 10
	private String name;//   <= 20
	private String description;// <=50
	
	//Constructor
	public Task(String taskID, String name, String description){
		
		//required unique contact ID string that cannot be longer than 10 characters. The contact ID shall not be null
	if(taskID == null || taskID.length() > 10) {
		throw new IllegalArgumentException("Invalid taskID");
	}
	//required name String field that cannot be longer than 20 characters. The name field shall not be null.
	if(name == null || name.length() > 20) {
		throw new IllegalArgumentException("Invalid name");
	}
	//required description String field that cannot be longer than 50 characters. The description field shall not be null.
	if(description == null || description.length() > 50) {
		throw new IllegalArgumentException("Invalid description");
	}
	
		//if we made it here, all the inputs are valid and we just need to assign them.
     this.taskID = taskID;
     this.name = name;
     this.description = description;
 }
	
	//****** Getters and Setters *****//
		//taskID
		public String getTaskID() {
			return taskID;
		}
		//taskID cannot be changed so no 'setter'
		
		//name
		public String getName(){
			return name;
		}
		//Throw an error if the name is too long
		public void setName(String name) {
			if(name == null || name.length() > 20) {
				throw new IllegalArgumentException("Invalid name");
			}
			this.name = name;
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
