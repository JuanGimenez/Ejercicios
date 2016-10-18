public class Ejercicio48 {
  public static void main(String[] args) {
    System.out.print("Introduzca nota1: ");
    double nota1=Double.parseDouble(System.console().readLine());
    System.out.print("Introduzca nota2: ");
    double nota2=Double.parseDouble(System.console().readLine());
    System.out.print("Introduzca nota3: ");
    double nota3=Double.parseDouble(System.console().readLine());
    double media=(nota1+nota2+nota3)/3;
      if (media<5){
        System.out.print("Suspenso.");
      }
      else if(media>=5 &&media<6){
        System.out.print("Suficiente: "+ media);
      }
      else if (media>=6&&media<7){
        System.out.print("bien: "+media);
      }
      else if (media>=7 && media<9){
        System.out.print("Notable: "+media);
      }
      else if ( media>=9 && media<10){
        System.out.print("Sobresaliente: "+media);
      }else{
        System.out.print("Esa nota no existe.");
      }
  }
}
