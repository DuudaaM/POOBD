import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Maquiagem implements Identificavel{

	@Id
    @GeneratedValue(generator="maquiagem_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="maquiagem_seq", sequenceName="maquiagem_sequencia")
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
