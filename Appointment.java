package Appointments;
import java.util.Date;
public class Appointment {

		private String appointmentID;
		private Date appointmentDate;
		private String appointmentDescription;
		
		public Appointment(String appointmentID, Date appointmentDate, String appointmentDescription) {
			
			// Validate appointment ID
		    if (appointmentID == null || appointmentID.length() > 10) {
	            throw new IllegalArgumentException("Invalid appointment ID");
		        }
		    
		 // Validate appointment date
		    if (appointmentDate == null || appointmentDate.before(new Date())) {
	            throw new IllegalArgumentException("Invalid appointment date");
		        }
		        
		    // Validate appointment description
		    if (appointmentDescription == null || appointmentDescription.length() > 50) {
	            throw new IllegalArgumentException("Invalid appointment description");
		        }
		    
		    this.appointmentID = appointmentID;
	        this.appointmentDate = appointmentDate;
	        this.appointmentDescription = appointmentDescription;
		}
		
		public String getappointmentID() { return appointmentID; }
	    public Date getappointmentDate() { return appointmentDate; }
	    public String getappointmentDescription() { return appointmentDescription; }
	    
	 // Method for appointment date with validation
	    public void setappointmentDate(Date appointmentDate) {
	        if (appointmentDate == null || appointmentDate.before(new Date())) {
	            throw new IllegalArgumentException("Invalid appointment date");
	        }
	        this.appointmentDate = appointmentDate;
	    }

	    // Method for appointment description with validation
	    public void setappointmentDescription(String appointmentDescription) {
	        if (appointmentDescription == null || appointmentDescription.length() > 50) {
	            throw new IllegalArgumentException("Invalid appointment description");
	        }
	        this.appointmentDescription = appointmentDescription;
	    }
}
