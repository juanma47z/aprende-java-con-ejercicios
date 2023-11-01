/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m5_bucles;

import java.util.Scanner;

/**
 *
 * @author JM
 */
public class E8 {
  public static void main(String[] args) {
     /*
  Muestra la tabla de multiplicar de un número introducido por teclado.
  */
     
  Scanner leer = new Scanner(System.in);
  
  int multiplicando;
  int producto;
  
    System.out.println("Digite que numero desea ver la tabla de multiplicar");
    
    multiplicando = leer.nextInt();

    for(int multiplicador =1; multiplicador <= 10; multiplicador++){
      producto = multiplicando * multiplicador;
      System.out.println(multiplicando + " * " + multiplicador + " = " + producto);
    }
    
  }
  
}
