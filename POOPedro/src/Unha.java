import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity

public class Unha implements Identificavel {


	@Id
    @GeneratedValue(generator="unha_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="unha_seq", sequenceName="unha_sequencia")
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