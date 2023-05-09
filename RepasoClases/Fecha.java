//CARLOS JAVIER VICENTE MARTINEZ

package RepasoClases;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Fecha {
	private LocalDate valor;
	public Fecha() {
		
	}
	public Fecha (LocalDate fecha){
		this.valor=fecha;
		
	}
	public Fecha(Fecha fecha) {
		this.valor=fecha.valor;
		
	}
	public void setValor (LocalDate valor) {
		this.valor=valor;
		
		
	}
	public LocalDate getValor() {
		return this.valor;
		
	}
	public String toString() {
		return "La fecha actual de tu muerte es "+ this.valor+ "RIP";
		
	}
	public boolean CheckFecha() {
		return this.valor==LocalDate.now();
	}
	public void ModiFecha() {
		this.valor=this.valor.plusDays(1);
		
	}
	
	
}
