import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Maquiagem implements Identificavel{

	@Id

	private Long Id;
	private boolean Noiva;
	private boolean Formanda;
	private boolean Debutante;
	private boolean Casual;
	
	
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
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
	
	
	
}
