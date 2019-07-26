package in.nic.bookmytrip.serviceImpl;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
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
import in.nic.bookmytrip.pojo.Employee;
import in.nic.bookmytrip.pojo.MeetingLocations;
import in.nic.bookmytrip.pojo.MeetingLocationsLocal;
import in.nic.bookmytrip.pojo.MeetingPurpose;
import in.nic.bookmytrip.pojo.OfficialsCount;
import in.nic.bookmytrip.pojo.SuccessResponse;
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
		List<VehicleTimings> timings =  staffRepository.getAll("From VehicleTimings", new HashMap<String,Object>());
		
		//To convert hh:mm:ss format(obtained from query) to hh:mm am/pm format
		timings.forEach(t-> {
			t.setTimings(DateTimeFormatter.ofPattern("hh:mm a").format(LocalTime.parse(t.getTimings())));
		});
		
		return timings;
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
	public SuccessResponse addMeetingLocationLocal(String locationDesc, String employeeId) {
		
		//converting to lowercase to enable string matching
				String templocationDesc = locationDesc.toLowerCase();
				
		MeetingLocationsLocal tempLocation;
		SuccessResponse successResponse = null;
		boolean exist = locationsRepo.checkExistance(templocationDesc, employeeId);
		
		if(exist) {
			throw new DuplicateEntryException("Location Already Exists!");
		}
		else {
			tempLocation = new MeetingLocationsLocal(locationDesc, employeeId);
			locationsRepo.save(tempLocation);
			successResponse = new SuccessResponse(HttpStatus.OK.value(), "Location Added Successfully");
		}
		
		return successResponse;				
	}
	
	@Override
	public SuccessResponse updateMeetingLocationsLocal(Integer locationId, String locationDesc, String employeeId) {
		//converting to lowercase to enable string matching
		String templocationDesc = locationDesc.toLowerCase();
		
		MeetingLocationsLocal tempLocation;
		SuccessResponse successResponse = null;
		boolean exist = locationsRepo.checkExistance(templocationDesc, employeeId);
		
		if(exist) {
			throw new DuplicateEntryException("Location Already Exists!");
		}
		else {
			tempLocation = new MeetingLocationsLocal(locationId,locationDesc, employeeId);
			locationsRepo.save(tempLocation);
			successResponse = new SuccessResponse(HttpStatus.OK.value(), "Location Updated Successfully");
		}
	
		return successResponse;
	}
	
	
	@Override
	public SuccessResponse deleteLocationLocal(Integer locationId) {
		
		locationsRepo.deleteById(locationId);
		SuccessResponse successResponse = new SuccessResponse(HttpStatus.OK.value(), "Location Deleted Successfully");
		
		return successResponse;
	}

	@Override
	public SuccessResponse makeNewBooking(VehicleBookingForm formData) {
		
		String message = staffRepository.makeNewBooking(formData);
		SuccessResponse successResponse = new SuccessResponse(message);
		return successResponse;
	}

	
	@Override
	public List<Employee> findEmployees() {
		
		return staffRepository.getEmployees();
	}

	/* (non-Javadoc)
	 * @see in.nic.bookmytrip.service.VehicleBooking_Service#findEmployeeById()
	 */
	@Override
	public Employee findEmployeeById(String empId) {
		
		return staffRepository.getEmployeeById(empId);
	}

	

	
	
	


}
