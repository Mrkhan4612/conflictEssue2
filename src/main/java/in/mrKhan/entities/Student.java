import javax.persistence.Entity;
import javax.persistence.Id;

package in.mrKhan.entities;


@Data
@Entity
public class Student {
@Id
	private int studentId;
	
	private String name;
	
	private String city;
}
