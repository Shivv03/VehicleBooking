package in.nic.bookmytrip.service;

import java.util.List;

import in.nic.bookmytrip.dto.VehicleBookingListForm;

public interface VehicleBookingList_Service {
	
	public List<VehicleBookingListForm> getBookingsList(String bookingDate);

}
