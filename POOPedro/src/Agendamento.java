import java.sql.Date;

public class Agendamento {

	private Date diasemana;
	private int hora;
	private String local;
	
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
}
