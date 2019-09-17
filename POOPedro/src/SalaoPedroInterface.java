import java.sql.Date;
import java.util.Calendar;

public interface SalaoPedroInterface {
	
	public Cabelo adiconarCabelo(String penteados, String quimica, String corte ) 
	throws PenteadoInvalidoException, CorteInvalidoException;
		
	
    public Agendamento agendar(Calendar agendar)
throws agendarInvalidoException;
    
    public Cliente dados (int CPF,
	 String nome,
	String Endereco,
	 int telefone,
	 String Email)
    throws nomeInvalidoException, telefoneInvalidoException, EmailInvalidoException;
    
    

	public DesignSobrancelha escolher( String Modelo );
	
	 public Maquiagem tipo( boolean Noiva,
		 boolean Formanda,
		 boolean Debutante,
		 boolean Casual);
	 
	  public Unha escolher( boolean Manicure,
		 boolean Pedicure);
		
		
			  
	 
	 
		
		
			 
	
	
	
	
		
    
    		    

    

    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	


