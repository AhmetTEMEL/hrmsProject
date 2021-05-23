package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.entities.concretes.JobDetails;

public interface JobDetailsService {

	List<JobDetails> getAllJobs();
	
}
