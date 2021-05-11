package kodlamaio.HRMS.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="JobPositions")
@Data
public class jobPosition {

	@Id
	@GeneratedValue
	@Column(name="Id")
	private int id;
	
	@Column(name="Position")
	private String positionName;
	
	@Column(name="PositionDescription")
	private String PositionDescription;

	public jobPosition() {
		super();
	}

	public jobPosition(int id, String positionName, String positionDescription) {
		super();
		this.id = id;
		this.positionName = positionName;
		PositionDescription = positionDescription;
	}
	
	
}
