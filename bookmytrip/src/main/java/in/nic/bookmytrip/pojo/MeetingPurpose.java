package in.nic.bookmytrip.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name="mst_meeting_purpose")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MeetingPurpose {
	
	@Id
	@Column(name="purpose_id")
	private Integer id;
	
	@Column(name="purpose_desc")
	private String purpose;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	@Override
	public String toString() {
		return "MeetingPurpose [id=" + id + ", purpose=" + purpose + "]";
	}

}
