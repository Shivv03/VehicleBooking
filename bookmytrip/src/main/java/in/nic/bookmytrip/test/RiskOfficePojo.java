package in.nic.bookmytrip.test;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * @author Meenakshi D
 * @since 2018/12/24
 * @version 0.1
 */

public class RiskOfficePojo extends UtilPojo implements Serializable{

	private static final long serialVersionUID = 1L;

	@GenericGenerator(name = "sequence", strategy = "sequence", parameters = {
			@Parameter(name = "sequence", value = "audit.camp_trans_risk_office_risk_office_id_seq")})
	@Id
	@GeneratedValue(generator = "sequence")
	@Column(name = "risk_office_id", unique = true, nullable = false)
	private Integer riskOfficeId;
	
	@JoinColumn(name="risk_id",referencedColumnName="risk_id")
	@ManyToOne(cascade = CascadeType.ALL)
	private RiskPojoNew riskId;
	
    private Integer department_code ;
    
    private Integer institution_code ;

	public Integer getRiskOfficeId() {
		return riskOfficeId;
	}

	public void setRiskOfficeId(Integer riskOfficeId) {
		this.riskOfficeId = riskOfficeId;
	}

	public RiskPojoNew getRiskId() {
		return riskId;
	}

	public void setRiskId(RiskPojoNew riskId) {
		this.riskId = riskId;
	}

	public Integer getDepartment_code() {
		return department_code;
	}

	public void setDepartment_code(Integer department_code) {
		this.department_code = department_code;
	}

	public Integer getInstitution_code() {
		return institution_code;
	}

	public void setInstitution_code(Integer institution_code) {
		this.institution_code = institution_code;
	}

	@Override
	public String toString() {
		return "RiskOfficePojo [riskOfficeId=" + riskOfficeId + ", department_code=" + department_code
				+ ", institution_code=" + institution_code + "]";
	}

}