package in.nic.bookmytrip.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name="mst_vehicle_time")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VehicleTimings {
	
	@Id
	@Column(name="id")
	private Integer id;
	
	@Column(name="start_time")
	private String timings;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTimings() {
		return timings;
	}

	public void setTimings(String startTime) {
		this.timings = startTime;
	}

	@Override
	public String toString() {
		return "VehicleTimings [id=" + id + ", timings=" + timings + "]";
	}
	
	

}
