package in.nic.bookmytrip.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonInclude;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class VehicleBookingForm {
	
	@NotNull
	@NotBlank
	@Pattern(regexp="^\\d{1,7}$",message="Can only contain digits(0-9)")
	private String empId;
	
	@NotNull
	@NotBlank
	/*@Pattern(regexp="^[a-z ,.'-]+$/i")*/
	private String guestName;
	
	@NotNull
	@NotBlank
	/*@Pattern(regexp="(^$|[0-9]{10})")*/
	@Pattern(regexp = "[0-9]{10}",message="Invalid Phone Number")
	private String guestMobile;
	
	private String vehicleNo;
	
	@NotNull
	@NotBlank
	private String journeyDate;
	
	@NotNull
	@NotBlank
	private String startTime;
	
	@NotNull
	@NotBlank
	private String endTime;
	
	@NotNull
	@NotBlank
	private String startPoint;
	
	@NotNull
	@NotBlank
	private String endPoint;
	
	
	private String flightNo;
	
	private String flightTime;
	
	private String routeVia;
	
	@NotNull
	@NotBlank
	private String meetingPurpose;
	
	@NotNull
	@NotBlank
	@Pattern(regexp="[\\d]")
	@Size(min = 1, max = 1)
	private String passengerCount;
	
	@NotNull
	@NotBlank
	@Pattern(regexp = "[Y|N]", message = "Field Should either be 'Y' or 'N'")
	private String roundTrip;
	
	@NotNull
	@NotBlank
	@Pattern(regexp="^\\d{1,7}$",message="Can only contain digits(0-9)")
	private String bookedFor;

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getGuestName() {
		return guestName;
	}

	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}

	public String getGuestMobile() {
		return guestMobile;
	}

	public void setGuestMobile(String guestMobile) {
		this.guestMobile = guestMobile;
	}

	public String getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public String getJourneyDate() {
		return journeyDate;
	}

	public void setJourneyDate(String journeyDate) {
		this.journeyDate = journeyDate;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getStartPoint() {
		return startPoint;
	}

	public void setStartPoint(String startPoint) {
		this.startPoint = startPoint;
	}

	public String getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(String endPoint) {
		this.endPoint = endPoint;
	}

	public String getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}

	public String getFlightTime() {
		return flightTime;
	}

	public void setFlightTime(String flightTime) {
		this.flightTime = flightTime;
	}

	public String getRouteVia() {
		return routeVia;
	}

	public void setRouteVia(String routeVia) {
		this.routeVia = routeVia;
	}

	public String getMeetingPurpose() {
		return meetingPurpose;
	}

	public void setMeetingPurpose(String meetingPurpose) {
		this.meetingPurpose = meetingPurpose;
	}

	public String getPassengerCount() {
		return passengerCount;
	}

	public void setPassengerCount(String passengerCount) {
		this.passengerCount = passengerCount;
	}

	public String getRoundTrip() {
		return roundTrip;
	}

	public void setRoundTrip(String roundTrip) {
		this.roundTrip = roundTrip;
	}

	public String getBookedFor() {
		return bookedFor;
	}

	public void setBookedFor(String bookedFor) {
		this.bookedFor = bookedFor;
	}
	
}