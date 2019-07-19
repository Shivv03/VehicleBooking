package in.nic.bookmytrip.daoImpl;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.nic.bookmytrip.dao.EmployeeRepositoryCustom;

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

	/*@Override
	public VehicleBookingForm populateFormData() {
		
		//get current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		
		List<DefaultBookingProperties> bookingProperties = currentSession.createQuery("from DefaultBookingProperties", DefaultBookingProperties.class).getResultList();
		List<MeetingPurpose> meetingPurpose = currentSession.createQuery("from MeetingPurpose", MeetingPurpose.class).getResultList();
		List<OfficialsCount> officialsCount = currentSession.createQuery("from OfficialsCount", OfficialsCount.class).getResultList();
		List<MeetingLocations> registeredLocations = currentSession.createQuery("from MeetingLocations", MeetingLocations.class).getResultList();
		List<TripMode> TripMode = currentSession.createQuery("from TripMode", TripMode.class).getResultList();
		
		//Parsing TimeStamp from DB to a different format using SQL Query
		String startTime_Query = "select id,to_char(start_time,'HH12:MI am') as start_time  from mst_vehicle_time ORDER BY id";
		List<VehicleTimings> bookingTimings= (List<VehicleTimings>) currentSession.createNativeQuery(startTime_Query, VehicleTimings.class).getResultList();
		.addScalar("code", new StringType())
	            .addScalar("timings", new StringType()).setResultTransformer(Transformers.aliasToBean(VehicleTimings.class));
	      
		setResultTransformer(Transformers.aliasToBean(VehicleTimings.class)).getResultList();

		String endTime_Query = "select to_char(start_time,'HH12:MI am') as char_end_time from mst_vehicle_time ORDER BY id";
		@SuppressWarnings("unchecked")
		List<VehicleTimings> endTimings= currentSession.createSQLQuery(endTime_Query).getResultList();

		
		VehicleBookingForm VehicleBookingForm = new 
								VehicleBookingForm(
								officialsCount,
								TripMode,
								bookingTimings,
								registeredLocations,
								meetingPurpose,
								bookingProperties);
		return VehicleBookingForm;
	}*/

}
