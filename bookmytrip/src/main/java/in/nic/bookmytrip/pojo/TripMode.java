package in.nic.bookmytrip.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name="mst_trip_type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TripMode {
	
	@Id
	@Column(name="trip_code")
	private String tripCode;
	
	@Column(name="trip_desc")
	private String tripDesc;

	@Override
	public String toString() {
		return "TripMode [tripCode=" + tripCode + ", tripDesc=" + tripDesc + "]";
	}

	public String getTripCode() {
		return tripCode;
	}

	public void setTripCode(String tripCode) {
		this.tripCode = tripCode;
	}

	public String getTripDesc() {
		return tripDesc;
	}

	public void setTripDesc(String tripDesc) {
		this.tripDesc = tripDesc;
	}
	
	

}
