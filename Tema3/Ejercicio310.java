public class Ejercicio310 {
  public static void main(String[] args) {

    System.out.print("Mb: : ");
    double mb = Double.parseDouble(System.console().readLine());
    System.out.println(mb + "Mb son " +  (1024*mb) + "Kb.");
  }
}