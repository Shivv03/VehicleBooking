package in.nic.bookmytrip.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import in.nic.bookmytrip.dto.VehicleBookingForm;
import in.nic.bookmytrip.pojo.DefaultBookingProperties;

public interface EmployeeRepository extends JpaRepository<DefaultBookingProperties, String>,EmployeeRepositoryCustom{
	
	@Query(nativeQuery = true, value ="select status as message from vehicle_available_slot_status_update"
			+ "("
			+ ":#{#formData.empId}, :#{#formData.guestName}, :#{#formData.guestMobile}, :#{#formData.vehicleNo},"
			+ ":#{#formData.journeyDate}, :#{#formData.startTime}, :#{#formData.endTime}, :#{#formData.startPoint},"
			+ ":#{#formData.endPoint}, :#{#formData.flightNo}, :#{#formData.flightTime}, :#{#formData.routeVia},"
			+ ":#{#formData.meetingPurpose}, :#{#formData.passengerCount}, :#{#formData.roundTrip}, :#{#formData.bookedFor}"
			+ ")"
			)
	String makeNewBooking(@Param("formData")VehicleBookingForm formData);
	
	
}
