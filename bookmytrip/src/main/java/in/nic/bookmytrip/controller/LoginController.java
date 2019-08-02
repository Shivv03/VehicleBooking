package in.nic.bookmytrip.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.nic.bookmytrip.pojo.Employee;
import in.nic.bookmytrip.service.Login_Service;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="http://10.163.19.174:4200")
public class LoginController {
	
	@Autowired
	private Login_Service loginService;
	
	@GetMapping("/employees")
	public ResponseEntity<List<Employee>> findAllEmployees(){	
		
		List<Employee> empList = loginService.findAll();
		return new ResponseEntity<List<Employee>>(empList,HttpStatus.OK);
	}
	
	
	//api to get userId based on email
	@GetMapping("/login")
	public ResponseEntity<Employee> getEmployeeByEmail(@RequestParam(value="email") String email) {
		
		Employee tempEmployee = loginService.getEmployeeByEmail(email);
		
		return new ResponseEntity<Employee>(tempEmployee,HttpStatus.OK);
	}
	
	//api to get employee role email on password authentication
	@PostMapping("/login")
	public ResponseEntity<Employee> authenticateAndGetRole(@RequestBody Employee employee) {


		Employee tempEmployee = loginService.getEmployeerole( employee.getEmployeeId() ,employee.getEmployeePassword());

		return new ResponseEntity<Employee>(tempEmployee,HttpStatus.OK);
	}
	
}
