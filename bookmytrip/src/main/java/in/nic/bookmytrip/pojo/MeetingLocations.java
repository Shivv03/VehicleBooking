package in.nic.bookmytrip.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name="mst_meeting_location_backup")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MeetingLocations {
	
	@Id
	@Column(name="location_id")
	private short locationId;
	
	@Column(name="location_desc")
	private String locationDesc;
	
	@Column(name="emp_id")
	private String employeeId;

	public short getLocationId() {
		return locationId;
	}

	public void setLocationId(short locationId) {
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
		return "MeetingLocations [locationId=" + locationId + ", locationDesc=" + locationDesc + ", employeeId="
				+ employeeId + "]";
	}
	
}
