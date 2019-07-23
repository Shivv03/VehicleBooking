package in.nic.bookmytrip.test;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

public class RiskWorkFlowPojoNew extends UtilPojo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@GenericGenerator(name = "sequence", strategy = "sequence", parameters = {
	@Parameter(name = "sequence", value = "audit.camp_trans_risk_workflow_risk_wfid_seq")})
	@Id
	@GeneratedValue(generator = "sequence")
	private Integer risk_wfid ;
	
    private Integer office_code ;
	
    private Integer risk_method_id ;
    
    private Integer version_no ;
    
    private String case_note ;
    
    private String up_and_down_flow ;
    
    private Integer prepared_by ;
    
    private Integer marked_to ;
    
    private Integer risk_status ;
    
    private Integer risk_method_prepared_by ;
    
    private Integer risk_method_marked_to ;
    
    private Integer risk_method_status ;
    
    private Integer risk_id;
    
    private String risk_status_desc ;
    
    private String user_name;
    /*@JoinColumn(name="risk_id",referencedColumnName="risk_id")
	@ManyToOne(cascade = CascadeType.ALL)
	private RiskPojoNew riskId;*/

	public Integer getRisk_wfid() {
		return risk_wfid;
	}

	public void setRisk_wfid(Integer risk_wfid) {
		this.risk_wfid = risk_wfid;
	}

	public Integer getOffice_code() {
		return office_code;
	}

	public void setOffice_code(Integer office_code) {
		this.office_code = office_code;
	}

	public Integer getRisk_method_id() {
		return risk_method_id;
	}

	public void setRisk_method_id(Integer risk_method_id) {
		this.risk_method_id = risk_method_id;
	}

	public Integer getVersion_no() {
		return version_no;
	}

	public void setVersion_no(Integer version_no) {
		this.version_no = version_no;
	}

	public String getCase_note() {
		return case_note;
	}

	public void setCase_note(String case_note) {
		this.case_note = case_note;
	}

	public String getUp_and_down_flow() {
		return up_and_down_flow;
	}

	public void setUp_and_down_flow(String up_and_down_flow) {
		this.up_and_down_flow = up_and_down_flow;
	}

	public Integer getPrepared_by() {
		return prepared_by;
	}

	public void setPrepared_by(Integer prepared_by) {
		this.prepared_by = prepared_by;
	}

	public Integer getMarked_to() {
		return marked_to;
	}

	public void setMarked_to(Integer marked_to) {
		this.marked_to = marked_to;
	}

	public Integer getRisk_status() {
		return risk_status;
	}

	public void setRisk_status(Integer risk_status) {
		this.risk_status = risk_status;
	}

	public Integer getRisk_method_prepared_by() {
		return risk_method_prepared_by;
	}

	public void setRisk_method_prepared_by(Integer risk_method_prepared_by) {
		this.risk_method_prepared_by = risk_method_prepared_by;
	}

	public Integer getRisk_method_marked_to() {
		return risk_method_marked_to;
	}

	public void setRisk_method_marked_to(Integer risk_method_marked_to) {
		this.risk_method_marked_to = risk_method_marked_to;
	}

	public Integer getRisk_method_status() {
		return risk_method_status;
	}

	public void setRisk_method_status(Integer risk_method_status) {
		this.risk_method_status = risk_method_status;
	}

/*	public RiskPojoNew getRiskId() {
		return riskId;
	}

	public void setRiskId(RiskPojoNew riskId) {
		this.riskId = riskId;
	}
*/
	public Integer getRisk_id() {
		return risk_id;
	}

	public void setRisk_id(Integer risk_id) {
		this.risk_id = risk_id;
	}
	
	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getRisk_status_desc() {
		return risk_status_desc;
	}

	public void setRisk_status_desc(String risk_status_desc) {
		this.risk_status_desc = risk_status_desc;
	}

	@Override
	public String toString() {
		return "RiskWorkFlowNew [risk_wfid=" + risk_wfid + ", office_code=" + office_code + ", risk_id="
				+ ", risk_method_id=" + risk_method_id + ", version_no=" + version_no + ", case_note=" + case_note
				+ ", up_and_down_flow=" + up_and_down_flow + ", prepared_by=" + prepared_by + ", marked_to=" + marked_to
				+ ", risk_status=" + risk_status + ", risk_method_prepared_by=" + risk_method_prepared_by
				+ ", risk_method_marked_to=" + risk_method_marked_to + ", risk_method_status=" + risk_method_status
				+ "]";
	}
    
}
