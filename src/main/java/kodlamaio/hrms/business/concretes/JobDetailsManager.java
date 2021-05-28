package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobDetailsService;
import kodlamaio.hrms.dataAccess.abstracts.JobDetailsDao;
import kodlamaio.hrms.entities.concretes.JobDetails;

@Service
public class JobDetailsManager implements JobDetailsService{

	private JobDetailsDao jobDetailsDao;
	
	@Autowired
	public JobDetailsManager(JobDetailsDao jobDetailsDao) {
		super();
		this.jobDetailsDao = jobDetailsDao;
	}
	
	@Override
	public List<JobDetails> getAllJobs() {
		
		return jobDetailsDao.findAll();
	}

}
