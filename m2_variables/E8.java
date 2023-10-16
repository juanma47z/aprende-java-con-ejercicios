/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m2_variables;

/**
 *
 * @author JM
 */
public class E8 {
  public static void main(String[] args) {
     /*
  Escribe un programa que declare 5 variables de tipo char. A continuación, crea
otra variable como cadena de caracteres y asígnale como valor la concatenación de las anteriores 5 variables. Por último, muestra la cadena de caracteres
por pantalla ¿Qué problemas te encuentras? ¿cómo lo has solucionado?
  */
  
  char var1 = 'a';
  char var2 = 'b';
  char var3 = 'c';
  char var4 = 'd';
  char var5 = 'e';
  
  String concatenacionFinal = " " + var1 + var2 + var3 + var4 + var5;
    System.out.println(concatenacionFinal);
  /*
  ¿Qué problemas te encuentras?
  R: Al no asignarle ningun valor, el IDE me marca error.
  Le asigne un valor a cada char pero me sigue dando error.
  
   ¿cómo lo has solucionado?
    R: Agregue un string vacio al principio.
  */
  }
 
}
