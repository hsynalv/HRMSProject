package kodlamaio.HRMS.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="ActivationCodes")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActivationCode{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id")
	private int id;
	
	@Column(name="activationCode")
	private String activationCode;
	
	@Column(name="IsConfirmed")
	private boolean isConfirmed;
	
	@Column(name="CompanyName")
	private String companyName;
	
	@Column(name="ConfirmedDate")
	private Date confirmedDate;
}
