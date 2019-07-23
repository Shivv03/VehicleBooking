package in.nic.bookmytrip.service;

import java.util.List;

import in.nic.bookmytrip.pojo.Employee;

public interface Login_Service {
	
	public List<Employee> findAll();
	
	public Employee getEmployeeByEmail(String email);
	
	public Employee getEmployeerole(String employeeId,String employeePassword);
	
	
	

}
