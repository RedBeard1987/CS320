package Appointments;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;
import org.junit.jupiter.api.Test;

class AppointmentServiceTest {
	 private AppointmentService appointmentService;

	    // Method to provide test appointment information
	    private Appointment getTestAppointment() {
	    	Date futureDate = new Date(System.currentTimeMillis() + 100000);
	        return new Appointment("123456789", futureDate, "whatever");
	    }
	    
	    // Test to add an appointment
	    @Test
	    public void testAddAppointment() {
	    	//Date futureDate = new Date(System.currentTimeMillis() + 100000);
	        Appointment appointment = getTestAppointment();
	        appointmentService.addappointment(appointment);
	        assertEquals(appointment, appointmentService.getappointment("0123456789"));
	    }
	    
	    // Test to delete an appointment
	    @Test
	    public void testDeleteAppointment() {
	        Appointment appointment = getTestAppointment();
	        appointmentService.addappointment(appointment);
	        appointmentService.deleteappointment("9876543210");
	        assertThrows(IllegalArgumentException.class, () -> {
	            appointmentService.getappointment("9876543210");
	        });
	    }
}
	    
