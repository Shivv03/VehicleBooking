package in.nic.bookmytrip.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.nic.bookmytrip.dto.QueryData;
import in.nic.bookmytrip.dto.VehicleBookingAcknowledgementForm;
import in.nic.bookmytrip.service.VehicleBookingAcknowledgement_Service;

@RestController
@RequestMapping("/api/staff/acknowledgement")
@CrossOrigin(origins="http://10.163.19.174:4200")
public class VehicleBookingAcknowledgement_Controller {
	
	@Autowired
	private VehicleBookingAcknowledgement_Service acknowledgementService;
	
	@PostMapping("/")
	public List<VehicleBookingAcknowledgementForm> getAcknowledgements(@RequestBody QueryData tempData) {
		
		List<VehicleBookingAcknowledgementForm> acknowledgements = acknowledgementService.getBookingAcknowledgements(tempData.getEmpId()); 
		
		return acknowledgements;
	}

}
