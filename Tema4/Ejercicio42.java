public class Ejercicio42 {
  public static void main(String[] args) {
    System.out.print("Por favor, introduce una hora: ");
    int x = Integer.parseInt( System.console().readLine() );
    
    if ((x >=6)&&(x<12)) {
      System.out.print("Buenos días.");
    }
    if ((x == 12) || ((x>=13)&&(x<20))) {
      System.out.print("Buenas tardes");
    }
    if ((x>=20)&&(x<6)){
      System.out.print("buenas noches");
    }
  }
}
