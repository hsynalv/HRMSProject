package kodlamaio.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kodlamaio.HRMS.business.abstracts.EmployerService;
import kodlamaio.HRMS.business.services.EmailVerificationService;
import kodlamaio.HRMS.core.utilities.results.DataResult;
import kodlamaio.HRMS.core.utilities.results.ErrorResult;
import kodlamaio.HRMS.core.utilities.results.Result;
import kodlamaio.HRMS.core.utilities.results.SuccessDataResult;
import kodlamaio.HRMS.core.utilities.results.SuccessResult;
import kodlamaio.HRMS.dataAccess.abstracts.EmployerDao;
import kodlamaio.HRMS.entities.concretes.ActivationCode;
import kodlamaio.HRMS.entities.concretes.Employer;

public class EmployerManager implements EmployerService{

	private EmployerDao employerDao;
	private EmailVerificationService emailVerificationService;
	
	@Autowired
	public EmployerManager(EmployerDao employerDao, EmailVerificationService emailVerificationService) {
		this.employerDao = employerDao;
		this.emailVerificationService = emailVerificationService;
	}
	
	@Override
	public DataResult<List<Employer>> getall() {
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(), "İş verenler listelendi...");
	}

	@Override
	public Result register(Employer employer) {
		if (!checkIfExistBefore(employer)) {
			return new ErrorResult("Bu kullanıcı sistemde zaten kayıtlı");
		}
		
		this.emailVerificationService.generateCode(new ActivationCode(),employer.getId());
		return new SuccessDataResult<Employer>(this.employerDao.save(employer),"İş veren hesabı eklendi, doğrulama kodu gönderildi ID:"+employer.getId());
		
	}
	
	private boolean checkIfExistBefore(Employer employer) {
		List<Employer> employers = this.employerDao.findAll();
		
		for (Employer _employer : employers) {
			if (employer.getEMail().equals(_employer.getEMail())) {
				return false;
			}
		}
		return true;
	}

}









