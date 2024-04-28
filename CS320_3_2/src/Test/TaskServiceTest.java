package Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Module3Classes.TaskService;

class TaskServiceTest {

	@Test
	void testTaskService() {
		//adding a Task shouldn't case any exceptions.
		TaskService s1 = new TaskService();
		s1.addTask("bones", "Mitch", "Adventurous Adaptable Ambitious");
		
		
	}
	@Test
	void testDuplicateID() {
		//we should throw errors if we try and add a Task with a duplicate ID
		TaskService s1 = new TaskService();
		s1.addTask("bones", "Mitch", "Adventurous Adaptable Ambitious");
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {			
			s1.addTask("bones", "Danny", "Just Sad");
			});
	}
	@Test 
	void updateViaTaskService(){
		//making sure theres no exeptions when updating via Task service
		TaskService s1 = new TaskService();
		s1.addTask("bones", "Mitch", "Adventurous Adaptable Ambitious");
		s1.setName("bones","Mike");
		s1.setDescription("bones", "Michalson");

	}
	@Test
	void testInvalidSets(){
		//if we try and update Tasks with strings that are too long we should throw an error
		TaskService s1 = new TaskService();
		s1.addTask("bones", "Mitch", "Adventurous Adaptable Ambitious");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			s1.setName("bones","Mikessssssssssssssssssssss");
			s1.setDescription("bones", "Michalsonsssssssssssssssssssss");

		});

	}
	@Test
	void testDelete() {
		//we shouldn't throw an error deleting something thats there.
		//we should throw an error if we try and delete something thats no longer there.
		TaskService s1 = new TaskService();
		s1.addTask("bones1", "Mitch", "Adventurous Adaptable Ambitious");
		s1.addTask("bones2", "Mitch", "Adventurous Adaptable Ambitious");
		s1.addTask("bones3", "Mitch", "Adventurous Adaptable Ambitious");
		s1.deleteTask("bones1");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			//if we try and delete something thats not there we should get an error
			s1.deleteTask("bones1");
		});
	}

}
