package in.nic.bookmytrip.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name="mst_meeting_location")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MeetingLocationsLocal {
	
	@Id
	@Column(name="location_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer locationId;
	
	@Column(name="location_desc")
	private String locationDesc;
	
	@Column(name="emp_id")
	private String employeeId;
	
	public MeetingLocationsLocal(String locationDesc, String employeeId) {
		this.locationDesc = locationDesc;
		this.employeeId = employeeId;
	}

	public MeetingLocationsLocal() {

	}

	public MeetingLocationsLocal(Integer locationId, String locationDesc, String employeeId) {
		this.locationId = locationId;
		this.locationDesc = locationDesc;
		this.employeeId = employeeId;
	}


	public Integer getLocationId() {
		return locationId;
	}

	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}

	public String getLocationDesc() {
		return locationDesc;
	}

	public void setLocationDesc(String locationDesc) {
		this.locationDesc = locationDesc;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	@Override
	public String toString() {
		return "MeetingLocationsLocal [locationId=" + locationId + ", locationDesc=" + locationDesc + ", employeeId="
				+ employeeId + "]";
	}


}
