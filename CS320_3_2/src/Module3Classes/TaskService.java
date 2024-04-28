package Module3Classes;

import java.util.LinkedList;

/*
Written by Kyle Peterson

The Task service shall be able to add Tasks with a unique ID.
The Task service shall be able to delete Tasks per Task ID.
The Task service shall be able to update Task fields per Task ID. The following fields are updatable:
name
description
 */
public class TaskService {
	//A linked list can store the Tasks and it worked last time
	LinkedList<Task> TaskList = new LinkedList<Task>();
	
	
	//The Task service shall be able to add Tasks with a unique ID.
	public void addTask(String TaskID, String name, String description) {
		
		//we need to check if the TaskList contains a user with the same ID
		//iterate through the list checking against TaskIDs
		for(int i=0; i < TaskList.size();i++) {
			if(TaskList.get(i).getTaskID() == TaskID) {
				//user has same TaskID; cannot add. print rejection and abort addTask.
				throw new IllegalArgumentException("TaskID in use");
			}
		}
		
		//if the code got here it didn't find a user with the same TaskID and we can add it.
		TaskList.push(new Task( TaskID,  name,  description));
		}
	
	
	public void deleteTask(String TaskID) {
		//we need to check if the TaskList contains a user with the same ID
				//iterate through the list checking against TaskIDs
				for(int i=0; i < TaskList.size();i++) {
					if(TaskList.get(i).getTaskID() == TaskID) {
						//parameter has same TaskID. we found the one to delete.
						TaskList.remove(i);
						return;
					}
				}
				//if the code got here it didn't find the Task to delete. print not found??
				throw new IllegalArgumentException("Task not found");
		}
	
	public void setName(String TaskID, String name) {
		
		//name is valid. now we need to find the Task to update.
		//iterate through the list checking against TaskIDs
				for(int i=0; i < TaskList.size();i++) {
					if(TaskList.get(i).getTaskID() == TaskID) {
						//the correct Task has been found. now to update.
						TaskList.get(i).setName(name);
					}
				}
		
		
		}
	public void setDescription(String TaskID, String description) {
		//description is valid. now we need to find the Task to update.
		//iterate through the list checking against TaskIDs
				for(int i=0; i < TaskList.size();i++) {
					if(TaskList.get(i).getTaskID() == TaskID) {
						//the correct Task has been found. now to update.
						TaskList.get(i).setDescription(description);
					}
				}
		}
		
		

	}
	
