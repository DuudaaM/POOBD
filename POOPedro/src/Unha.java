import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Unha {

	@Id
	private int id_Unha;
	private boolean Manicure;
	private boolean Pedicure;
	
	
	
	
	public int getId_Unha() {
		return id_Unha;
	}
	public void setId_Unha(int id_Unha) {
		this.id_Unha = id_Unha;
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
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Unha other = (Unha) obj;
		if (Manicure != other.Manicure)
			return false;
		if (Pedicure != other.Pedicure)
			return false;
		if (id_Unha != other.id_Unha)
			return false;
		return true;
	}
	
}
