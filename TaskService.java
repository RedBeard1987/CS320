package task;

import java.util.HashMap;
import java.util.Map;

public class TaskService {
	
	 // A map to store task using task ID as the key
   private Map<String, task> taskids;

   // Constructor to initialize the Task Service map
   public TaskService() {
       taskids = new HashMap<>();
   }

   // Method to add a new task
   public void addtask(task task) {
       // Check if task ID already exists
       if (taskids.containsKey(task.gettaskID())) {
           throw new IllegalArgumentException("Task ID found");
       }
       // Add task 
       taskids.put(task.gettaskID(), task);
   }
   
   // Method to delete a task by ID
   public void deletetask(String taskID) {
       // Check if task ID exists
       if (!taskids.containsKey(taskID)) {
           throw new IllegalArgumentException("Task ID not found");
       }
       // Remove task from the map
       taskids.remove(taskID);
   }

   // Method to update task details
   public void updatetask(String taskID, String taskName, String taskDescription) {
       // Check if task ID exists
       if (!taskids.containsKey(taskID)) {
           throw new IllegalArgumentException("Task ID does not exist");
       }
       
       // Get the task and update details
       task task = taskids.get(taskID);
       task.settaskName(taskName);
       task.settaskDescription(taskDescription);
   }

   // Method to get a task by ID
   public task gettask(String taskID) {
       // Check if task ID exists
       if (!taskids.containsKey(taskID)) {
           throw new IllegalArgumentException("Task ID not found");
       }
       // Return the task
       return taskids.get(taskID);
   }
}
