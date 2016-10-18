public class Ejercicio43 {
  public static void main(String[] args) {
    System.out.print("Introduzca un dia de la semana(1-7): ");
    int dia = Integer.parseInt(System.console().readLine());
    String diaSemana;
    switch(dia){
    case 1:
      diaSemana=" Lunes ";
      break;
    case 2:
      diaSemana=" Martes ";
      break;
    case 3:
      diaSemana=" Miercoles";
      break;
    case 4:
      diaSemana=" Jueves";
      break;
    case 5:
      diaSemana=" Viernes";
      break;
    case 6:
      diaSemana=" Sabado";
      break;
    case 7:
      diaSemana=" Domingo";
      break;
    default:
      diaSemana ="No existe ese dia.";
    }
  System.out.print(diaSemana);
  }
}
