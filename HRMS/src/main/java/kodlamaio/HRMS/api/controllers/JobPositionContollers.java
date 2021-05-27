package kodlamaio.HRMS.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import kodlamaio.HRMS.business.abstracts.JobPositionsService;
import kodlamaio.HRMS.core.utilities.results.DataResult;
import kodlamaio.HRMS.entities.concretes.jobPosition;

@RestControllerAdvice
@RequestMapping("api/jobPosition")
public class JobPositionContollers {

	private JobPositionsService jobPositionservice;

	@Autowired
	public JobPositionContollers(JobPositionsService jobPositionservice) {
		this.jobPositionservice = jobPositionservice;
	}
	
	@GetMapping("/getall")
	public DataResult<List<jobPosition>> getAll(){
		
		return this.jobPositionservice.getAll();
	}
}
