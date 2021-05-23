package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;


@Entity
@Table(name="employee")
@Data
@EqualsAndHashCode(callSuper = true)
public class Employee extends Users{

	@Column(name="empoyee_id")
	int empoyeeId;
	
	@Column(name="web_site")
	String webSite;
	
	@Column(name="company_name")
	String companyName;
	
	@Column(name="phone")
	String phone;
	
}
