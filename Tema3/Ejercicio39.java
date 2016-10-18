public class Ejercicio39 {

  static final double pi = 3.141592654;
 
  
  public static void main(String[] args) {
	System.out.print("Altura: ");
	double altura= Double.parseDouble(System.console().readLine());
	System.out.print("Radio: ");
	double radio=Double.parseDouble(System.console().readLine());
	double volumen=(pi*radio*radio*altura)/3;
	System.out.print("El volumen del cono es: "+ volumen);
  }
}
