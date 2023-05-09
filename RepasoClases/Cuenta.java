package RepasoClases;
import java.util.*;

public class Cuenta {
private String titular;
private double cantidad;
public String getTitular() {
	return titular;
}
public void setTitular(String titular) {
	this.titular = titular;
}
public double getCantidad() {
	return cantidad;
}
public void setCantidad(double cantidad) {
	this.cantidad = cantidad;
}
@Override
public String toString() {
	return "Cuenta [titular=" + titular + ", cantidad=" + cantidad + "]";
}
public Cuenta(String titular) {
	super();
	this.titular = titular;
}
public Cuenta (String titular,double cantidad) {
	this.titular=titular;
	this.cantidad = cantidad;
}


public void Ingresar (double cantidad) {
	
	if (cantidad>=0) {
		setCantidad(this.cantidad+cantidad);
	}
}
public void Retirar(double cantidad) {
	this.cantidad=this.cantidad-cantidad;
	if (this.cantidad<0) {
		this.cantidad = 0;
	}
	
	//if (this.cantidad-cantidad <0)
	//	this.cantidad = 0;
	//else
	//	this.cantidad= this.cantidad-cantidad;	
}
}
