package kodlamaio.hrms.apis.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobDetailsService;
import kodlamaio.hrms.entities.concretes.JobDetails;

@RestController
@RequestMapping("/api/jobDetails")
public class JobDetailsController {

	private JobDetailsService detailsService;

	@Autowired
	public JobDetailsController(JobDetailsService detailsService) {
		super();
		this.detailsService = detailsService;
	}
	
	@GetMapping("getall")
	public List<JobDetails> getAll(){
		return this.detailsService.getAllJobs();
	}
	
}
