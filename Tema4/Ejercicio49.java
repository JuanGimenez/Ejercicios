public class Ejercicio49 {
  public static void main(String[] args) {
    System.out.print("Introduzca a: ");
    double a=Double.parseDouble(System.console().readLine());
    System.out.print("Introduzca b: ");
    double b=Double.parseDouble(System.console().readLine());
    System.out.print("Introduzca c: ");
    double c=Double.parseDouble(System.console().readLine());
    if((b*b-4*a*c)<0){
      System.out.print("No tiene so2lucion. ");
    }else{
      double x1=((-b+(Math.sqrt(b*b-4*a*c)))/2);
      double x2=((-b-(Math.sqrt(b*b-4*a*c)))/2);
    
    System.out.println("x1: "+x1);
    System.out.print("x2: "+x2);
    }
  }
  
}
