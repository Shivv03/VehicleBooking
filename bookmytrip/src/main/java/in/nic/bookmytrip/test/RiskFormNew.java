package in.nic.bookmytrip.test;

import java.util.List;

public class RiskFormNew {

	private String user_name;
	
	private Integer office_code;
	
	private Integer state_code;
	
	private Integer userId;
	
	private Integer form_action;
	
	private boolean approved;
	
	private Integer transaction_level;
	
	private String form_name;
	
	private RiskPojoNew pojo;
	
	private Integer button_type;
	
	private String case_note;

	private Integer current_status;
	
	private List<RiskWorkFlowPojoNew> trail;
	
	public Integer getOffice_code() {
		return office_code;
	}

	public void setOffice_code(Integer office_code) {
		this.office_code = office_code;
	}

	public Integer getState_code() {
		return state_code;
	}

	public void setState_code(Integer state_code) {
		this.state_code = state_code;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getForm_action() {
		return form_action;
	}

	public void setForm_action(Integer form_action) {
		this.form_action = form_action;
	}

	public RiskPojoNew getPojo() {
		return pojo;
	}

	public void setPojo(RiskPojoNew pojo) {
		this.pojo = pojo;
	}

	public Integer getTransaction_level() {
		return transaction_level;
	}

	public void setTransaction_level(Integer transaction_level) {
		this.transaction_level = transaction_level;
	}
	
	public Integer getButton_type() {
		return button_type;
	}

	public void setButton_type(Integer button_type) {
		this.button_type = button_type;
	}

	public boolean getApproved() {
		return approved;
	}

	public void setApproved(boolean approved) {
		this.approved = approved;
	}

	public String getCase_note() {
		return case_note;
	}

	public void setCase_note(String case_note) {
		this.case_note = case_note;
	}
	
	public String getForm_name() {
		return form_name;
	}

	public void setForm_name(String form_name) {
		this.form_name = form_name;
	}

	public List<RiskWorkFlowPojoNew> getTrail() {
		return trail;
	}

	public void setTrail(List<RiskWorkFlowPojoNew> trail) {
		this.trail = trail;
	}
	
	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public Integer getCurrent_status() {
		return current_status;
	}

	public void setCurrent_status(Integer current_status) {
		this.current_status = current_status;
	}

	public RiskFormNew(Integer office_code, Integer state_code, Integer userId, Integer form_action) {
		super();
		this.office_code = office_code;
		this.state_code = state_code;
		this.userId = userId;
		this.form_action = form_action;
	}
	
	public RiskFormNew(Integer office_code, Integer state_code, Integer userId, Integer form_action,
			Integer transaction_level,String form_name,String user_name) {
		super();
		this.office_code = office_code;
		this.state_code = state_code;
		this.userId = userId;
		this.form_action = form_action;
		this.transaction_level = transaction_level;
		this.form_name = form_name;
		this.user_name = user_name;
	}

	public RiskFormNew() {
		super();
	}

	@Override
	public String toString() {
		return "RiskFormNew [office_code=" + office_code + ", state_code=" + state_code + ", userId=" + userId
				+ ", form_action=" + form_action + ", transaction_level=" + transaction_level + ", pojo=" + pojo
				+ ", button_type=" + button_type + "]";
	}
	
}
