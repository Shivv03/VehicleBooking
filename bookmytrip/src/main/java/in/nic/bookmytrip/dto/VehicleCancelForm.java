/**
 * 
 */
package in.nic.bookmytrip.dto;

/**
 * @author Shiva
 * Created On 02-Aug-2019
 *
 */
public class VehicleCancelForm {
	
	private String bookingNo;
	
	private String empId;
	
	private String empname;
	
	private String vehicleNumber;
	
	private String startPoint;
	
	private String endPoint;
	
	private String bookingDate;
	
	private String startTime;
	
	private String endTime;

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

	public String getStatusdescription() {
		return statusdescription;
	}

	public void setStatusdescription(String statusdescription) {
		this.statusdescription = statusdescription;
	}

	@Override
	public String toString() {
		return "VehicleCancelForm [bookingNo=" + bookingNo + ", empId=" + empId + ", empname=" + empname
				+ ", vehicleNumber=" + vehicleNumber + ", startPoint=" + startPoint + ", endPoint=" + endPoint
				+ ", bookingDate=" + bookingDate + ", startTime=" + startTime + ", endTime=" + endTime
				+ ", statusdescription=" + statusdescription + "]";
	}

	
}
