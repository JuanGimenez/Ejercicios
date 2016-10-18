public class Ejercicio38 {
  public static void main(String[] args) {
	System.out.print("Horas trabajadas: ");
	double horas= Double.parseDouble(System.console().readLine());
	double salario=horas*12;
	System.out.printf("Salario semanal: "+salario + " Euros");
  }
}
