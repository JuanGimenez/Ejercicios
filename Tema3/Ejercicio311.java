public class Ejercicio311 {
  public static void main(String[] args) {

    System.out.print("Kb: ");
    double kb = Double.parseDouble(System.console().readLine());
    System.out.println(kb + "Kb son: " +  (kb / 1024) + "Mb.");
  }
}
