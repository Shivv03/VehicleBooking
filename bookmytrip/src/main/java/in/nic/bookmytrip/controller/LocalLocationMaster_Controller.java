/**
 * 
 */
package in.nic.bookmytrip.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.nic.bookmytrip.dto.QueryData;
import in.nic.bookmytrip.pojo.MeetingLocationsLocal;
import in.nic.bookmytrip.pojo.SuccessResponse;
import in.nic.bookmytrip.service.VehicleBooking_Service;

/**
 * @author Shiva
 * Created On 23-Jul-2019
 *
 */


@RestController
@RequestMapping("/api/staff/localLocation")
@CrossOrigin(origins="http://10.163.19.174:4200")
public class LocalLocationMaster_Controller {
	
	
	@Autowired
	private VehicleBooking_Service staffService;
	
	@GetMapping("/meetingLocations")
	public List<MeetingLocationsLocal> getMeetingLocationsLocal(
			@RequestParam(value="empId") int empId) {
		
		List<MeetingLocationsLocal> meetingLocationsLocal = staffService.getMeetingLocationsLocal(empId);
		return meetingLocationsLocal;
	}
	
	@GetMapping("/meetingLocationsById")
	public MeetingLocationsLocal getMeetingLocationLocalById(
			@RequestParam(value="locationId") Integer locationId) {
		
		MeetingLocationsLocal meetingLocationsLocal = staffService.getMeetingLocationLocalById(locationId);
		return meetingLocationsLocal;	
		
	}
	
	@PostMapping("/meetingLocations")
	public SuccessResponse addMeetingLocationLocal(
			@RequestBody QueryData tempdata) {
		
		SuccessResponse successResponse = staffService.addMeetingLocationLocal(tempdata.getLocationDesc(), tempdata.getEmpId());
		return successResponse;	
		
	}
	
	@DeleteMapping("/meetingLocations")
	public SuccessResponse deleteMeetingLocationLocal(
			@RequestParam(value="locationId") Integer locationId) {
		
		SuccessResponse successResponse = staffService.deleteLocationLocal(locationId);
		return successResponse;	
		
	}
	
	@PutMapping("/meetingLocations")
	public SuccessResponse updateMeetingLocationLocal(
			@RequestParam(value="locationId") Integer locationId,
			@RequestBody QueryData tempdata) {
		
		SuccessResponse successResponse = staffService.
				updateMeetingLocationsLocal(locationId,tempdata.getLocationDesc(), tempdata.getEmpId());
		return successResponse;	
		
	}

}
