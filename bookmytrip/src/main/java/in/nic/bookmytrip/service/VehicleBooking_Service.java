package in.nic.bookmytrip.service;


import java.util.List;

import in.nic.bookmytrip.dto.VehicleBookingForm;
import in.nic.bookmytrip.pojo.DefaultBookingProperties;
import in.nic.bookmytrip.pojo.MeetingPurpose;
import in.nic.bookmytrip.pojo.OfficialsCount;
import in.nic.bookmytrip.pojo.Response;
import in.nic.bookmytrip.pojo.MeetingLocations;
import in.nic.bookmytrip.pojo.MeetingLocationsLocal;
import in.nic.bookmytrip.pojo.TripMode;
import in.nic.bookmytrip.pojo.VehicleTimings;


public interface VehicleBooking_Service {
	
	List<TripMode> getTripMode();
	
	List<MeetingPurpose> getMeetingPurpose();
	
	List<OfficialsCount> getOfficialsCount();
	
	List<MeetingLocations> getMeetingLocations();
	
	List<VehicleTimings> getVehicleTimings();
	
	List<DefaultBookingProperties> getDefaultBookingProperties();
	
	List<MeetingLocationsLocal> getMeetingLocationsLocal(int empId);
	
	MeetingLocationsLocal getMeetingLocationLocalById(Integer locationId);
	
	Response addMeetingLocationLocal(String locationDesc, String employeeId);
	
	Response updateMeetingLocationsLocal(Integer locationId,String locationDesc, String employeeId);
	
	Response deleteLocationLocal(Integer locationId);
	
	Response makeNewBooking(VehicleBookingForm formData);
	
}
