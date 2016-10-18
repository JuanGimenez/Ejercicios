public class Ejercicio44 {
  public static void main(String[] args) {
    System.out.print("Horas trabajadas: ");
    double horas= Double.parseDouble(System.console().readLine());
    if (horas<=40){
    double salario=horas*12;
    System.out.printf("Salario semanal: "+salario + " Euros");
    }
    if (horas>40){
      double salario=(((horas-40)*16)+480);
    System.out.printf("Salario semanal:"+ salario + "Euros");
    }
  }
}
