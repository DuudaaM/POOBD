import javax.persistence.Entity;
import javax.persistence.Id;


@Entity

public class DesignSobrancelha implements Identificavel{

	@Id
	private Long Id;
	private String Modelo;
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		Modelo = modelo;
	}
}
	