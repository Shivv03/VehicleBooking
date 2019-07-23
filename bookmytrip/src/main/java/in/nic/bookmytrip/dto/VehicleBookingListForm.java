package in.nic.bookmytrip.dto;

public class VehicleBookingListForm {
	
	private String bookingNo;
	
	private String empId;
	
	private String empname;
	
	private String vehicleNumber;
	
	private String startPoint;
	
	private String endPoint;
	
	private String viaRoute;
	
	private String meetingPurpose;
	
	private String bookingDate;
	
	private String startTime;
	
	private String endTime;
	
	private Integer passengerCount;
	
	private String tripMode;
	
	private String statusdescription;

	public String getBookingNo() {
		return bookingNo;
	}

	public void setBookingNo(String bookingNo) {
		this.bookingNo = bookingNo;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
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

	public String getViaRoute() {
		return viaRoute;
	}

	public void setViaRoute(String viaRoute) {
		this.viaRoute = viaRoute;
	}

	public String getMeetingPurpose() {
		return meetingPurpose;
	}

	public void setMeetingPurpose(String meetingPurpose) {
		this.meetingPurpose = meetingPurpose;
	}

	public String getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
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

	public Integer getPassengerCount() {
		return passengerCount;
	}

	public void setPassengerCount(Integer passengerCount) {
		this.passengerCount = passengerCount;
	}

	public String getTripMode() {
		return tripMode;
	}

	public void setTripMode(String tripMode) {
		this.tripMode = tripMode;
	}

	public String getStatusdescription() {
		return statusdescription;
	}

	public void setStatusdescription(String statusdescription) {
		this.statusdescription = statusdescription;
	}

	@Override
	public String toString() {
		return "VehicleBookingListForm [bookingNo=" + bookingNo + ", empId=" + empId + ", empname=" + empname
				+ ", vehicleNumber=" + vehicleNumber + ", startPoint=" + startPoint + ", endPoint=" + endPoint
				+ ", viaRoute=" + viaRoute + ", meetingPurpose=" + meetingPurpose + ", bookingDate=" + bookingDate
				+ ", startTime=" + startTime + ", endTime=" + endTime + ", passengerCount=" + passengerCount
				+ ", tripMode=" + tripMode + ", statusdescription=" + statusdescription + "]";
	}
	
	

}
