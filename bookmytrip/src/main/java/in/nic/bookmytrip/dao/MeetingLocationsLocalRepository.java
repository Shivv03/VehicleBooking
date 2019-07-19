package in.nic.bookmytrip.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import in.nic.bookmytrip.pojo.MeetingLocationsLocal;

public interface MeetingLocationsLocalRepository extends JpaRepository<MeetingLocationsLocal, Integer> {
	
	@Query("select count(M)>0 from MeetingLocationsLocal M where M.locationDesc=:locationDesc and M.employeeId=:employeeId")
	public boolean checkExistance(@Param("locationDesc") String locationDesc,@Param("employeeId") String employeeId );
	
	
}
