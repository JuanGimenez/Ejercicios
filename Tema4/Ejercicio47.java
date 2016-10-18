public class Ejercicio47 {
  public static void main(String[] args) {
    System.out.print("Introduzca nota1: ");
    double nota1=Double.parseDouble(System.console().readLine());
    System.out.print("Introduzca nota2: ");
    double nota2=Double.parseDouble(System.console().readLine());
    System.out.print("Introduzca nota3: ");
    double nota3=Double.parseDouble(System.console().readLine());
    double media=(nota1+nota2+nota3)/3;
    System.out.print("la nota media es "+media);
  }
}
