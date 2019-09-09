import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
 @Entity
public class Cabelo implements Identificavel{

 
	@Id
    @GeneratedValue(generator="cabelo_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="cabelo_seq", sequenceName= "cabelo_sequencia")
	private Long Id;
	private String Penteados;
	private boolean Quimica;
	private String Corte;
	
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
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
	


}
