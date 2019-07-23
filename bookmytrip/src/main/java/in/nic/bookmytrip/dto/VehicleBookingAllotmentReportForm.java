package in.nic.bookmytrip.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VehicleBookingAllotmentReportForm {
	
	private String date;
	
	private String vehicle_number;
	
	private String alloted_slot;
	
	private String available_slots;

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getVehicle_number() {
		return vehicle_number;
	}

	public void setVehicle_number(String vehicle_number) {
		this.vehicle_number = vehicle_number;
	}

	public String getAlloted_slot() {
		return alloted_slot;
	}

	public void setAlloted_slot(String alloted_slot) {
		this.alloted_slot = alloted_slot;
	}

	public String getAvailable_slots() {
		return available_slots;
	}

	public void setAvailable_slots(String available_slots) {
		this.available_slots = available_slots;
	}

	@Override
	public String toString() {
		return "VehicleBookingAllotmentReportForm [date=" + date + ", vehicle_number=" + vehicle_number
				+ ", alloted_slot=" + alloted_slot + ", available_slots=" + available_slots + "]";
	}

	public VehicleBookingAllotmentReportForm(String date, String vehicle_number, String alloted_slot,
			String available_slots) {
		this.date = date;
		this.vehicle_number = vehicle_number;
		this.alloted_slot = alloted_slot;
		this.available_slots = available_slots;
	}

	public VehicleBookingAllotmentReportForm() {
		// TODO Auto-generated constructor stub
	}
	
	

}
