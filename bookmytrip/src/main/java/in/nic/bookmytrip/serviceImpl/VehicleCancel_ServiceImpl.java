/**
 * 
 */
package in.nic.bookmytrip.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import in.nic.bookmytrip.dto.VehicleCancelForm;
import in.nic.bookmytrip.pojo.SuccessResponse;
import in.nic.bookmytrip.repository.EmployeeRepository;
import in.nic.bookmytrip.service.VehicleCancel_Service;

/**
 * @author Shiva
 * Created On 31-Jul-2019
 *
 */
public class VehicleCancel_ServiceImpl implements VehicleCancel_Service {

	@Autowired
	private EmployeeRepository staffRepository;
	
	
	@Override
	public SuccessResponse cancelBooking(int bookingId) {

		String message = staffRepository.cancelBooking(bookingId);
		SuccessResponse successResponse = new SuccessResponse(message);
		return successResponse;
		
	}

	@Override
	public List<VehicleCancelForm> getBookingsList(String bookingDate) {
		
		List<Object[]> resultgrid = staffRepository.getBookingsList_forCancelMenu(bookingDate);
		
		List<VehicleCancelForm> bookingGrid = new ArrayList<VehicleCancelForm>();
		
		resultgrid.forEach(e->{
			VehicleCancelForm pojo = new VehicleCancelForm();
			pojo.setBookingNo((String) e[0]);
			pojo.setEmpId((String) e[1]);
			pojo.setEmpname((String) e[2]);
			pojo.setVehicleNumber((String) e[3]);
			pojo.setStartPoint((String) e[4]);
			pojo.setEndPoint((String) e[5]);			
			pojo.setBookingDate((String) e[6]); /*((String) e[30]);*/
			pojo.setStartTime((String) e[7]);
			pojo.setEndTime((String) e[8]);
			pojo.setStatusdescription((String) e[9]);		
			bookingGrid.add(pojo);
		});
		
		return bookingGrid;
	}

}
