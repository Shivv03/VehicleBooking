package in.nic.bookmytrip.dao;

import java.util.List;
import java.util.Map;

public interface EmployeeRepositoryCustom{
	
	<T>List<T> getAll(String hql,Map<String,Object> params);

}
