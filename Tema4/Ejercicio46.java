public class Ejercicio46 {
  public static void main(String[] args) {
    System.out.print("Introduzca la altura del objeto: ");
    double h=Double.parseDouble(System.console().readLine());
    double g=9.81;
    double t=Math.sqrt((2*h)/g); 
    System.out.print("El objeto tarda en caer "+t+" segundos");
    
  }
}
