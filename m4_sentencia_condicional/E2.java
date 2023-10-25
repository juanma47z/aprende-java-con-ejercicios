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
public class E2 {
  public static void main(String[] args) {
    /*
    Realiza un programa que pida una hora por teclado y que muestre luego buenos
días, buenas tardes o buenas noches según la hora. Se utilizarán los tramos de
6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en cuenta las
horas, los minutos no se deben introducir por teclado.
    */
    
    //dato entrada: hora 
    //algoritmo:BD si la hora de 6 a 12, BT si la hora es de 13 a 20 y BN si la hora es de 21 a 23
    //dato salida: lo de arriba pero imprimir en pantalla
    
    Scanner read = new Scanner(System.in);
    int horaUsuario;
    
    System.out.println("Dime que hora tienes.");
    
    horaUsuario = read.nextInt();
    
    
   if( horaUsuario >= 6 && horaUsuario <= 12 ){
     System.out.println("Buenos Dias");
   }else if( horaUsuario >= 13 && horaUsuario <= 20){
     System.out.println("Buenas Tardes");
   }else if( horaUsuario >= 21 && horaUsuario <=23){
     System.out.println("Buenas Noches");
   }else{
     System.out.println("Debes estar durmiendo.");
   }
    
    
  }
}
