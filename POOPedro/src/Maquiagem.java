import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Maquiagem {

	@Id
	private int id_Maquiagem;
	private boolean Noiva;
	private boolean Formanda;
	private boolean Debutante;
	private boolean Casual;
	
	public int getId_Maquiagem() {
		return id_Maquiagem;
	}
	public void setId_Maquiagem(int id_Maquiagem) {
		this.id_Maquiagem = id_Maquiagem;
	}
	public boolean isNoiva() {
		return Noiva;
	}
	public void setNoiva(boolean noiva) {
		Noiva = noiva;
	}
	public boolean isFormanda() {
		return Formanda;
	}
	public void setFormanda(boolean formanda) {
		Formanda = formanda;
	}
	public boolean isDebutante() {
		return Debutante;
	}
	public void setDebutante(boolean debutante) {
		Debutante = debutante;
	}
	public boolean isCasual() {
		return Casual;
	}
	public void setCasual(boolean casual) {
		Casual = casual;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Maquiagem other = (Maquiagem) obj;
		if (Casual != other.Casual)
			return false;
		if (Debutante != other.Debutante)
			return false;
		if (Formanda != other.Formanda)
			return false;
		if (Noiva != other.Noiva)
			return false;
		if (id_Maquiagem != other.id_Maquiagem)
			return false;
		return true;
	}
	

}
