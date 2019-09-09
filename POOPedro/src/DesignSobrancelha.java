import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;


@Entity

public class DesignSobrancelha implements Identificavel{

	@Id
    @GeneratedValue(generator="DesignSobrancelha_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="DesignSobrancelha_seq", sequenceName="DesignSobrancelha_sequencia")
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
	