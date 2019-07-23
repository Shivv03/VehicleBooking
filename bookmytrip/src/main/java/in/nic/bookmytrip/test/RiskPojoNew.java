package in.nic.bookmytrip.test;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.springframework.format.annotation.DateTimeFormat;

public class RiskPojoNew extends UtilPojo implements Serializable {

	private static final long serialVersionUID = 1L;

	@GenericGenerator(name = "sequence", strategy = "sequence", parameters = {
			@Parameter(name = "sequence", value = "audit.camp_trans_risk_risk_id_seq")})
	@Id
	@GeneratedValue(generator = "sequence")
	@Column(name = "risk_id", unique = true, nullable = false)
	private Integer riskId;
	
    private String fin_year;
    
    private Integer aap_id ;
    
    private Integer topic_id ;
    
    private String topic_title ;
    
    private Integer office_code ;
    
    private Integer risk_method_id ;
    
    private Integer prepared_by ;
    
    private Integer marked_to ;
    
    private Integer risk_status ;
    
    private String risk_status_desc ;
    
    private String risk_unique_id ;
    
    private Integer risk_method_status ;
    
    private String risk_method_status_desc ;
    
    private Integer r_created_by ;
    
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.TIMESTAMP)
    private Date r_created_on ;
    
    private Integer r_last_updated_by ;
    
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.TIMESTAMP)
    private Date r_last_updated_on ;
    
    private Integer risk_method_prepared_by ;
    
    private Integer risk_method_marked_to ;
    
    @OneToMany(fetch = FetchType.EAGER, mappedBy="riskId",cascade={CascadeType.ALL})
	private List<RiskTransactionPojo> transactionList;
    
   /* @OneToMany(fetch = FetchType.EAGER, mappedBy="riskId",cascade={CascadeType.ALL})
	private List<RiskTransactionHistoryPojo> transactionHistoryList;*/
    
    @OneToMany(fetch = FetchType.EAGER, mappedBy="riskId",cascade={CascadeType.ALL})
   	private List<RiskOfficePojo> officeList;

   /* @OneToMany(fetch = FetchType.EAGER, mappedBy="riskId",cascade={CascadeType.ALL})
   	private List<RiskOfficeHistoryPojo> officeHistoryList;*/
    
   /* @OneToMany(fetch = FetchType.EAGER, mappedBy="riskId",cascade={CascadeType.ALL})
   	private List<RiskWorkFlowPojoNew> WorkFlowList;*/
    
    private Boolean task_completed;
    
	public List<RiskTransactionPojo> getTransactionList() {
		return transactionList;
	}

	public void setTransactionList(List<RiskTransactionPojo> transactionList) {
		this.transactionList = transactionList;
	}

	public Integer getRiskId() {
		return riskId;
	}

	public void setRiskId(Integer riskId) {
		this.riskId = riskId;
	}

	public String getFin_year() {
		return fin_year;
	}

	public void setFin_year(String fin_year) {
		this.fin_year = fin_year;
	}

	public Integer getAap_id() {
		return aap_id;
	}

	public void setAap_id(Integer aap_id) {
		this.aap_id = aap_id;
	}

	public Integer getTopic_id() {
		return topic_id;
	}

	public void setTopic_id(Integer topic_id) {
		this.topic_id = topic_id;
	}

	public String getTopic_title() {
		return topic_title;
	}

	public void setTopic_title(String topic_title) {
		this.topic_title = topic_title;
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

	public String getRisk_status_desc() {
		return risk_status_desc;
	}

	public void setRisk_status_desc(String risk_status_desc) {
		this.risk_status_desc = risk_status_desc;
	}

	public String getRisk_unique_id() {
		return risk_unique_id;
	}

	public void setRisk_unique_id(String risk_unique_id) {
		this.risk_unique_id = risk_unique_id;
	}

	public Integer getRisk_method_status() {
		return risk_method_status;
	}

	public void setRisk_method_status(Integer risk_method_status) {
		this.risk_method_status = risk_method_status;
	}

	public String getRisk_method_status_desc() {
		return risk_method_status_desc;
	}

	public void setRisk_method_status_desc(String risk_method_status_desc) {
		this.risk_method_status_desc = risk_method_status_desc;
	}

	public Integer getR_created_by() {
		return r_created_by;
	}

	public void setR_created_by(Integer r_created_by) {
		this.r_created_by = r_created_by;
	}

	public Date getR_created_on() {
		return r_created_on;
	}

	public void setR_created_on(Date r_created_on) {
		this.r_created_on = r_created_on;
	}

	public Integer getR_last_updated_by() {
		return r_last_updated_by;
	}

	public void setR_last_updated_by(Integer r_last_updated_by) {
		this.r_last_updated_by = r_last_updated_by;
	}

	public Date getR_last_updated_on() {
		return r_last_updated_on;
	}

	public void setR_last_updated_on(Date r_last_updated_on) {
		this.r_last_updated_on = r_last_updated_on;
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

	/*public List<RiskTransactionHistoryPojo> getTransactionHistoryList() {
		return transactionHistoryList;
	}

	public void setTransactionHistoryList(List<RiskTransactionHistoryPojo> transactionHistoryList) {
		this.transactionHistoryList = transactionHistoryList;
	}*/

	public List<RiskOfficePojo> getOfficeList() {
		return officeList;
	}

	public void setOfficeList(List<RiskOfficePojo> officeList) {
		this.officeList = officeList;
	}

	/*public List<RiskOfficeHistoryPojo> getOfficeHistoryList() {
		return officeHistoryList;
	}

	public void setOfficeHistoryList(List<RiskOfficeHistoryPojo> officeHistoryList) {
		this.officeHistoryList = officeHistoryList;
	}*/

	/*public List<RiskWorkFlowPojoNew> getWorkFlowList() {
		return WorkFlowList;
	}

	public void setWorkFlowList(List<RiskWorkFlowPojoNew> workFlowList) {
		WorkFlowList = workFlowList;
	}*/

	public Boolean getTask_completed() {
		return task_completed;
	}

	public void setTask_completed(Boolean task_completed) {
		this.task_completed = task_completed;
	}

	@Override
	public String toString() {
		return "RiskPojoNew [riskId=" + riskId + ", fin_year=" + fin_year + ", aap_id=" + aap_id + ", topic_id="
				+ topic_id + ", topic_title=" + topic_title + ", office_code=" + office_code + ", risk_method_id="
				+ risk_method_id + ", prepared_by=" + prepared_by + ", marked_to=" + marked_to + ", risk_status="
				+ risk_status + ", risk_status_desc=" + risk_status_desc + ", risk_unique_id=" + risk_unique_id
				+ ", risk_method_status=" + risk_method_status + ", risk_method_status_desc=" + risk_method_status_desc
				+ ", r_created_by=" + r_created_by + ", r_created_on=" + r_created_on + ", r_last_updated_by="
				+ r_last_updated_by + ", r_last_updated_on=" + r_last_updated_on + ", risk_method_prepared_by="
				+ risk_method_prepared_by + ", risk_method_marked_to=" + risk_method_marked_to + ", transactionList="
				+ transactionList + ",  officeList=" + officeList
				+ ",WorkFlowList= ]";
	}
    
}