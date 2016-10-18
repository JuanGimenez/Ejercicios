public class Ejercicio37 {
  public static void main(String[] args) {

	System.out.print("Precio producto(sin IVA): ");
	double baseImponible=Double.parseDouble(System.console().readLine());
	double iva=baseImponible*0.21;
	System.out.printf("Precio con IVA: "+ baseImponible +" + "+ iva + "=" + (baseImponible+iva));
  }
}
	
