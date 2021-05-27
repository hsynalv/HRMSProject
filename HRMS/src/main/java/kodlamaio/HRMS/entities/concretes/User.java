package kodlamaio.HRMS.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id")
	private int id;
	
	@Column(name="EMail")
	private String eMail;
	
	@Column(name="Password")
	private String password;

	public User() {
		super();
	}

	public User(int id, String eMail, String password) {
		super();
		this.id = id;
		this.eMail = eMail;
		this.password = password;
	}
	
	
	
}
