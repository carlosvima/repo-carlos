//CARLOS JAVIER VICENTE MARTINEZ

package RepasoClases;

public class Contador {
	private double valor;

	public Contador () {
		
	}
	public Contador(double valor) {
		this.valor=valor;
		
	}
	public Contador(Contador contador) {
		contador.valor=this.getValor();
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public void Incrementar() {
		this.valor=valor+1.0;
	}
	public void Decrementar() {
		this.valor--;
	}

}
