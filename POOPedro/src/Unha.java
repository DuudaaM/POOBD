import javax.persistence.Entity;
import javax.persistence.Id;

   @Entity
public class Unha {

	 @Id
	private Integer id_Unha;
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
}
