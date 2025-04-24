package task;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TaskServiceTest {
	 private TaskService taskService;

	    // Method to provide test task information
	    private task getTestTask() {
	        return new task("0123456789", "Harry", "Berkshire");
	    }
	    
	    // Test to add a task
	    @Test
	    public void testAddTask() {
	        task task = getTestTask();
	        taskService.addtask(task);
	        assertEquals(task, taskService.gettask("0123456789"));
	    }
	    
	    // Test to delete a task
	    @Test
	    public void testDeleteTask() {
	        task task = getTestTask();
	        taskService.addtask(task);
	        taskService.deletetask("9876543210");
	        assertThrows(IllegalArgumentException.class, () -> {
	            taskService.gettask("987654321");
	        });
	    }
	    
	    // Test to update a task
	    @Test
	    public void testUpdateTask() {
	        task task = getTestTask();
	        taskService.addtask(task);
	        taskService.updatetask("9876543210", "Paul", "Tarnish");
	        task updatedtask = taskService.gettask("0123456789");
	        assertEquals("Paul", updatedtask.gettaskName());
	        assertEquals("Tarnish", updatedtask.gettaskDescription());
	    }
}
