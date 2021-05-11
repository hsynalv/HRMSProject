package kodlamaio.HRMS.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="SystemPersonnels")
public class SystemPersonnel{

	@Id
	@GeneratedValue
	@Column(name="ID")
	private int id;
	
	@Column(name="FirstName")
	private String name;
	
	@Column(name="LastName")
	private String lastName;
	
	
	public SystemPersonnel() {
		super();
	}


	public SystemPersonnel(int id, String name, String lastName) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
	}



	
}
