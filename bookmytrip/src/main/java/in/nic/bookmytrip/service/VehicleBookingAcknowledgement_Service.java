package in.nic.bookmytrip.service;

import java.util.List;

import in.nic.bookmytrip.dto.VehicleBookingAcknowledgementForm;

public interface VehicleBookingAcknowledgement_Service {
	
	List<VehicleBookingAcknowledgementForm> getBookingAcknowledgements(String empId);

}
