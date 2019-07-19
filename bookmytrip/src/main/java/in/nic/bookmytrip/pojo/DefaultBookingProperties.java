package in.nic.bookmytrip.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name="mst_default_properties")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DefaultBookingProperties {
	
	
	@Id
	@Column(name="id")
	private Integer id;
	
	@Column(name="default_days")
	private Integer defaultDays;
	
	@Column(name="holiday_booking_allowed")
	private String holidayBookingAllowed;
	
	@Column(name="max_travel_time")
	private Integer maxTravelTime;
	
	@Column(name="max_wait_time")
	private Integer maxWaitTime;
	
	@Transient
	private Integer minDate;
	
	@Transient
	private Integer maxDate;

	public DefaultBookingProperties() {
		this.setMinDate(1);
		this.setMaxDate(10);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getDefaultDays() {
		return defaultDays;
	}

	public void setDefaultDays(Integer defaultDays) {
		this.defaultDays = defaultDays;
	}

	public String getHolidayBookingAllowed() {
		return holidayBookingAllowed;
	}

	public void setHolidayBookingAllowed(String holidayBookingAllowed) {
		this.holidayBookingAllowed = holidayBookingAllowed;
	}

	public Integer getMaxTravelTime() {
		return maxTravelTime;
	}

	public void setMaxTravelTime(Integer maxTravelTime) {
		this.maxTravelTime = maxTravelTime;
	}

	public Integer getMaxWaitTime() {
		return maxWaitTime;
	}

	public void setMaxWaitTime(Integer maxWaitTime) {
		this.maxWaitTime = maxWaitTime;
	}

	@Override
	public String toString() {
		return "DefaultBookingProperties [id=" + id + ", defaultDays=" + defaultDays + ", holidayBookingAllowed="
				+ holidayBookingAllowed + ", maxTravelTime=" + maxTravelTime + ", maxWaitTime=" + maxWaitTime + "]";
	}

	public Integer getMinDate() {
		return minDate;
	}

	public void setMinDate(Integer minDate) {
		this.minDate = minDate;
	}

	public Integer getMaxDate() {
		return maxDate;
	}

	public void setMaxDate(Integer maxDate) {
		this.maxDate = maxDate;
	}

}
