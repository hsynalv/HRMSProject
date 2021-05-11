package kodlamaio.HRMS.business.abstracts;

import java.util.List;

import kodlamaio.HRMS.entities.concretes.jobPosition;

public interface JobPositionsService {

	List<jobPosition> getAll();
	
}
