package kodlamaio.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kodlamaio.HRMS.business.abstracts.JobPositionsService;
import kodlamaio.HRMS.dataAccess.abstracts.JobPositionDao;
import kodlamaio.HRMS.entities.concretes.jobPosition;

public class JobPositionManager implements JobPositionsService{

	private JobPositionDao jobPositiondao;
	
	@Autowired
	public JobPositionManager(JobPositionDao jobPositiondao) {
		this.jobPositiondao = jobPositiondao;
	}


	@Override
	public List<jobPosition> getAll() {
		return this.jobPositiondao.findAll();
	}

}
