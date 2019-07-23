package in.nic.bookmytrip.serviceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import in.nic.bookmytrip.dto.VehicleBookingForm;
import in.nic.bookmytrip.exceptions.DuplicateEntryException;
import in.nic.bookmytrip.exceptions.DataNotFoundException;
import in.nic.bookmytrip.pojo.DefaultBookingProperties;
import in.nic.bookmytrip.pojo.MeetingLocations;
import in.nic.bookmytrip.pojo.MeetingLocationsLocal;
import in.nic.bookmytrip.pojo.MeetingPurpose;
import in.nic.bookmytrip.pojo.OfficialsCount;
import in.nic.bookmytrip.pojo.Response;
import in.nic.bookmytrip.pojo.TripMode;
import in.nic.bookmytrip.pojo.VehicleTimings;
import in.nic.bookmytrip.repository.EmployeeRepository;
import in.nic.bookmytrip.repository.MeetingLocationsLocalRepository;
import in.nic.bookmytrip.service.VehicleBooking_Service;

@Service
public class VehicleBooking_ServiceImpl implements VehicleBooking_Service {

	@Autowired
	private EmployeeRepository staffRepository;
	
	@Autowired
	private MeetingLocationsLocalRepository locationsRepo;

	@Override
	public List<TripMode> getTripMode() {
		return staffRepository.getAll("From TripMode", new HashMap<String,Object>());
	}

	@Override
	public List<MeetingPurpose> getMeetingPurpose() {
		return staffRepository.getAll("From MeetingPurpose", new HashMap<String,Object>());
	}

	@Override
	public List<OfficialsCount> getOfficialsCount() {
		return staffRepository.getAll("From OfficialsCount", new HashMap<String,Object>());
	}

	@Override
	public List<MeetingLocations> getMeetingLocations() {
		return staffRepository.getAll("From MeetingLocations", new HashMap<String,Object>());
	}

	@Override
	public List<VehicleTimings> getVehicleTimings() {
		return staffRepository.getAll("From VehicleTimings", new HashMap<String,Object>());
	}

	@Override
	public List<DefaultBookingProperties> getDefaultBookingProperties() {
		return staffRepository.getAll("From DefaultBookingProperties", new HashMap<String,Object>());
	}
	
	
	@Override
	public List<MeetingLocationsLocal> getMeetingLocationsLocal(int empId) {
		HashMap<String,Object> params = new HashMap<String,Object>();
		params.put("empId", String.valueOf(empId));
		params.put("DefaultEmpId","9999");
		return staffRepository.getAll("From MeetingLocationsLocal where employeeId=:empId or employeeId=:DefaultEmpId",params);
	}
	
	@Override
	public MeetingLocationsLocal getMeetingLocationLocalById(Integer locationId) {
		Optional<MeetingLocationsLocal> result = locationsRepo.findById(locationId);
		MeetingLocationsLocal meetingLocationsLocal = null;
		
		if(result.isPresent()) {
			meetingLocationsLocal = result.get();
		}
		else {
			throw new DataNotFoundException("Location Id not found -"+locationId);
		}
		
		return meetingLocationsLocal;
	}
	
	
	@Override
	public Response addMeetingLocationLocal(String locationDesc, String employeeId) {
		
		//converting to lowercase to enable string matching
				String templocationDesc = locationDesc.toLowerCase();
				
		MeetingLocationsLocal tempLocation;
		Response response = null;
		boolean exist = locationsRepo.checkExistance(templocationDesc, employeeId);
		
		if(exist) {
			throw new DuplicateEntryException("Location Already Exists!");
		}
		else {
			tempLocation = new MeetingLocationsLocal(locationDesc, employeeId);
			locationsRepo.save(tempLocation);
			response = new Response(HttpStatus.OK.value(), "Location Added Successfully");
		}
		
		return response;				
	}
	
	@Override
	public Response updateMeetingLocationsLocal(Integer locationId, String locationDesc, String employeeId) {
		//converting to lowercase to enable string matching
		String templocationDesc = locationDesc.toLowerCase();
		
		MeetingLocationsLocal tempLocation;
		Response response = null;
		boolean exist = locationsRepo.checkExistance(templocationDesc, employeeId);
		
		if(exist) {
			throw new DuplicateEntryException("Location Already Exists!");
		}
		else {
			tempLocation = new MeetingLocationsLocal(locationId,locationDesc, employeeId);
			locationsRepo.save(tempLocation);
			response = new Response(HttpStatus.OK.value(), "Location Updated Successfully");
		}
	
		return response;
	}
	
	
	@Override
	public Response deleteLocationLocal(Integer locationId) {
		
		locationsRepo.deleteById(locationId);
		Response response = new Response(HttpStatus.OK.value(), "Location Deleted Successfully");
		
		return response;
	}

	@Override
	public Response makeNewBooking(VehicleBookingForm formData) {
		
		String message = staffRepository.makeNewBooking(formData);
		Response response = new Response(message);
		return response;
	}

	

	
	
	


}
