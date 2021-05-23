package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="job_details")
@Data
public class JobDetails {

	@Id
	@GeneratedValue
	@Column(name="id")
	int id;
	
	@Column(name="job_name")
	String jobName;

	
}
