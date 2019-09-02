import javax.persistence.Entity;

 @Entity
public class Cabelo implements Identificavel{

 
	 @javax.persistence.Id
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
