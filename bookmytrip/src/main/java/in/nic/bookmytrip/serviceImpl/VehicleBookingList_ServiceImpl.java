package in.nic.bookmytrip.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.nic.bookmytrip.dto.VehicleBookingListForm;
import in.nic.bookmytrip.repository.EmployeeRepository;
import in.nic.bookmytrip.service.VehicleBookingList_Service;

@Service
public class VehicleBookingList_ServiceImpl implements VehicleBookingList_Service {
	
	@Autowired
	private EmployeeRepository staffRepository;

	@Override
	public List<VehicleBookingListForm> getBookingsList(String bookingDate) {
		
		
		List<Object[]> resultgrid = staffRepository.getBookingsList(bookingDate);
		
		List<VehicleBookingListForm> AllotmentGrid = new ArrayList<VehicleBookingListForm>();
		
		resultgrid.forEach(e->{
			VehicleBookingListForm pojo = new VehicleBookingListForm();
			pojo.setBookingDate((String) e[8]); /*((String) e[30]);*/
			pojo.setBookingNo((String) e[0]);
			pojo.setEmpId((String) e[1]);
			pojo.setEmpname((String) e[2]);
			pojo.setStartPoint((String) e[4]);
			pojo.setEndPoint((String) e[5]);
			pojo.setViaRoute((String) e[6]);
			pojo.setStartTime((String) e[9]);
			pojo.setEndTime((String) e[10]);
			pojo.setMeetingPurpose((String) e[7]);
			pojo.setPassengerCount((Integer) e[11]);
			pojo.setStatusdescription((String) e[13]);
			pojo.setTripMode((String) e[12]);
			pojo.setVehicleNumber((String) e[3]);
			AllotmentGrid.add(pojo);
		});
		
		return AllotmentGrid;
	}
	
	

}
