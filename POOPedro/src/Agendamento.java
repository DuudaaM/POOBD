import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity

public class Agendamento implements Identificavel  {
	
	@Id
    @GeneratedValue(generator="agendamento_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="agendamento_seq", sequenceName = "agendamento_sequencia")
	private Long id;
	private Date diasemana;
	private int hora;
	private String local;

	@OneToMany
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Date getDiasemana() {
		return diasemana;
	}

	public void setDiasemana(Date diasemana) {
		this.diasemana = diasemana;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Agendamento other = (Agendamento) obj;
		if (diasemana == null) {
			if (other.diasemana != null)
				return false;
		} else if (!diasemana.equals(other.diasemana))
			return false;
		if (hora != other.hora)
			return false;
		if (id != other.id)
			return false;
		if (local == null) {
			if (other.local != null)
				return false;
		} else if (!local.equals(other.local))
			return false;
		return true;
	}

}
