package in.nic.bookmytrip.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name="mst_no_of_officials")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OfficialsCount {
	
	@Id
	@Column(name="no_of_officials")
	private String noOfOfficials;

	public String getNoOfOfficials() {
		return noOfOfficials;
	}

	public void setNoOfOfficials(String noOfOfficials) {
		this.noOfOfficials = noOfOfficials;
	}

	@Override
	public String toString() {
		return "OfficialsCount [noOfOfficials=" + noOfOfficials + "]";
	}
	
	

}
