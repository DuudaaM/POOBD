import java.sql.Date;
import java.util.Calendar;

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
	private Calendar agendar;
	@OneToMany

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Calendar getAgendar() {
		return agendar;
	}
	public void setAgendar(Calendar agendar) {
		this.agendar = agendar;
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
		if (agendar == null) {
			if (other.agendar != null)
				return false;
		} else if (!agendar.equals(other.agendar))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	

}
