package RepasoClases;
import java.util.*;
public class MainCuenta {

	public static void main(String[] args) {
		Cuenta c1=new Cuenta();
		c1.setTitular("Macauli kulking solito en casa");
		c1.setCantidad(2000.0);
		System.out.println("El titular de la cuenta es: " +  c1.getTitular());
		System.out.println("El saldo de la cuenta es: " + c1.getCantidad());
		
		c1.Ingresar(2000.0);
		System.out.println("El saldo de la cuenta es: " + c1.getCantidad());
		c1.Ingresar(-3000.0);
		System.out.println("El saldo de la cuenta es: " + c1.getCantidad());
		
		c1.Retirar(300.0);
		System.out.println("El saldo de la cuenta es: " + c1.getCantidad());
		c1.Retirar(66000);		
		System.out.println("El saldo de la cuenta es: " + c1.getCantidad());

	}

}
