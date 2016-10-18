public class Ejercicio33 {
  public static void main(String[] args) {
    System.out.print("Pesetas: ");
    double pesetas=Double.parseDouble(System.console().readLine());
    double euros=pesetas/166.385;
    System.out.print(pesetas+"pesetas son: "+ euros + "euros");
  }
  
}
