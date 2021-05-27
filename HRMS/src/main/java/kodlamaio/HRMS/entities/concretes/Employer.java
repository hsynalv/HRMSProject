package kodlamaio.HRMS.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="Employers")
@Data
public class Employer extends User{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id")
	private int id;
	
	@Column(name="WebAdsress")
	private String webAdsress;
	
	@Column(name="PhoneNumber")
	private String phoneNumber;
	
	@Column(name="CompanyName")
	private String companyName;
	
	@Column(name="IsActivated")
	private String isActivated;

	public Employer() {
		super();
	}

	public Employer(int id, String webAdsress, String phoneNumber, String companyName, String isActivated) {
		super();
		this.id = id;
		this.webAdsress = webAdsress;
		this.phoneNumber = phoneNumber;
		this.companyName = companyName;
		this.isActivated = isActivated;
	}


	
	
}
