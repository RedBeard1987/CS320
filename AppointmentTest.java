package Appointments;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AppointmentTest {

	@Test
	void testAppointment() {
		Date futureDate = new Date(System.currentTimeMillis() + 100000);
		Appointment appointment = new Appointment("123456", futureDate, "whatever");
		assertTrue(appointment.getappointmentID().equals("123456"));
		assertTrue(appointment.getappointmentDate().equals(futureDate));
		assertTrue(appointment.getappointmentDescription().equals("whatever"));
	}
	//Testing to verify not longer than set number
		@Test
		void testAppointmentToLong() {
			Date futureDate = new Date(System.currentTimeMillis() + 100000);
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				new Appointment ("01234567890", futureDate, "abc12378901");
			});	
			}
		//Testing to verify date not past
		@Test
		void testPastDate() {
			Date pastDate = new Date(System.currentTimeMillis() - 100000);
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				new Appointment ("01234567890", pastDate, "abc12378901");
			});
		}
		//Testing to verify Not NULL
		@Test
		void testAppointmentIsNull() {
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				new Appointment (null,null,null);
			}); 
			}
}
