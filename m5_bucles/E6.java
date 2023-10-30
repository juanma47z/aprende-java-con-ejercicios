/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m5_bucles;

/**
 *
 * @author JM
 */
public class E6 {
  public static void main(String[] args) {
    /*
    Muestra los números del 320 al 160, contando de 20 en 20 utilizando un bucle
do-while.
    */
    int valorInicial = 320;
    
    do{
      System.out.println(valorInicial);
      valorInicial -= 20;
    }while(valorInicial >= 160);
    
  }
}
