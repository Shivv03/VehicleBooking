package in.nic.bookmytrip.service;

import java.util.List;

import in.nic.bookmytrip.dto.VehicleBookingAllotmentReportForm;

public interface VehicleAllotmentReport_Service {
	
	List<VehicleBookingAllotmentReportForm> getAllotmentReport(String bookingDate);

}
