package in.nic.bookmytrip.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.nic.bookmytrip.dto.QueryData;
import in.nic.bookmytrip.dto.VehicleCancelForm;
import in.nic.bookmytrip.pojo.SuccessResponse;
import in.nic.bookmytrip.service.VehicleCancel_Service;

/**
 * @author Shiva
 * Created On 31-Jul-2019
 *
 */
@RestController
@RequestMapping("/api/staff/cancel")
public class VehicleCancel_Controller {
	
	
	private VehicleCancel_Service Service;
	
	@GetMapping("/meetingLocations")
	public ResponseEntity<SuccessResponse> cancelBooking(
			@RequestParam(value="bookingId") int bookingId) {
		 
		SuccessResponse response = Service.cancelBooking(bookingId);
	/*	List<MeetingLocationsLocal> meetingLocationsLocal = Service.cancelBooking(bookingId);*/
		return new ResponseEntity<SuccessResponse>(response, HttpStatus.OK);
	}
	
	@PostMapping("/list")
	public List<VehicleCancelForm> getBookings(@RequestBody QueryData tempData) {
		
		List<VehicleCancelForm> bookings = Service.getBookingsList(tempData.getBookingDate());
		
		return bookings;
	}
	
	
	
	
	
	

}
