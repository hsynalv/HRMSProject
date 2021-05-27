package kodlamaio.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kodlamaio.HRMS.business.abstracts.JobPositionsService;
import kodlamaio.HRMS.core.utilities.results.DataResult;
import kodlamaio.HRMS.core.utilities.results.Result;
import kodlamaio.HRMS.core.utilities.results.SuccessDataResult;
import kodlamaio.HRMS.core.utilities.results.SuccessResult;
import kodlamaio.HRMS.dataAccess.abstracts.JobPositionDao;
import kodlamaio.HRMS.entities.concretes.jobPosition;

public class JobPositionManager implements JobPositionsService{

	private JobPositionDao jobPositiondao;
	
	@Autowired
	public JobPositionManager(JobPositionDao jobPositiondao) {
		this.jobPositiondao = jobPositiondao;
	}


	@Override
	public DataResult<List<jobPosition>> getAll() {
		return new SuccessDataResult<List<jobPosition>>(this.jobPositiondao.findAll(),"İş alanları listelendi.");
				
	}


	@Override
	public Result add(jobPosition jobPosition) {
		this.jobPositiondao.save(jobPosition);
		return new SuccessResult("Pozisyon başarıyla eklendi");	}

}
