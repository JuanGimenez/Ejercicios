public class Ejercicio31 {
  public static void main(String[] args){
    String linea;
  
    System.out.print("Escriba un numero: ");
    linea=System.console().readLine();
    int primerNumero;
    primerNumero=Integer.parseInt(linea);
    System.out.print("Escriba segundo numero: ");
    linea=System.console().readLine();
    int segundoNumero;
    segundoNumero=Integer.parseInt(linea);
    int total;
    total= primerNumero*segundoNumero;
    System.out.print(primerNumero + "*" + segundoNumero + "=" + total);
  
  
  
  }
}
