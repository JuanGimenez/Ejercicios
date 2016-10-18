public class Ejercicio35 {
  public static void main(String[] args) {
    System.out.print("Base del rectangulo: ");
    double base=Double.parseDouble(System.console().readLine());
    System.out.print("Altura del rectangulo: ");
    double altura=Double.parseDouble(System.console().readLine());
    double area=base*altura;
    System.out.print("el area del rectangulo es: "+(area)+"m²");
  }
}
