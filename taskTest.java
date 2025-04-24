package task;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class taskTest {
	@Test
	void testtask() {
		task task = new task ("Java 101", "12345", "67890");
		assertTrue(task.gettaskID().equals("Java 101"));
		assertTrue(task.gettaskName().equals("12345"));
		assertTrue(task.gettaskDescription().equals("abc123"));
	}
	//Testing to verify not longer than set number
		@Test
		void testtaskToLong() {
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				new task ("Java 101111", "123456789012345678901", "abc123789012345678901234567890123456789012345678901" );
			});	
			}
		//Testing to verify Not NULL
		@Test
		void testtaskIsNull() {
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				new task (null,null,null);
			}); 
			}

}
