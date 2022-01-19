package in.mrKhan.entities;



import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;


@Data
@Entity
public class Student {

	@Id
	private int studentId;
	
	private String name;
	
	private String city;
}
