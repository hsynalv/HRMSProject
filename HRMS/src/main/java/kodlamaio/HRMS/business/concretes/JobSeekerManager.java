package kodlamaio.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kodlamaio.HRMS.business.abstracts.JobSeekerService;
import kodlamaio.HRMS.business.services.EmailVerificationService;
import kodlamaio.HRMS.core.utilities.results.DataResult;
import kodlamaio.HRMS.core.utilities.results.ErrorResult;
import kodlamaio.HRMS.core.utilities.results.Result;
import kodlamaio.HRMS.core.utilities.results.SuccessDataResult;
import kodlamaio.HRMS.core.utilities.results.SuccessResult;
import kodlamaio.HRMS.dataAccess.abstracts.JobSeekerDao;
import kodlamaio.HRMS.entities.concretes.ActivationCode;
import kodlamaio.HRMS.entities.concretes.Employer;
import kodlamaio.HRMS.entities.concretes.JobSeeker;

public class JobSeekerManager implements JobSeekerService{

	private JobSeekerDao jobSeekerDao;
	private EmailVerificationService emailVerificationService;
	
	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao, EmailVerificationService emailVerificationService) {
		super();
		this.jobSeekerDao = jobSeekerDao;
		this.emailVerificationService = emailVerificationService;
	}

	@Override
	public DataResult<List<JobSeeker>> getall() {
		return new SuccessDataResult<List<JobSeeker>>(this.jobSeekerDao.findAll(), "İş arayanlar listelendi...");
	}

	@Override
	public Result register(JobSeeker jobSeeker) {
		if (!checkIfExistBefore(jobSeeker)) {
			return new ErrorResult("Bu kullanıcı sistemde zaten kayıtlı");
		}
		
		this.emailVerificationService.generateCode(new ActivationCode(),jobSeeker.getId());
		return new SuccessDataResult<JobSeeker>(this.jobSeekerDao.save(jobSeeker),"Hesap eklendi, doğrulama kodu gönderildi ID:"+jobSeeker.getId());
	}
	
	private boolean checkIfExistBefore(JobSeeker jobSeeker) {
		List<JobSeeker> jobSeekers = this.jobSeekerDao.findAll();
		
		for (JobSeeker _jobSeeker : jobSeekers) {
			if (jobSeeker.getEMail().equals(_jobSeeker.getEMail())) {
				return false;
			}
			if (jobSeeker.getNatIdentity() == _jobSeeker.getNatIdentity()) {
				return false;
			}
		}
		return true;
	}


}
