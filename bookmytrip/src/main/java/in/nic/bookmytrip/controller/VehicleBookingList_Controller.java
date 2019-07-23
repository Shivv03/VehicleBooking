package in.nic.bookmytrip.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.nic.bookmytrip.dto.QueryData;
import in.nic.bookmytrip.dto.VehicleBookingListForm;
import in.nic.bookmytrip.service.VehicleBookingList_Service;

@RestController
@RequestMapping("/api/staff/bookings")
@CrossOrigin(origins="http://10.163.19.174:4200")
public class VehicleBookingList_Controller {
	
	@Autowired
	private VehicleBookingList_Service bookingsListService;
	
	@PostMapping("/list")
	public List<VehicleBookingListForm> getBookings(@RequestBody QueryData tempData) {
		System.out.println("here");
		List<VehicleBookingListForm> bookings = bookingsListService.getBookingsList(tempData.getBookingDate()); 
		
		return bookings;
	}

}
