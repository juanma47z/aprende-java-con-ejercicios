/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m2_variables;

/**
 *
 * @author JM
 */
public class E4 {
  public static void main(String[] args) {
   /*
  Realiza un conversor de pesos a dolares. La cantidad en pesos que se quiere
convertir deberá estar almacenada en una variable.
  */
  
  int pesoArg = 1;
  double dolarAmerican = 0.0029;
  
  double conversorPesoArgADolarAmerican = (double) pesoArg * dolarAmerican;
    System.out.println("Si tienes 1 peso arg, tendras " + conversorPesoArgADolarAmerican + " dolares ");
  
    }
}
