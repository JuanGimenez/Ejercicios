public class Ejercicio45 {
  public static void main(String[] args) {
    System.out.print("Introduzca a: ");
    double a=Double.parseDouble(System.console().readLine());
    System.out.print("Introduzca b: ");
    double b=Double.parseDouble(System.console().readLine());
    double x=(-b/a);
    System.out.print("x= "+x);
  }
}
