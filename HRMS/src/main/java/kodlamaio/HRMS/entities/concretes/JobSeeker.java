package kodlamaio.HRMS.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="JobSeekers")
public class JobSeeker extends User{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;
	
	@Column(name="FirstName")
	private String name;
	
	@Column(name="LastName")
	private String lastName;
	
	@Column(name="NatIdentity")
	private String natIdentity;
	
	@Column(name="BirthDate")
	private Date birthdate;
	
	
	
	public JobSeeker() {
		super();
	}



	public JobSeeker(int id, String name, String lastName, String natIdentity, Date birthdate) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.natIdentity = natIdentity;
		this.birthdate = birthdate;
	}

	
	
	
	
}
