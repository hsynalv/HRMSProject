package kodlamaio.HRMS.business.services;

import org.springframework.stereotype.Service;

import kodlamaio.HRMS.core.utilities.results.Result;
import kodlamaio.HRMS.entities.concretes.ActivationCode;

@Service
public interface EmailVerificationService {
	void generateCode(ActivationCode code, Integer id);
	Result verify(String verificationCode, Integer id);
}
