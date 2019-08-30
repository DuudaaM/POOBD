import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DesignSobrancelha {

	@Id
	private int id_Sobrancelha;
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
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DesignSobrancelha other = (DesignSobrancelha) obj;
		if (Modelo == null) {
			if (other.Modelo != null)
				return false;
		} else if (!Modelo.equals(other.Modelo))
			return false;
		if (id_Sobrancelha != other.id_Sobrancelha)
			return false;
		return true;
	}
	
}
