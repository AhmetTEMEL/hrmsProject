package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name="candidate")
@Data
@EqualsAndHashCode(callSuper = true)
public class Candidate extends Users{

	@Column(name="applicant_id")
	int applicantId;
	
}
