import javax.persistence.Entity;
import javax.persistence.Id;

  @Entity
public class DesignSobrancelha {

	@Id
	private Integer id_Sobrancelha;
	private String Modelo;
	
	
	public int getId_Sobrancelha() {
		return id_Sobrancelha;
	}
	public void setId_Sobrancelha(int id_Sobrancelha) {
		this.id_Sobrancelha = id_Sobrancelha;
	}
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		Modelo = modelo;
	}
}
