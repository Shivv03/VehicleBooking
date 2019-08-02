package in.nic.bookmytrip.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import in.nic.bookmytrip.dto.VehicleBookingForm;
import in.nic.bookmytrip.pojo.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, String>,EmployeeRepositoryCustom{
	
	@Query(nativeQuery = true, value ="select status as message from vehicle_available_slot_status_update"
			+ "("
			+ ":#{#formData.empId}, :#{#formData.guestName}, :#{#formData.guestMobile}, :#{#formData.vehicleNo},"
			+ ":#{#formData.journeyDate}, :#{#formData.startTime}, :#{#formData.endTime}, :#{#formData.startPoint},"
			+ ":#{#formData.endPoint}, :#{#formData.flightNo}, :#{#formData.flightTime}, :#{#formData.routeVia},"
			+ ":#{#formData.meetingPurpose}, :#{#formData.passengerCount}, :#{#formData.roundTrip}, :#{#formData.bookedFor}"
			+ ")"
			)
	String makeNewBooking(@Param("formData")VehicleBookingForm formData);
	
	
	
	@Query(nativeQuery = true, value ="select char_booking_date as date,vehicle_code as vehicle_number,alloted as alloted_slot,notalloted as available_slots from vehicle_booked_slot_rep_fun(:bookingDate)")
	List<Object[]> getAllotmentReport(@Param("bookingDate") String bookingDate);
	
	
	
	@Query(nativeQuery = true, value ="select *," + 
			"(select vehicle_no from mst_vehicle WHERE vehicle_code = vbs.vehicle_code) as vehicle_num," + 
			"(select driver_mobile from mst_vehicle WHERE vehicle_code = vbs.vehicle_code) as driver_mob," + 
			"to_char(booking_date,'dd/mm/yyyy') as char_booking_date,to_char(start_time,'HH:MI') as char_start_time," + 
			"to_char(end_time,'HH:MI') as char_end_time," + 
			"(select emp_name from mst_emp_login where emp_id = vbs.emp_id) as emp_name " + 
			"from vehicle_booked_slot vbs WHERE emp_id = :empId and confirmation_status = 'S' and booking_date\\:\\:date >= now()\\:\\:date " + 
			"ORDER BY booking_date desc")
	List<Object[]> getBookingAcknowledgements(@Param("empId")String empId);
	
	
	
	@Query(nativeQuery = true, value ="select booking_no, booked_for_id as emp_id, guest_name as emp_name," + 
			"(select vehicle_no from mst_vehicle where vehicle_code = v.vehicle_code) as vehicle_no," + 
			"start_point, end_point, via_route, purpose_of_visit," + 
			"to_char(v.booking_date,'dd/mm/yyyy') as booking_date, to_char(v.start_time,'HH:MI am') as char_start_time," + 
			"to_char(v.end_time,'HH:MI am') as char_end_time, no_of_officials," + 
			"(CASE WHEN round_trip = 'Y' THEN 'Round Trip' ELSE 'One Way' END) as mean_round_trip," + 
			"(select booking_status_desc FROM mst_booking_status WHERE booking_status_code = v.confirmation_status) as status_desc " + 
			"from vehicle_booked_slot v " + 
			"WHERE booking_date\\:\\:date >= to_date(:bookingDate,'dd/mm/yyyy')  and confirmation_status <> 'C'" + 
			"ORDER BY booking_no\\:\\:numeric") 
	List<Object[]> getBookingsList(@Param("bookingDate")String bookingDate);



	@Query("select new Employee(e.employeeId,e.employeeName,e.employeeMobile) from Employee e where e.employeeRole='2' or e.employeeRole='1' or e.employeeRole='2' ")
	List<Employee> getEmployees();

	@Query("select new Employee(e.employeeId,e.employeeName,e.employeeMobile) from Employee e where e.employeeId = :empId ")
	Employee getEmployeeById(@Param("empId")String empId);
	
	
	
	@Query(nativeQuery = true, value ="SELECT * from vehicle_booked_cancelled(:bookingId)") 
	String cancelBooking(@Param("bookingId")Integer bookingId);



	@Query(nativeQuery = true, value ="SELECT v.booking_no, v.booked_for_id as emp_id,guest_name as emp_name,"
			+ " (select vehicle_no from mst_vehicle where vehicle_code = v.vehicle_code) as vehicle_no ,"
			+ " v.start_point, v.end_point	, to_char(v.booking_date,'dd/mm/yyyy') as booking_date,"
			+ "to_char(v.start_time,'HH:MI am') as char_start_time,"
			+ "to_char(v.end_time,'HH:MI am') as char_end_time,"
			+ "(select booking_status_desc FROM mst_booking_status "
			+ "WHERE booking_status_code = v.confirmation_status) as status_desc FROM vehicle_booked_slot v "
			+ "WHERE booking_date\\:\\:date >= to_date(:bookingDate,'dd/mm/yyyy') and "
			+ "(CASE WHEN ((select distinct emp_role from mst_emp_login WHERE emp_id = '\"+empId+\"' ) = 5)"
			+ " THEN emp_id = '\"+empId+\"' else booked_for_id = '\"+empId+\"' end) and"
			+ " confirmation_status <> 'C' ORDER BY booking_no\\:\\:numeric") 
	List<Object[]> getBookingsList_forCancelMenu(@Param("bookingDate")String bookingDate);



	
	
	
	
}
