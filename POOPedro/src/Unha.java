import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Unha {


	 @Id
	private Long Id;
	private boolean Manicure;
	private boolean Pedicure;
	
	
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public boolean isManicure() {
		return Manicure;
	}
	public void setManicure(boolean manicure) {
		Manicure = manicure;
	}
	public boolean isPedicure() {
		return Pedicure;
	}
	public void setPedicure(boolean pedicure) {
		Pedicure = pedicure;
	}
	
}