package in.nic.bookmytrip.repositoryImpl;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.nic.bookmytrip.repository.EmployeeRepositoryCustom;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepositoryCustom {
	
	@Autowired
	private EntityManager entityManager;
	

	@Override
	public <T> List <T> getAll(String hql, Map<String, Object> params) {
		Session currentSession = entityManager.unwrap(Session.class);
		@SuppressWarnings("unchecked")
		Query<T> query = currentSession.createQuery(hql);
		params.forEach((key,value)->{
			query.setParameter(key,value);
		});
		return query.getResultList();
	}
	

}
