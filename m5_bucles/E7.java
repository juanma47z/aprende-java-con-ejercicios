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
public class E7 {
  public static void main(String[] args) {
    /*
    Realiza el control de acceso a una caja fuerte. La combinación será un
número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
Tendremos cuatro oportunidades para abrir la caja fuerte.
    */
        
    Scanner leer = new Scanner(System.in);
    
    long combinacionCajaFuerte = 1234;
    long combinacionUsuario;
    int intentosRestantes = 4;
    
    for(int i=1; i <= 4; i++){
      
      System.out.println("Digite la combinacion de la caja fuerte:");
      combinacionUsuario = leer.nextInt();
      
      if(combinacionUsuario != combinacionCajaFuerte){
        System.out.println("Lo siento, esa no es la combinación.");
        intentosRestantes--;
        
        if(intentosRestantes > 0){
          System.out.println("Te quedan " + intentosRestantes + " intentos restantes.");
        }else{
          System.out.println("Se han agotado los intentos. Lo siento, esa no es la combinación.");
          break;
        }
 
      }else{
        System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
        break;
      }
      
      
    }

       
      
    
      
  }
}
