package jana60Agency;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Vacanza {

	private String destinazione;
	private int giorno, mese, anno;

	public Vacanza(String destinazione, LocalDate dataInizio,LocalDate dataFine) 
	throws Exception{
		super();
		boolean parametriValidi = true;
		String errore="";
		//Valida data inizio
		try {
			validaInizioVacanza(dataInizio);
		} catch(IllegalArgumentException e) {
			parametriValidi=false;
			errore+=""+e.getMessage();
		} catch(NullPointerException e) {
			parametriValidi=false;
			errore+=""+e.getMessage();
		}
		
		
		//Valida destinazione 
		
		try {
			validaDestinazione(destinazione);
		} catch(IllegalArgumentException e) {
			parametriValidi=false;
			errore+=""+e.getMessage();
		} catch(NullPointerException e) {
			parametriValidi=false;
			errore+=""+e.getMessage();
			
		}
		
		if(parametriValidi)
		{
		this.destinazione = destinazione;
		this.giorno = giorno;
		this.mese = mese;
		this.anno = anno;
	} else  {
		throw new Exception(errore);
	}
		
	
}

	public String getDestinazione() {
		return destinazione;
	}

	public void setDestinazione(String destinazione) {
		this.destinazione = destinazione;
	}


	private void validaInizioVacanza (LocalDate dataInizio)
 throws Exception {
	if(dataInizio==null) {
		throw new Exception ("La data non può essere null");
	}
	if (dataInizio.isBefore(LocalDate.now())) {
		throw new Exception ("La data non può essere precedente a quella di oggi ");
		
	}
	}
	
	private void validaDestinazione(String destinazione ) throws Exception {
		if(destinazione==null) {
			throw new Exception("La destinazione non può essere null");
		}
	}
	
}