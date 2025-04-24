package Appointments;

import java.util.HashMap;
import java.util.Map;




public class AppointmentService {
	
	 // A map to store appointments using appointment IDs as the key
  private Map<String, Appointment> appointmentIDs;

  // Constructor to initialize the Appointment Service map
  public AppointmentService() {
      appointmentIDs = new HashMap<>();
  }

  // Method to add a new appointment
  public void addappointment(Appointment appointment) {
      // Check if appointment ID already exists
      if (appointmentIDs.containsKey(appointment.getappointmentID())) {
          throw new IllegalArgumentException("Appointment ID found");
      }
      // Add appointment 
      appointmentIDs.put(appointment.getappointmentID(), appointment);
  }
  
  // Method to delete an appointment by appointment ID
  public void deleteappointment(String appointmentID) {
      // Check if appointment ID exists
      if (!appointmentIDs.containsKey(appointmentID)) {
          throw new IllegalArgumentException("Appointment ID not found");
      }
      // Remove appointment from the map
      appointmentIDs.remove(appointmentID);
  }
  
//Method to get a task by ID
  public Appointment getappointment(String appointmentID) {
      // Check if task ID exists
      if (!appointmentIDs.containsKey(appointmentID)) {
          throw new IllegalArgumentException("Appointment ID not found");
      }
      // Return the task
      return appointmentIDs.get(appointmentID);
  }
}
  

