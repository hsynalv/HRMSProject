package kodlamaio.HRMS.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HRMS.business.abstracts.JobSeekerService;
import kodlamaio.HRMS.core.utilities.results.DataResult;
import kodlamaio.HRMS.core.utilities.results.Result;
import kodlamaio.HRMS.entities.concretes.JobSeeker;

@RestController
@RequestMapping("/api/candidate")
public class JobSeekerControllers {
	private JobSeekerService jobSeekerService;

	public JobSeekerControllers(JobSeeker jobSeeker) {
		super();
		this.jobSeekerService = jobSeekerService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobSeeker>> getAll(){
		return this.jobSeekerService.getall();
	}
	
	@PostMapping("/register")
	public Result add(JobSeeker jobSeeker){
		return this.jobSeekerService.register(jobSeeker);
	}
}