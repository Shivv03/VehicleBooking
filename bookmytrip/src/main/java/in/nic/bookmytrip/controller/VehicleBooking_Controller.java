package in.nic.bookmytrip.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.nic.bookmytrip.dto.VehicleBookingForm;
import in.nic.bookmytrip.pojo.DefaultBookingProperties;
import in.nic.bookmytrip.pojo.MeetingLocations;
import in.nic.bookmytrip.pojo.MeetingLocationsLocal;
import in.nic.bookmytrip.pojo.MeetingPurpose;
import in.nic.bookmytrip.pojo.OfficialsCount;
import in.nic.bookmytrip.pojo.Response;
import in.nic.bookmytrip.pojo.TripMode;
import in.nic.bookmytrip.pojo.VehicleTimings;
import in.nic.bookmytrip.service.VehicleBooking_Service;

@RestController
@RequestMapping("/api/staff/booking")
@CrossOrigin(origins="http://10.163.19.174:4200")
public class VehicleBooking_Controller {
	
	@Autowired
	private VehicleBooking_Service staffService;
	
	@GetMapping("/defaultBookingProperties")
	public List<DefaultBookingProperties> getdefaultBookingProperties() {
		List<DefaultBookingProperties> defaultBookingProperties = staffService.getDefaultBookingProperties();
		return defaultBookingProperties;
	}
	
	@GetMapping("/meetingLocations")
	public List<MeetingLocations> getMeetingLocations() {
		List<MeetingLocations> meetingLocations = staffService.getMeetingLocations();
		return meetingLocations;
	}
	
	@GetMapping("/meetingPurposes")
	public List<MeetingPurpose> getMeetingPurpose() {
		List<MeetingPurpose> meetingPurpose = staffService.getMeetingPurpose();
		return meetingPurpose;
	}
	
	@GetMapping("/passengersCount")
	public List<OfficialsCount> getPassengersCount() {
		List<OfficialsCount> passengersCount = staffService.getOfficialsCount();
		return passengersCount;
	}
	
	@GetMapping("/tripModes")
	public List<TripMode> getTripMode() {
		List<TripMode> tripMode = staffService.getTripMode();
		return tripMode;
	}
	
	@GetMapping("/bookingTimings")
	public List<VehicleTimings> getVehicleTimings() {
		List<VehicleTimings> bookingTimings = staffService.getVehicleTimings();
		return bookingTimings;
	}
	
	@GetMapping("/meetingLocationsLocal")
	public List<MeetingLocationsLocal> getMeetingLocationsLocal(
			@RequestParam(value="userId") int empId) {
		
		List<MeetingLocationsLocal> meetingLocationsLocal = staffService.getMeetingLocationsLocal(empId);
		return meetingLocationsLocal;
	}
	
	@PostMapping("/newBooking")
	public Response makeNewBooking(@RequestBody VehicleBookingForm formData) {
		//receive json values and set to dto object
		System.out.println(formData);
		return staffService.makeNewBooking(formData);
	}
	
}
