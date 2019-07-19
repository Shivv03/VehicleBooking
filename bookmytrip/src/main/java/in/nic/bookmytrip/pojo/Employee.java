package in.nic.bookmytrip.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name="mst_emp_login")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Employee {
	
	
	
	@Id
	@Column(name="emp_id")
	private String employeeId;
	
	@Column(name="emp_name")
	private String employeeName;
	
	@Column(name="emp_dob")
	private String employeeDob;
	
	@Column(name="emp_email")
	private String employeeEmail;
	
	@Column(name="emp_designation")
	private String employeeDesignation;
	
	@Column(name="emp_password")
	private String employeePassword;
	
	@Column(name="emp_role")
	private Integer employeeRole;
	
	@Column(name="emp_mobile")
	private String employeeMobile;
	
	@Column(name="emp_role_type")
	private String employeeRoleType;

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeDob() {
		return employeeDob;
	}

	public void setEmployeeDob(String employeeDob) {
		this.employeeDob = employeeDob;
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	public String getEmployeeDesignation() {
		return employeeDesignation;
	}

	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}

	public String getEmployeePassword() {
		return employeePassword;
	}

	public void setEmployeePassword(String employeePassword) {
		this.employeePassword = employeePassword;
	}

	public Integer getEmployeeRole() {
		return employeeRole;
	}

	public void setEmployeeRole(Integer employeeRole) {
		this.employeeRole = employeeRole;
	}

	public String getEmployeeMobile() {
		return employeeMobile;
	}

	public void setEmployeeMobile(String employeeMobile) {
		this.employeeMobile = employeeMobile;
	}

	public String getEmployeeRoleType() {
		return employeeRoleType;
	}

	public void setEmployeeRoleType(String employeeRoleType) {
		this.employeeRoleType = employeeRoleType;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeDob=" + employeeDob
				+ ", employeeEmail=" + employeeEmail + ", employeeDesignation=" + employeeDesignation
				+ ", employeePassword=" + employeePassword + ", employeeRole=" + employeeRole + ", employeeMobile="
				+ employeeMobile + ", employeeRoleType=" + employeeRoleType + "]";
	}

	public Employee(String employeeId, String employeeName) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}



	public Employee(Integer employeeRole) {
		this.employeeRole = employeeRole;
	}

	public Employee() {
		
	}
	
	
	
	
	
	
	
}
