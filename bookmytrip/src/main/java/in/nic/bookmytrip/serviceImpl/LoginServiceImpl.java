package in.nic.bookmytrip.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.nic.bookmytrip.dao.LoginRepository;
import in.nic.bookmytrip.exceptions.DataNotFoundException;
import in.nic.bookmytrip.pojo.Employee;
import in.nic.bookmytrip.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private LoginRepository loginRepository;
	
	@Override
	public List<Employee> findAll() {
		return loginRepository.findAll() ;
	}


	@Override
	public Employee getEmployeeByEmail(String email) {
		
		Employee tempEmployee = loginRepository.getEmployeeByEmail(email);
		if(tempEmployee==null) {
			throw new DataNotFoundException("Invalid Email Address");
		}
		return tempEmployee;
	}

	@Override
	public Employee getEmployeerole(String employeeId, String employeePassword) {
		
		Employee tempEmployee = loginRepository.getEmployeeRole(employeeId, employeePassword);
		if(tempEmployee==null) {
			throw new DataNotFoundException("Incorrect Login Credentials ");
		}
		return tempEmployee;
	}

}
