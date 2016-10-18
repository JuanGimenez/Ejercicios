public class Ejercicio34 {
  public static void main(String[] args) {
    System.out.print("introduce un numero1: ");
    double numero1=Double.parseDouble(System.console().readLine());
    System.out.print("Introduce numero2: ");
    double numero2=Double.parseDouble(System.console().readLine());
    double suma=numero1+numero2;
    double resta=numero1-numero2;
    double multiplicacion=numero1*numero2;
    double division=numero1/numero2;
    System.out.print("numero1+numero2= " + numero1 + "+" + numero2 + "=" + suma+"\n");
    System.out.print("numero1-numero2= " + numero1 + "-" + numero2 + "=" + resta+"\n");
    System.out.print("numero1*numero2= " + numero1 + "*" + numero2 + "=" + multiplicacion+"\n");
    System.out.print("numero1/numero2= " + numero1 + "/" + numero2 + "=" + division+"\n");
    }
}
