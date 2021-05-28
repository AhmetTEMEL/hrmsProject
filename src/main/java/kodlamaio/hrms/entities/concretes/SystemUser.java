package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name="system_user")
@Data
@EqualsAndHashCode(callSuper = true)
public class SystemUser extends Users{

	@Column(name="user_id")
	int userId;
	
}
