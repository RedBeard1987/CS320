package task;

public class task {

	private String taskID;
	private String taskName;
	private String taskDescription;
	
	public task(String taskID, String taskName, String taskDescription) {
		
		// Validate task ID
	    if (taskID == null || taskID.length() > 10) {
            throw new IllegalArgumentException("Invalid task ID");
	        }
	    
	 // Validate task name
	    if (taskName == null || taskName.length() > 20) {
            throw new IllegalArgumentException("Invalid task name");
	        }
	        
	    // Validate task description
	    if (taskDescription == null || taskDescription.length() > 50) {
            throw new IllegalArgumentException("Invalid task description");
	        }
	    
	    this.taskID = taskID;
        this.taskName = taskName;
        this.taskDescription = taskDescription;
	}
	
	public String gettaskID() { return taskID; }
    public String gettaskName() { return taskName; }
    public String gettaskDescription() { return taskDescription; }
    
 // Method for first name with validation
    public void settaskName(String taskName) {
        if (taskName == null || taskName.length() > 20) {
            throw new IllegalArgumentException("Invalid task name");
        }
        this.taskName = taskName;
    }

    // Method for last name with validation
    public void settaskDescription(String taskDescription) {
        if (taskDescription == null || taskDescription.length() > 50) {
            throw new IllegalArgumentException("Invalid task description");
        }
        this.taskDescription = taskDescription;
    }
}
