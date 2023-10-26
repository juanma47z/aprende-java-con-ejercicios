/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m4_sentencia_condicional;

import java.util.Scanner;

/**
 *
 * @author JM
 */
public class E3 {

  public static void main(String[] args) {
    /*
    Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente nombre del día de la semana.
     */

    //dato entrada: numero
    //algoritmo: recibe un num, verifica si el numero es acorde a un dia de la semana, si lo es imprime ese dia, si no nada.
    //dato salida: nombre dia de la seamana (lun a dom)
    
    Scanner read = new Scanner(System.in);
    
    int numUsuario;
    String diaDeLaSemana;
    
    System.out.println("Digite que numero tienes y te dire que dia de la semana es: ");
    numUsuario = read.nextInt();
    
    switch(numUsuario){
      case 1:
        diaDeLaSemana = "Monday";
        break;
      case 2:
        diaDeLaSemana = "Tuesday";
        break;
      case 3:
        diaDeLaSemana = "Wendesday";
        break;
      case 4:
        diaDeLaSemana = "Thursday";
        break;
      case 5:
        diaDeLaSemana = "Friday";
        break;
      case 6:
        diaDeLaSemana = "Saturday";
        break;
      case 7:
        diaDeLaSemana = "Sunday";
        break;
      default:
        diaDeLaSemana = "No existe ese dia";
    }
    
    System.out.println("El dia de la semana es " + diaDeLaSemana + ".");
  }
}
