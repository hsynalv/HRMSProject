package kodlamaio.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HRMS.entities.concretes.jobPosition;

public interface JobPositionDao extends JpaRepository<jobPosition, Integer>{

}
