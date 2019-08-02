/**
 * 
 */
package in.nic.bookmytrip.service;

import java.util.List;

import in.nic.bookmytrip.dto.VehicleCancelForm;
import in.nic.bookmytrip.pojo.SuccessResponse;

/**
 * @author Shiva
 * Created On 31-Jul-2019
 *
 */
public interface VehicleCancel_Service {


	SuccessResponse cancelBooking(int bookingId);

	List<VehicleCancelForm> getBookingsList(String bookingDate);

}
