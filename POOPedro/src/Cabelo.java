import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cabelo {

	
	
	@Id
	private int Id_Cabelo;
	private String Penteados;
	private boolean Quimica;
	private String Corte;
	
	public int getId_Cabelo() {
		return Id_Cabelo;
	}
	public void setId_Cabelo(int id_Cabelo) {
		Id_Cabelo = id_Cabelo;
	}
	public String getPenteados() {
		return Penteados;
	}
	public void setPenteados(String penteados) {
		Penteados = penteados;
	}
	public boolean isQuimica() {
		return Quimica;
	}
	public void setQuimica(boolean quimica) {
		Quimica = quimica;
	}
	public String getCorte() {
		return Corte;
	}
	public void setCorte(String corte) {
		Corte = corte;
	}
	

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Cabelo other = (Cabelo) obj;
	if (Corte == null) {
		if (other.Corte != null)
			return false;
	} else if (!Corte.equals(other.Corte))
		return false;
	if (Id_Cabelo != other.Id_Cabelo)
		return false;
	if (Penteados == null) {
		if (other.Penteados != null)
			return false;
	} else if (!Penteados.equals(other.Penteados))
		return false;
	if (Quimica != other.Quimica)
		return false;
	return true;
}
}
