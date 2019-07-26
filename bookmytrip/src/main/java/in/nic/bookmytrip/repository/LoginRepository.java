package in.nic.bookmytrip.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import in.nic.bookmytrip.pojo.Employee;

public interface LoginRepository extends JpaRepository<Employee, String>  {
	
	//JPArepository provides all CRUD methods
	
	 @Query("select new Employee(e.employeeId,e.employeeName) from Employee e where e.employeeEmail = :emailId ")
	 Employee getEmployeeByEmail(@Param("emailId") String emailId);
	 
	 @Query("select new Employee(e.employeeId,e.employeeName,e.employeeMobile,e.employeeRole) from Employee e where e.employeePassword = :employeePassword and e.employeeId = :employeeId")
	 Employee getEmployeeRole(@Param("employeeId") String employeeId,@Param("employeePassword") String employeePassword);

}
