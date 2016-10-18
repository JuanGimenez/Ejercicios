public class Ejercicio36 {
  public static void main(String[] args) {
	System.out.print("Base del triangulo: ");
	double base=Double.parseDouble(System.console().readLine());
	System.out.print("Altura del triangulo: ");
	double altura=Double.parseDouble(System.console().readLine());
	double area=(base*altura)/2;
	System.out.print("el area del triangulo es: "+(area)+"m²");
  }
}
