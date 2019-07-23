package in.nic.bookmytrip.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.nic.bookmytrip.dto.VehicleBookingAcknowledgementForm;
import in.nic.bookmytrip.repository.EmployeeRepository;
import in.nic.bookmytrip.service.VehicleBookingAcknowledgement_Service;

@Service
public class VehicleBookingAcknowledgement_ServiceImpl implements VehicleBookingAcknowledgement_Service {
	
	@Autowired
	private EmployeeRepository staffRepository;
	
	@Override
	public List<VehicleBookingAcknowledgementForm> getBookingAcknowledgements(String empId) {
		
		List<Object[]> resultgrid = staffRepository.getBookingAcknowledgements(empId);
		System.out.println(resultgrid.toArray().toString());
		List<VehicleBookingAcknowledgementForm> AllotmentGrid = new ArrayList<VehicleBookingAcknowledgementForm>();
		
		resultgrid.forEach(e->{
			VehicleBookingAcknowledgementForm pojo = new VehicleBookingAcknowledgementForm();
			pojo.setEmpname ((String) e[30]);
			pojo.setBookingNo ((String) e[4]);
			pojo.setBookingDate((String) e[27]);
			pojo.setStartPoint((String) e[11]);
			pojo.setEndPoint((String) e[12]);
			pojo.setStartTime((String) e[28]);
			pojo.setEndTime((String) e[29]);
			pojo.setDriverMob ((String) e[26]);
			pojo.setVehicleNumber((String) e[25]);
			AllotmentGrid.add(pojo);
		});
		
		return AllotmentGrid;
	}

}
