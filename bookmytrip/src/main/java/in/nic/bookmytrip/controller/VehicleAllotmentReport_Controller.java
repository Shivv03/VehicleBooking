package in.nic.bookmytrip.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.nic.bookmytrip.dto.QueryData;
import in.nic.bookmytrip.dto.VehicleBookingAllotmentReportForm;
import in.nic.bookmytrip.service.VehicleAllotmentReport_Service;

@RestController
@RequestMapping("/api/staff/allotment")
@CrossOrigin(origins="http://10.163.19.174:4200")
public class VehicleAllotmentReport_Controller {
	
	@Autowired
	private VehicleAllotmentReport_Service vehicleAllotmentService;
	
	
	@PostMapping("/allotmentReport")
	public List<VehicleBookingAllotmentReportForm> getAllotmentReportByDate(@RequestBody QueryData tempData) {
		
			List<VehicleBookingAllotmentReportForm> AllotmentGrid = vehicleAllotmentService.getAllotmentReport(tempData.getBookingDate());
			
		return AllotmentGrid;
		
	}
	
	

}
