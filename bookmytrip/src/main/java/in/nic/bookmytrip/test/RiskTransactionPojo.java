package in.nic.bookmytrip.test;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;


public class RiskTransactionPojo extends UtilPojo implements Serializable{

	private static final long serialVersionUID = 1L;

	@GenericGenerator(name = "sequence", strategy = "sequence", parameters = {
	@Parameter(name = "sequence", value = "audit.camp_trans_risk_transaction_risk_trans_id_seq")})
	@Id
	@GeneratedValue(generator = "sequence")
	@Column(name = "risk_trans_id", unique = true, nullable = false)
	private Integer riskTransId;
	
	@JoinColumn(name="risk_id",referencedColumnName="risk_id" ,nullable = false)
	@ManyToOne(cascade = CascadeType.ALL)
	private RiskPojoNew riskId;
	
	@Column(name = "topic_objective_id")
	private Integer objectiveId;
	
	@Column(name = "category")
	private String category;
	
	@Column(name = "query_id")
	private Integer queryId;
	
	@Column(name = "key_id")
	private String keyId;
	
	@Column(name = "risk_status")
	private Integer riskStatus;

	@Column(name = "department_code")
	private Integer departmentCode;
	
	@Column(name = "institution_code")
	private Integer institutionCode;
	
	@Column(name = "nonkey_id")
	private String nonkeyId;
	
	@Column(name = "qry_tbl_name")
	private String qryTblName;
	
	@Column(name = "nonkey_id_head")
	private String nonkeyIdHead;
	
	@Column(name = "office_code")
	private Integer officeCode;
	
	@Column(name = "audit_program_id")
	private Integer auditProgramId;

	@Transient
	private List<Object[]> queryList;
	
	@Transient
	private List<Object[]> keyIdList;
	
	@Transient
	private List<Object[]> nonKeyIdList;
	
	public Integer getRiskTransId() {
		return riskTransId;
	}

	public void setRiskTransId(Integer riskTransId) {
		this.riskTransId = riskTransId;
	}

	public Integer getObjectiveId() {
		return objectiveId;
	}

	public void setObjectiveId(Integer objectiveId) {
		this.objectiveId = objectiveId;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Integer getQueryId() {
		return queryId;
	}

	public void setQueryId(Integer queryId) {
		this.queryId = queryId;
	}

	public String getKeyId() {
		return keyId;
	}

	public void setKeyId(String keyId) {
		this.keyId = keyId;
	}

	public Integer getRiskStatus() {
		return riskStatus;
	}

	public void setRiskStatus(Integer riskStatus) {
		this.riskStatus = riskStatus;
	}

	public Integer getDepartmentCode() {
		return departmentCode;
	}

	public void setDepartmentCode(Integer departmentCode) {
		this.departmentCode = departmentCode;
	}

	public Integer getInstitutionCode() {
		return institutionCode;
	}

	public void setInstitutionCode(Integer institutionCode) {
		this.institutionCode = institutionCode;
	}

	public String getNonkeyId() {
		return nonkeyId;
	}

	public void setNonkeyId(String nonkeyId) {
		this.nonkeyId = nonkeyId;
	}

	public String getQryTblName() {
		return qryTblName;
	}

	public void setQryTblName(String qryTblName) {
		this.qryTblName = qryTblName;
	}

	public String getNonkeyIdHead() {
		return nonkeyIdHead;
	}

	public void setNonkeyIdHead(String nonkeyIdHead) {
		this.nonkeyIdHead = nonkeyIdHead;
	}

	public Integer getOfficeCode() {
		return officeCode;
	}

	public void setOfficeCode(Integer officeCode) {
		this.officeCode = officeCode;
	}

	
	public Integer getAuditProgramId() {
		return auditProgramId;
	}
	
	public void setAuditProgramId(Integer auditProgramId) {
		this.auditProgramId = auditProgramId;
	}

	public RiskPojoNew getRiskId() {
		return riskId;
	}

	public void setRiskId(RiskPojoNew riskId) {
		this.riskId = riskId;
	}

	public List<Object[]> getQueryList() {
		return queryList;
	}

	public void setQueryList(List<Object[]> queryList) {
		this.queryList = queryList;
	}

	public List<Object[]> getKeyIdList() {
		return keyIdList;
	}

	public void setKeyIdList(List<Object[]> keyIdList) {
		this.keyIdList = keyIdList;
	}
	
	public List<Object[]> getNonKeyIdList() {
		return nonKeyIdList;
	}

	public void setNonKeyIdList(List<Object[]>nonKeyIdList) {
		this.nonKeyIdList = nonKeyIdList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((riskTransId == null) ? 0 : riskTransId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RiskTransactionPojo other = (RiskTransactionPojo) obj;
		if (riskTransId == null) {
			if (other.riskTransId != null)
				return false;
		} else if (!riskTransId.equals(other.riskTransId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RiskTransactionPojo [riskTransId=" + riskTransId + ", objectiveId=" + objectiveId + ", category="
				+ category + ", queryId=" + queryId + ", keyId=" + keyId + ", riskStatus=" + riskStatus
				+ ", departmentCode=" + departmentCode + ", institutionCode=" + institutionCode + ", topicId="
				+ ", nonkeyId=" + nonkeyId + ", qryTblName=" + qryTblName + ", nonkeyIdHead=" + nonkeyIdHead
				+ ", officeCode=" + officeCode + ", auditProgramId=" + auditProgramId + "]";
	}

}