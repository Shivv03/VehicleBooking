package in.nic.bookmytrip.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.nic.bookmytrip.dto.VehicleBookingAllotmentReportForm;
import in.nic.bookmytrip.repository.EmployeeRepository;
import in.nic.bookmytrip.service.VehicleAllotmentReport_Service;

@Service
public class VehicleAllotmentReport_ServiceImpl implements VehicleAllotmentReport_Service {
	
	@Autowired
	private EmployeeRepository staffRepository;
	
	@Override
	public List<VehicleBookingAllotmentReportForm> getAllotmentReport(String bookingDate) {
		
		List<Object[]> resultgrid = staffRepository.getAllotmentReport(bookingDate);
		
		List<VehicleBookingAllotmentReportForm> AllotmentGrid = new ArrayList<VehicleBookingAllotmentReportForm>();
		
		resultgrid.forEach(e->{
			VehicleBookingAllotmentReportForm pojo = new VehicleBookingAllotmentReportForm();
			pojo.setDate((String) e[0]);
			pojo.setVehicle_number((String) e[1]);
			pojo.setAlloted_slot((String) e[2]);
			pojo.setAvailable_slots((String) e[3]);
			AllotmentGrid.add(pojo);
		});
		
		return AllotmentGrid;
	}

}
