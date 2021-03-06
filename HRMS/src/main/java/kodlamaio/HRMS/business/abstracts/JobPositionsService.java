package kodlamaio.HRMS.business.abstracts;

import java.util.List;

import kodlamaio.HRMS.core.utilities.results.DataResult;
import kodlamaio.HRMS.core.utilities.results.Result;
import kodlamaio.HRMS.entities.concretes.jobPosition;

public interface JobPositionsService {

	DataResult<List<jobPosition>> getAll();
	
	Result add(jobPosition jobPosition);
	
}
